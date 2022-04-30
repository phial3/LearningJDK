package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/RepositoryHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Friday, April 10, 2015 7:48:30 PM PDT
*/

abstract public class RepositoryHelper
{
  private static String  _id = "IDL:activation/Repository:1.0";

  public static void insert (org.omg.CORBA.Any a, Repository that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Repository extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (RepositoryHelper.id (), "Repository");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Repository read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_RepositoryStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Repository value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Repository narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Repository)
      return (Repository)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _RepositoryStub stub = new _RepositoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Repository unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Repository)
      return (Repository)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _RepositoryStub stub = new _RepositoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
