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
import thriftDemo.*;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;

public class JavaClient {

    public static void main(String[] args) {
        // This demo uses the simple server
        try {
            TTransport transport;
            transport = new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            APIs.Client client = new APIs.Client(protocol);

            perform(client);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
    
    private static void perform(APIs.Client client) throws TException {
        Scanner scanner = new Scanner( System.in );
        System.out.print("Type your username:");
        String username = scanner.nextLine();
        client.increase(username);
    }
}
