package basics;
/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 *
 * 2. reference
 * 		Arrays
 * 		Strings
 *
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 *
 * 	WCData_type obj_name = new WCData_type(value);
 *
 * 	Type Casting: converting one type of primitive data to another type of primitive data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 *
 *  Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 *
 *
 * syntax to create primitive data type variable
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 *
 * variable is nothing but name of memory location where we are storing data
 */

public class DatatypesDemo {


    public static void main(String[] args) {
        // boolean: boolean
        boolean b = true;
        System.out.println("boolean b = "+b);

        // character: char: to store a character we have to use enclose the character in single quotes: 2 bytes
        char ch = '@';
        System.out.println("character ch = "+ch);
        System.out.println("min value of character datatype is "+Character.MIN_VALUE);
        System.out.println("max value of character datatype is "+Character.MAX_VALUE);
        System.out.println("size of character in bits is "+Character.SIZE);
        System.out.println("size of character in bytes is "+Character.BYTES);

        // byte: byte: 1 byte
        byte by = 123;
        System.out.println("byte by = "+by);
        System.out.println("min value of byte datatype is "+Byte.MIN_VALUE);
        System.out.println("max value of byte datatype is "+Byte.MAX_VALUE);
        System.out.println("size of byte in bits is "+Byte.SIZE);
        System.out.println("size of byte in bytes is "+Byte.BYTES);

        // short: short: 2 bytes
        short sh = 12345;
        System.out.println("short sh = "+sh);
        System.out.println("min value of short datatype is "+Short.MIN_VALUE);
        System.out.println("max value of short datatype is "+Short.MAX_VALUE);
        System.out.println("size of short in bits is "+Short.SIZE);
        System.out.println("size of short in bytes is "+Short.BYTES);


        // integer: int: 4 bytes
        int i = 123456789;
        System.out.println("int i = "+i);
        System.out.println("min value of int datatype is "+Integer.MIN_VALUE);
        System.out.println("max value of int datatype is "+Integer.MAX_VALUE);
        System.out.println("size of int in bits is "+Integer.SIZE);
        System.out.println("size of int in bytes is "+Integer.BYTES);

        // long: long: 8 bytes
        long l = 98765432100L;
        System.out.println("long l = "+l);
        System.out.println("min value of long datatype is "+Long.MIN_VALUE);
        System.out.println("max value of long datatype is "+Long.MAX_VALUE);
        System.out.println("size of long in bits is "+Long.SIZE);
        System.out.println("size of long in bytes is "+Long.BYTES);

        // float: float: 4 bytes
        float f = 9.8f;
        System.out.println("float f = "+f);
        System.out.println("min value of float datatype is "+Float.MIN_VALUE);
        System.out.println("max value of float datatype is "+Float.MAX_VALUE);
        System.out.println("size of float in bits is "+Float.SIZE);
        System.out.println("size of float in bytes is "+Float.BYTES);

        // double: double: 8 bytes
        double d = 99.887;
        System.out.println("double d = "+ d);
        System.out.println("min value of float datatype is "+Double.MIN_VALUE);
        System.out.println("max value of float datatype is "+Double.MAX_VALUE);
        System.out.println("size of float in bits is "+Double.SIZE);
        System.out.println("size of float in bytes is "+Double.BYTES);

        // type casting
        // up casting - lower to higher
        // higher_variable = lower_variable
        // byte to short
        byte bLow = 100;
        short sHigh = bLow;
        System.out.println(sHigh);

        // int to float
        int iLow = 9876;
        float fHigh = iLow;
        System.out.println(fHigh);

        // down casting - higher to lower
        short stHigh = 400;
        byte byLow = (byte) stHigh;
        System.out.println(byLow);

        /*
        while stHigh is in the range of byte then store that value else stHigh - 2 power Byte.size
         */

        // double to int
        double dHigh = 897.77;
        int inLow = (int) dHigh;
        System.out.println(inLow);

        ch = '1';
        int c2i = ch;
        System.out.println(c2i);

        // type conversion
        // primitive to reference
        // int to string
        int ip = 234;
        String i2s = Integer.toString(ip);
        System.out.println(i2s+10);

        float fp = 9.8f;
        String f2s = Float.toString(fp);
        System.out.println(f2s+10);

        boolean bp = false;
        String b2s = Boolean.toString(bp);
        System.out.println(b2s+10);

        // reference to primitive
        String is = "999";
        int s2i = Integer.parseInt(is);
        System.out.println(s2i+10);

        String fs = "88.99";
        float s2f = Float.parseFloat(fs);
        System.out.println(s2f+10);

        String bs = "false";
        boolean s2b = Boolean.parseBoolean(bs);
        System.out.println(s2b);

        // primitive to wrapper
        int ipr = 123;
        Integer iw = Integer.valueOf(ipr);
        System.out.println(iw);

        float fpr = 99.88f;
        Float fw = Float.valueOf(fpr);
        System.out.println(fpr);

        // wrapper to primitive
        Integer iwp = new Integer(7654);
        int ipw = iwp.intValue();
        System.out.println(ipw);


    }
}
