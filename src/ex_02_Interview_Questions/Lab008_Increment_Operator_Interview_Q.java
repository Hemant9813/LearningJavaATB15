package ex_02_Interview_Questions;

public class Lab008_Increment_Operator_Interview_Q {
    static void main(String[] args) {
     //   int a=20;
    //    System.out.println(a++ + a);
        //A=a++=A-20,a++-21
        //B=a=21
        //A+B=20+21=41

     //  int a2=30;
     //  System.out.println(a2++ + ++a2);
        //A=30,a2++-31
        //B= 32,++a2-32
        //A+B=30+32




        //int a1=15;
     //  System.out.println(++a1 + a1++);
        //A=16,++a1-16
        //B=16,a1++-16

        int a3=20;
        System.out.println(a3++ + a3++ + a3++);
        //A-20,a3++-21
        //B-21,a3++-22
        //C-22,a3++-23
        //A+B+C=20+21+22

        int a4=25;
        System.out.println(a4++ * --a4);
        //A-25,a4++-26
        //B-25,--a4-25
        //A+B-A*B=

    }
}
