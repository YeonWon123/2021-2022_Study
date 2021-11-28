import java.util.Scanner;

public class EvenAndOdd {

    public static String solution_yeonwon(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
    public static String solution_seonghyun(int num) {
        return (num % 2 == 0) ? "Even" : "Odd" ;
    }

    public static void main(String[] args) {
        System.out.print("정수 num 입력: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(EvenAndOdd.solution_yeonwon(num));
        System.out.println(EvenAndOdd.solution_seonghyun(num));
    }

}
