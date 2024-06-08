import java.util.Scanner;

public class ArrayUtility {
   public static int[] inputArray(){
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter size of the array : ");
       int size = input.nextInt();
       int[] myArr = new int[size];
       int i =0;
       while (i<size){
           System.out.println("Please enter the element number " + (i + 1) + " : ");
           myArr[i] = input.nextInt();
           i++;
       }
       return myArr;
   }


}