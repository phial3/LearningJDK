package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerHeldDownHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, April 10, 2015 7:48:30 PM PDT
*/

public final class ServerHeldDownHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerHeldDown value = null;

  public ServerHeldDownHolder ()
  {
  }

  public ServerHeldDownHolder (ServerHeldDown initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerHeldDownHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerHeldDownHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerHeldDownHelper.type ();
  }

}
