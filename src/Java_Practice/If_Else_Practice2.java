package Java_Practice;

import java.util.Scanner;

public class If_Else_Practice2 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        short age =scanner.nextShort();
       // System.out.println(age);
        if(age<18){
            System.out.println("Minor");
        }
        else if (age==18){
            System.out.println("Adult");
        }
        else{
            System.out.println("SC");
        }
    }
}
