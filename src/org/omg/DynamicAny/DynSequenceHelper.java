package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynSequenceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Friday, April 10, 2015 7:48:46 PM PDT
*/


/**
    * DynSequence objects support the manipulation of IDL sequences.
    */
abstract public class DynSequenceHelper
{
  private static String  _id = "IDL:omg.org/DynamicAny/DynSequence:1.0";

  public static void insert (org.omg.CORBA.Any a, DynSequence that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DynSequence extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DynSequenceHelper.id (), "DynSequence");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DynSequence read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DynSequence value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static DynSequence narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynSequence)
      return (DynSequence)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynSequenceStub stub = new _DynSequenceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DynSequence unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynSequence)
      return (DynSequence)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynSequenceStub stub = new _DynSequenceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
