package ex_02_Interview_Questions;

public class Lab007_Ternary_Interview_Q3 {
    static void main(String[] args) {
        byte A=14;
        String odd_no=(A%2==1)?"Odd":"Even";
        String even_no=(A%2==0)?"Odd":"Even";
        System.out.println(even_no);
        System.out.println(odd_no);
    }
}
