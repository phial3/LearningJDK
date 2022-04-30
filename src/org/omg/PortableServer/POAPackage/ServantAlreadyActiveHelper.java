package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ServantAlreadyActiveHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Friday, April 10, 2015 7:48:45 PM PDT
*/

abstract public class ServantAlreadyActiveHelper
{
  private static String  _id = "IDL:omg.org/PortableServer/POA/ServantAlreadyActive:1.0";

  public static void insert (org.omg.CORBA.Any a, ServantAlreadyActive that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ServantAlreadyActive extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (ServantAlreadyActiveHelper.id (), "ServantAlreadyActive", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ServantAlreadyActive read (org.omg.CORBA.portable.InputStream istream)
  {
    ServantAlreadyActive value = new ServantAlreadyActive ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ServantAlreadyActive value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
