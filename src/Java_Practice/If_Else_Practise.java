package Java_Practice;

import java.util.Scanner;

public class If_Else_Practise {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the user input");
        byte age=scanner.nextByte();
        System.out.println(age);

        if (age<18){
            System.out.println("He is minor");
        }
        else{
            System.out.println("He is adult");

        }


    }
}
