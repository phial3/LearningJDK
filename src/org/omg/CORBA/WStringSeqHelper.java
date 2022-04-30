package org.omg.CORBA;


/**
* org/omg/CORBA/WStringSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Friday, April 10, 2015 7:48:45 PM PDT
*/


/** An array of WStrings */
abstract public class WStringSeqHelper
{
  private static String  _id = "IDL:omg.org/CORBA/WStringSeq:1.0";

  public static void insert (Any a, String[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String[] extract (Any a)
  {
    return read (a.create_input_stream ());
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().create_wstring_tc (0);
      __typeCode = ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = ORB.init ().create_alias_tc (WStringSeqHelper.id (), "WStringSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String[] read (org.omg.CORBA.portable.InputStream istream)
  {
    String value[] = null;
    int _len0 = istream.read_long ();
    value = new String[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = istream.read_wstring ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ostream.write_wstring (value[_i0]);
  }

}
