package Java_Practice;

public class Triangle_Classifier_practice {
    static void main(String[] args) {
        int a=12; int b=12; int c=15;
        if(a==b && b==c){
            System.out.println("Triangle");

        }
        else if (a==b || b==c || c==a){
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }
    }
}
