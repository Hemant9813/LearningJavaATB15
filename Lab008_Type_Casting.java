package ex_01_Java_Basics;

public class Lab008_Type_Casting {
    static void main(String[] args) {
        byte A=98;
        int B=A;           //Widening done automatically by Jvm--Implicitly
        long C=(long) A;   //Widening done--Explicitly
        char D=(char)A;

        float F=10.23f;
        int G=20;         //Narrowing only done by Explicitly
        int H=(int)F+G;
        System.out.println(H);
    }
}
