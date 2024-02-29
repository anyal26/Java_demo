package Lesson1;

import org.w3c.dom.ls.LSOutput;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("INTEGER DATA TYPES");
        byte b = 127;
        short s = 32;
        int i = 1;
        long l = -356;

        System.out.println("Byte type: from -128 to 127." +
                "Example: b= " + b);
        System.out.println("Short type:from -32,768 to 32,767." +
                "Example: s= " + s);
        System.out.println("Int type:from -2,147,483,648 to 2,147,483,647. " +
                "Example: i= " + i);
        System.out.println("Long type:from -9,223,372,036,854,775,808 to 9,223,3722,036,854,775,807."
                +
                "Example: l= " + l);

        System.out.println("FLOATING POINT DATA TYPES");
        float f = 127f;
        double d = 32;
        double result = f / d;
        System.out.println("Float type: has 32 bits."+
                "Example: f = "+ f );
        System.out.println("Double type: has 64 bits."+
                "Example:result = "+result);


        System.out.println("CHARACTER DATA TYPES");
        char c = 65;
        char c1 = 'A';
        int codeOfA=(int)c1;

        System.out.println("Char type Example: c = "+ c1 );

        System.out.println("LOGICAL DATA TYPES");
        boolean tr  = true;
        boolean fal = false;

        System.out.println("Logical type"+
                "Example: tr = "+ tr );
        System.out.println("Logical type"+
                "Example:fal = "+fal);


    }
}


