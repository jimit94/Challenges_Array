import java.util.Scanner;

public class NewArray {
    // create a program to return new array deleting a specific element
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        System.out.println("Please enter the element you want to delete");
        int num = input.nextInt();
        int[] newArray = newArray(myArr,num);
        System.out.println("New Array is : ");
        ArrayUtility.displayArray(newArray);
    }

    public static int occ(int[] myArr,int num) {
        int i =0;

        int occurrence = 0;
        while (i<myArr.length){
            if(myArr[i] ==num){
                occurrence++;
            }
            i++;
        }
        return occurrence;
    }

    public static int[] newArray(int[] myArr,int num) {
        int len = myArr.length - occ(myArr,num);
        int[] newArr = new int[len];
        int i = 0;
        int j = 0;
        while (i<myArr.length){
            if(myArr[i] != num){
                newArr[j] = myArr[i];
                j++;
            }
            i++;

        }
        return newArr;
    }
}
