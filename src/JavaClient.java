/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonle
 */
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import thriftDemo.*;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TTransportException;

public class JavaClient {

    private static final int NUM_OF_REQS = 1000;
    private static long startTime, stopTime;

//    private static void startBenchmark() {
//        startTime = System.currentTimeMillis();
//    }
//
//    private static void finishBenchmark() {
//        stopTime = System.currentTimeMillis();
//        double elapsedTimeSec = (double) (stopTime - startTime) / 1000;
//        double reqPerSec = (double) NUM_OF_REQS / elapsedTimeSec;
//        System.out.println("=== RESULT ===");
//        System.out.println("> elapsedTimeSec: " + elapsedTimeSec);
//        System.out.println("> Req/s: " + reqPerSec);
//    }

    public static void main(String[] args) throws InterruptedException {
        ClientThread[] clientThreads = new ClientThread[NUM_OF_REQS];
//        startBenchmark();
        boolean isDone = false;
        for (int i = 0; i < NUM_OF_REQS; i++) {
            clientThreads[i] = new ClientThread("test" + i);
            clientThreads[i].start();
        }

        while (!isDone) {
            int count = 0;
            for (ClientThread t : clientThreads) {
                if (t.isDone()) {
                    count++;
                }
            }
            System.out.println("> count = " + count);
            if (count == NUM_OF_REQS) {
                isDone = true;
            }
        }
        
        long totalRTT = 0;
        for (ClientThread t : clientThreads) {
            totalRTT += t.rtt;
        }
        System.out.println("=== RESULT ===");
        System.out.println("> average ping time (ms): " + (double)totalRTT/(double)NUM_OF_REQS);

//        finishBenchmark();
    }

//    static class ClientRunnable implements Runnable {
//            
//        private Thread t;
//        private String threadName;
//
//        ClientRunnable(String name) {
//            threadName = name;
//            System.out.println("Creating " + threadName);
//        }
//
//        public void run() {
//            System.out.println("Running " + threadName);
//            try {
//                TTransport transport;
//                transport = new TSocket("localhost", 9090);
//                transport.open();
//                TProtocol protocol = new TBinaryProtocol(transport);
//                APIs.Client client = new APIs.Client(protocol);
//                perform(client, transport);
//            } catch (TTransportException ex) {
//                Logger.getLogger(JavaClient.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (TException ex) {
//                Logger.getLogger(JavaClient.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(JavaClient.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println("Thread " + threadName + " exiting.");
//        }
//
//        public void start() {
//            System.out.println("Starting " + threadName);
//            if (t == null) {
//                t = new Thread(this, threadName);
//                t.start();
//            }
//        }
//
//        private void perform(APIs.Client client, TTransport transport) throws TException, InterruptedException {
//            int respond = client.get("test");
//            transport.close();
//        }
//        
//        public boolean isDone(){
//            return t.getState()==Thread.State.TERMINATED;
//        }
//
//    }
    static class ClientThread extends Thread {

        private Thread t;
        private String threadName;
        private boolean done;
        public long rtt;
        long startTime;
        long endTime;

        ClientThread(String name) {
            threadName = name;
            System.out.println("Creating " + threadName);
            done = false;
        }

        @Override
        public void run() {
            System.out.println("Running " + threadName);
            try {
                TTransport transport;
                transport = new TFramedTransport(new TSocket("localhost", 9090));
//                transport = new TSocket("localhost", 9090);
                transport.open();
                TProtocol protocol = new TBinaryProtocol(transport);
                APIs.Client client = new APIs.Client(protocol);
                perform(client, transport);
            } catch (TException ex) {
                Logger.getLogger(JavaClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread " + threadName + " exiting.");
            done = true;
        }

        public void start() {
            System.out.println("Starting " + threadName);
            if (t == null) {
                t = new Thread(this, threadName);
                t.start();
            }
        }

        private void perform(APIs.Client client, TTransport transport) throws TException {
            //int respond = client.get("test");
            startTime = System.currentTimeMillis();
            boolean respond = client.ping();
            transport.close();
            endTime = System.currentTimeMillis();
            rtt = endTime - startTime;
        }

        public boolean isDone() {
            return done;
        }

    }

}
