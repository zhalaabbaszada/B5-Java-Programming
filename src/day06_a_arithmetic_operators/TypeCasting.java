package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args){
        byte b = 40;
        int i = b; // IMPLICIT CASTING / WIDENING CASTING - AUTOMATICALLY: converting byte into int| int>byte

        int i2 = 100;
        //byte b2 = i2; // canNOT assing impilicintly/
        byte b2 = (byte)i2; // EXPLICIT CASTING / NARROWING CASTING - MANUALLY: CONVERTING INT INTO BYTE | INT>BYTE

    }
}