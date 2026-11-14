package ex_02_Interview_Questions;

public class Lab001_Concat_Interview_Q {
    static void main(String[] args) {
        int A=12;
        int B=24;

        String First_Name="Hemant";
        String Last_Name="Singh";

        System.out.println(First_Name + Last_Name + A+B); //If we are putting string first then concatenation
                                                         //will happen for all

        System.out.println(First_Name + Last_Name + (A+B));// If we are putting string first then concatenation
                                                           //will happen for string and for int addition will
                                                           //take place as per BODMAS rule

        System.out.println(A+B +First_Name + Last_Name);// If we are putting integer first then addition will
                                                        // happen for all
    }
}
