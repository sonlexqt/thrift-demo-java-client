/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftDemo;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-21")
public class ServerManager implements org.apache.thrift.TBase<ServerManager, ServerManager._Fields>, java.io.Serializable, Cloneable, Comparable<ServerManager> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServerManager");

  private static final org.apache.thrift.protocol.TField TOTAL_ACCESS_COUNTER_FIELD_DESC = new org.apache.thrift.protocol.TField("totalAccessCounter", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ACCESS_COUNTER_FIELD_DESC = new org.apache.thrift.protocol.TField("userAccessCounter", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServerManagerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServerManagerTupleSchemeFactory());
  }

  public int totalAccessCounter; // required
  public Map<String,Integer> userAccessCounter; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_ACCESS_COUNTER((short)1, "totalAccessCounter"),
    USER_ACCESS_COUNTER((short)2, "userAccessCounter");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOTAL_ACCESS_COUNTER
          return TOTAL_ACCESS_COUNTER;
        case 2: // USER_ACCESS_COUNTER
          return USER_ACCESS_COUNTER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALACCESSCOUNTER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_ACCESS_COUNTER, new org.apache.thrift.meta_data.FieldMetaData("totalAccessCounter", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_ACCESS_COUNTER, new org.apache.thrift.meta_data.FieldMetaData("userAccessCounter", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServerManager.class, metaDataMap);
  }

  public ServerManager() {
  }

  public ServerManager(
    int totalAccessCounter,
    Map<String,Integer> userAccessCounter)
  {
    this();
    this.totalAccessCounter = totalAccessCounter;
    setTotalAccessCounterIsSet(true);
    this.userAccessCounter = userAccessCounter;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServerManager(ServerManager other) {
    __isset_bitfield = other.__isset_bitfield;
    this.totalAccessCounter = other.totalAccessCounter;
    if (other.isSetUserAccessCounter()) {
      Map<String,Integer> __this__userAccessCounter = new HashMap<String,Integer>(other.userAccessCounter);
      this.userAccessCounter = __this__userAccessCounter;
    }
  }

  public ServerManager deepCopy() {
    return new ServerManager(this);
  }

  @Override
  public void clear() {
    setTotalAccessCounterIsSet(false);
    this.totalAccessCounter = 0;
    this.userAccessCounter = null;
  }

  public int getTotalAccessCounter() {
    return this.totalAccessCounter;
  }

  public ServerManager setTotalAccessCounter(int totalAccessCounter) {
    this.totalAccessCounter = totalAccessCounter;
    setTotalAccessCounterIsSet(true);
    return this;
  }

  public void unsetTotalAccessCounter() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALACCESSCOUNTER_ISSET_ID);
  }

  /** Returns true if field totalAccessCounter is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalAccessCounter() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALACCESSCOUNTER_ISSET_ID);
  }

  public void setTotalAccessCounterIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALACCESSCOUNTER_ISSET_ID, value);
  }

  public int getUserAccessCounterSize() {
    return (this.userAccessCounter == null) ? 0 : this.userAccessCounter.size();
  }

  public void putToUserAccessCounter(String key, int val) {
    if (this.userAccessCounter == null) {
      this.userAccessCounter = new HashMap<String,Integer>();
    }
    this.userAccessCounter.put(key, val);
  }

  public Map<String,Integer> getUserAccessCounter() {
    return this.userAccessCounter;
  }

  public ServerManager setUserAccessCounter(Map<String,Integer> userAccessCounter) {
    this.userAccessCounter = userAccessCounter;
    return this;
  }

  public void unsetUserAccessCounter() {
    this.userAccessCounter = null;
  }

  /** Returns true if field userAccessCounter is set (has been assigned a value) and false otherwise */
  public boolean isSetUserAccessCounter() {
    return this.userAccessCounter != null;
  }

  public void setUserAccessCounterIsSet(boolean value) {
    if (!value) {
      this.userAccessCounter = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL_ACCESS_COUNTER:
      if (value == null) {
        unsetTotalAccessCounter();
      } else {
        setTotalAccessCounter((Integer)value);
      }
      break;

    case USER_ACCESS_COUNTER:
      if (value == null) {
        unsetUserAccessCounter();
      } else {
        setUserAccessCounter((Map<String,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_ACCESS_COUNTER:
      return Integer.valueOf(getTotalAccessCounter());

    case USER_ACCESS_COUNTER:
      return getUserAccessCounter();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_ACCESS_COUNTER:
      return isSetTotalAccessCounter();
    case USER_ACCESS_COUNTER:
      return isSetUserAccessCounter();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServerManager)
      return this.equals((ServerManager)that);
    return false;
  }

  public boolean equals(ServerManager that) {
    if (that == null)
      return false;

    boolean this_present_totalAccessCounter = true;
    boolean that_present_totalAccessCounter = true;
    if (this_present_totalAccessCounter || that_present_totalAccessCounter) {
      if (!(this_present_totalAccessCounter && that_present_totalAccessCounter))
        return false;
      if (this.totalAccessCounter != that.totalAccessCounter)
        return false;
    }

    boolean this_present_userAccessCounter = true && this.isSetUserAccessCounter();
    boolean that_present_userAccessCounter = true && that.isSetUserAccessCounter();
    if (this_present_userAccessCounter || that_present_userAccessCounter) {
      if (!(this_present_userAccessCounter && that_present_userAccessCounter))
        return false;
      if (!this.userAccessCounter.equals(that.userAccessCounter))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_totalAccessCounter = true;
    list.add(present_totalAccessCounter);
    if (present_totalAccessCounter)
      list.add(totalAccessCounter);

    boolean present_userAccessCounter = true && (isSetUserAccessCounter());
    list.add(present_userAccessCounter);
    if (present_userAccessCounter)
      list.add(userAccessCounter);

    return list.hashCode();
  }

  @Override
  public int compareTo(ServerManager other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTotalAccessCounter()).compareTo(other.isSetTotalAccessCounter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalAccessCounter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalAccessCounter, other.totalAccessCounter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserAccessCounter()).compareTo(other.isSetUserAccessCounter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserAccessCounter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userAccessCounter, other.userAccessCounter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServerManager(");
    boolean first = true;

    sb.append("totalAccessCounter:");
    sb.append(this.totalAccessCounter);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userAccessCounter:");
    if (this.userAccessCounter == null) {
      sb.append("null");
    } else {
      sb.append(this.userAccessCounter);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'totalAccessCounter' because it's a primitive and you chose the non-beans generator.
    if (userAccessCounter == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userAccessCounter' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ServerManagerStandardSchemeFactory implements SchemeFactory {
    public ServerManagerStandardScheme getScheme() {
      return new ServerManagerStandardScheme();
    }
  }

  private static class ServerManagerStandardScheme extends StandardScheme<ServerManager> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServerManager struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_ACCESS_COUNTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalAccessCounter = iprot.readI32();
              struct.setTotalAccessCounterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ACCESS_COUNTER
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.userAccessCounter = new HashMap<String,Integer>(2*_map0.size);
                String _key1;
                int _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readI32();
                  struct.userAccessCounter.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setUserAccessCounterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetTotalAccessCounter()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'totalAccessCounter' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServerManager struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_ACCESS_COUNTER_FIELD_DESC);
      oprot.writeI32(struct.totalAccessCounter);
      oprot.writeFieldEnd();
      if (struct.userAccessCounter != null) {
        oprot.writeFieldBegin(USER_ACCESS_COUNTER_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.userAccessCounter.size()));
          for (Map.Entry<String, Integer> _iter4 : struct.userAccessCounter.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeI32(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServerManagerTupleSchemeFactory implements SchemeFactory {
    public ServerManagerTupleScheme getScheme() {
      return new ServerManagerTupleScheme();
    }
  }

  private static class ServerManagerTupleScheme extends TupleScheme<ServerManager> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServerManager struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.totalAccessCounter);
      {
        oprot.writeI32(struct.userAccessCounter.size());
        for (Map.Entry<String, Integer> _iter5 : struct.userAccessCounter.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          oprot.writeI32(_iter5.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServerManager struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.totalAccessCounter = iprot.readI32();
      struct.setTotalAccessCounterIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.userAccessCounter = new HashMap<String,Integer>(2*_map6.size);
        String _key7;
        int _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readString();
          _val8 = iprot.readI32();
          struct.userAccessCounter.put(_key7, _val8);
        }
      }
      struct.setUserAccessCounterIsSet(true);
    }
  }

}

