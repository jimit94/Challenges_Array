public class MaxandMin {
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        int max=max(myArr);
        int min=min(myArr);
        System.out.println("Max number is :" + max);
        System.out.println("Min number is :" + min);
    }

    public static int max(int[] myArr) {
        int max = myArr[0];
        int i = 0;
        while (i< myArr.length){
            if(myArr[i]>max){
                max = myArr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] myArr) {
        int min = myArr[0];
        int i =0;
        while (i< myArr.length){
            if(myArr[i]<min){
                min = myArr[i];
            }
            i++;
        }
        return min;

    }
}
