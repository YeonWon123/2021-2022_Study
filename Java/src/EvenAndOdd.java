import java.util.Scanner;

public class EvenAndOdd {

    public static String solution_yeonwon(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
    
    public static String solution_seonghyun(int num) {
        return (num % 2 == 0) ? "Even" : "Odd" ;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        System.out.println(EvenAndOdd.solution_yeonwon(num1));
        System.out.println(EvenAndOdd.solution_yeonwon(num2));

        System.out.println(EvenAndOdd.solution_seonghyun(num1));
        System.out.println(EvenAndOdd.solution_seonghyun(num2));
    }

}
