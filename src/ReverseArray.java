public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        reverseArray(myArr);
        System.out.println("Reversed array is : ");
        ArrayUtility.displayArray(myArr);

    }

    public static void reverseArray(int[] myArr) {
        int i = 0;
        while (i<(myArr.length/2)){
            int swap =myArr[i];
            myArr[i] = myArr[(myArr.length -1) - i];
            myArr[(myArr.length -1) - i] = swap;

            i++;
        }
    }
}
