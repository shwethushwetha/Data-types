package shwetha;

public class DataTypes {

	public static void main(String[] args)
	{
		int value1 = 9/2;
		float value2 = 101/61;
		double value3 = 10d/6d;
		float value4 = 5/2.5f;
		System.out.println("value1=" +value1);
		System.out.println("value2="+value2);
		System.out.println("value3="+value3);
		System.out.println("value4="+value4);
        int maker = 512;
        //assigning expression to variables 
        double percentage = maker * 0.46f;
        System.out.println("percentage=" + percentage);
        
        //identifies do not start with @,# and whitespace,keyword 
        //it start with $
        int $number = 20;
        System.out.println("value of number is ="+ $number);
        String studentName = "Shwetha";
        System.out.println("value is = " +studentName);
        
        //primitive data types
        //byte takes 1 byte
        byte byteMax=127;
        byte byteMin=-127;
        System.out.println("minmum byte value is ="+ byteMin + "maximum byte value is = "+ byteMax);
        //short takes 2 bytes
        short shortMax = 32767;
        short shortMin = -32768;
        System.out.println("minmum short value is ="+ shortMin + "maximum short value is = "+ shortMax);
        //int takes 4 bytes
        int intMax = 2147483647;
        int intMin = -2147483648;
        System.out.println("minmum int value is ="+ intMin + "maximum int value is = "+ intMax);
        //long takes 8 bytes
        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775808L; 
        System.out.println("minmum long value is ="+ longMin + "maximum long value is = "+ longMax);
        
        float f = 3234.141243278345f;
        double d = 3456.14124512345678902345678914f;
        System.out.println("Float value is ="+ f + " Double value is =" + d);
        
        boolean flag = false;
        System.out.println("Boolean value is =" + flag);
        
        //demonstrate the implicit Type casting(widening) b/w primitive data types  
        
        byte t=10;
        int i = t;
        System.out.println(i);
        float a=22.3f;
        double u= a;
        System.out.println(u);
        char r= 'A';
        int n=r;
        System.out.println(n);
        double e=10.35f;
        long l= (long) e;
        System.out.println(l);
        long l1=923372036854775806l;
        int i2=(int) l1;
        System.out.println(i2);
        float f2=38.33f;
        int f3=(int) f2;
        System.out.println(f3);
        byte b1=90;
        char c1=(char) b1;
        System.out.println(c1);
 
	}

}
