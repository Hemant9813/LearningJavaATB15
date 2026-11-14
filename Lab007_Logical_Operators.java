package ex_01_Java_Basics;

public class Lab007_Logical_Operators {
    static void main(String[] args) {
        boolean A=true && false;  //And gate &&
        boolean B=false && true;
        boolean C=false && false;
        boolean D=true && true;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

        boolean E=true || false;  //or gate ||
        boolean F=false || true;
        boolean G=false || false;
        boolean H=true || true;

        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println(H);

        boolean Z=!true; //Not
        System.out.println(Z);
    }
}
