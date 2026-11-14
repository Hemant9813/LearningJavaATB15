package ex_02_Interview_Questions;

public class Lab003_Logical_Operator_Interview_Q {
    static void main(String[] args) {
        int hemant_salary=10;
        boolean A=!(hemant_salary<20 || hemant_salary>10);
        System.out.println(A);

        //Divide and conquer
        //hemant_salary<20=true
        //hemant_salary>10=false
        //true||false=true
        //!true
    }
}
