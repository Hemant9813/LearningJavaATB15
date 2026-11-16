package Java_Practice;

public class Type_Casting_Practise {
    static void main(String[] args) {
        byte A=123;
        int B=(int)A; //Widening Implicit

        float C=1.12f;
        byte D=(byte)C;
        System.out.println(D);
    }
}
