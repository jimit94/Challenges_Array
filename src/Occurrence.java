import java.util.Scanner;

public class Occurrence {
    // find the number of occurrences of an element in an array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        System.out.print("Please enter a number you want to check : ");
        int num = input.nextInt();
        int result = occurrence(myArr,num);
        System.out.println("Your entered number occurrence is " + result + " times");

    }

    public static int occurrence(int[] myArr,int num) {
        int occ = 0;
        int i = 0;
        while (i<myArr.length){
            if(myArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
