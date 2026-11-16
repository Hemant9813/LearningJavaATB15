package ex_02_Interview_Questions;

public class Lab005_Ternary_Interview_Q {
    static void main(String[] args) {
        int A=20;   //Give Max number out of three
        int B=10;
        int C=-22;
        String Max_No_Out_Of_Three=(A>B)? ((A>C)?"A":"C"):"B";
        System.out.println(Max_No_Out_Of_Three);
    }
}
