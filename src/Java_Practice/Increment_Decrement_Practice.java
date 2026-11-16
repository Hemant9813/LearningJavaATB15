package Java_Practice;

public class Increment_Decrement_Practice {
    static void main(String[] args) {
        int a=14;
       // System.out.println(++a + a++);


        //A-15, ++a--15
        //B-15
        //A+B-15+15=30
        System.out.println(a++ + ++a);
        //A-14, a++-15
        //B-16
        //A+B=14+16

    }
}
