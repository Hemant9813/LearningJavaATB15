package ex_02_Interview_Questions;

public class Lab009_Triangle_Classifier_Interview_Q {
    static void main(String[] args) {
        int a=8;
        int b=8;
        int c=5;
        if(a==b && b==c ){
            System.out.println("Triangle");
        }
        else if (a==b || b==c||c==a) {
            System.out.println("Isosceles");
            
        }
        else
            System.out.println("Scalene");
    }
}
