package org.omg.CORBA;


/**
* org/omg/CORBA/ParameterMode.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Thursday, July 4, 2019 4:41:47 AM PDT
*/


/**
   * Enumeration of parameter modes for Parameter.  Possible vaues:
   * <ul>
   *   <li>PARAM_IN - Represents an "in" parameter.</li>
   *   <li>PARAM_OUT - Represents an "out" parameter.</li>
   *   <li>PARAM_INOUT - Represents an "inout" parameter.</li>
   * </ul>
   */
public class ParameterMode implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static org.omg.CORBA.ParameterMode[] __array = new org.omg.CORBA.ParameterMode [__size];

  public static final int _PARAM_IN = 0;
  public static final org.omg.CORBA.ParameterMode PARAM_IN = new org.omg.CORBA.ParameterMode(_PARAM_IN);
  public static final int _PARAM_OUT = 1;
  public static final org.omg.CORBA.ParameterMode PARAM_OUT = new org.omg.CORBA.ParameterMode(_PARAM_OUT);
  public static final int _PARAM_INOUT = 2;
  public static final org.omg.CORBA.ParameterMode PARAM_INOUT = new org.omg.CORBA.ParameterMode(_PARAM_INOUT);

  public int value ()
  {
    return __value;
  }

  public static org.omg.CORBA.ParameterMode from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ParameterMode (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ParameterMode
