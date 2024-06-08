import java.util.Scanner;

public class SumArray {
    // find the sum and average of elements in an array by taking an array as input from the user.
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        long sum = sum(myArr);
        int average = average(myArr);
        System.out.println("Sum of the elements in array is " + sum);
        System.out.println("Average of the elements in array is " + average);

    }
    public static long sum(int[] myArr){
        int i = 0;
        long sum = 0;
        while (i<myArr.length){
            sum+=myArr[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] myArr){
        long total = sum(myArr);
        return (int) total / (myArr.length);

    }

}
