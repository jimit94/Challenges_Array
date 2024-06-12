public class Palindrome {
    // check if the array is palindrome
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
boolean isPalindrome = isPalindrome(myArr);
if(isPalindrome){
    System.out.println("Your array is palindrome");
}else{
    System.out.println("Not palindrome");
}
    }

    public static boolean isPalindrome(int[] myArr) {
        int i = 0;
        while (i< myArr.length / 2){
          if(myArr[i] != myArr[(myArr.length - 1) - i]){
              return false;
          }
            i++;
        }
        return true;
    }
}
