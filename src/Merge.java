public class Merge {
    // merge two sorted array.
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Input second array");
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArray = mergedArray(arr1,arr2);
        System.out.println("Merged array is : ");
        ArrayUtility.displayArray(mergedArray);
    }

    public static int[] mergedArray(int[] arr1,int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] mergedArray = new int[length];
        int i = 0,j=0,k=0;
        while ((i<arr1.length) || (j< arr2.length)){
            if(j== arr2.length || (i< arr1.length && arr1[i]<arr2[j])){
                mergedArray[k] = arr1[i];
                i++;
            }else {
                mergedArray[k] = arr2[j];
                j++;
            }


            k++;
        }
return mergedArray;
    }
}
