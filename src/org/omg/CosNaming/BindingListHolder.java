package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, April 10, 2015 7:48:46 PM PDT
*/


/**
   * List of Bindings.
   */
public final class BindingListHolder implements org.omg.CORBA.portable.Streamable
{
  public Binding value[] = null;

  public BindingListHolder ()
  {
  }

  public BindingListHolder (Binding[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BindingListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BindingListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BindingListHelper.type ();
  }

}
