public class SortedArray {
    // write a program to check if array is sorted or not
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        boolean isSorted = ascending(myArr) || descending(myArr);
      if(isSorted){
          System.out.println("Your array is sorted");
      }
      else {
          System.out.println("Your array is not sorted");
      }
    }

    public static boolean ascending(int[] myArr) {
        int i =1;

        while (i< myArr.length){
            if(myArr[i]<myArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean descending(int[] myArr) {
        int i =1;
        while (i< myArr.length){
            if(myArr[i]>myArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
