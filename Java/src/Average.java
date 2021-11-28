import java.util.Scanner;

public class Average {

    public static double solution_yeonwon(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,5};

        System.out.println(Average.solution_yeonwon(arr1));
        System.out.println(Average.solution_yeonwon(arr2));

    }

}
