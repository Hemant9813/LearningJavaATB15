package Java_Practice;

import java.util.Scanner;

public class Ternary_Operator_Practice {
    static void main(String[] args) {
      //  int A=20;  //Find max number
      //  int B=33;
      //  int C=10;
       // String result=(A<B)?"B":((A<C)?"A":"C");
        //  System.out.println(result);

       // String result2=(A<B)?"Max":"Min";  //max no of two
      //  String result3=(A>B)?"Max":"Min";
      //  System.out.println(result3);
     //   System.out.println(result2);

        //byte Z=13;
        Scanner scanner=new Scanner(System.in);
        int Z=scanner.nextInt();
        String result4=(Z%2==0)?"even":"Odd";
        String result5=(Z%2==1)?"Even":"Odd";
        System.out.println(result4);
        System.out.println(result5);
    }
}
