public class Main {
  public static void main(String[] args) {
    String tests = "hello world ";
    System.out.println(isPalindrome(111111));
  }
  public static boolean isPalindrome(int x)  {
    int initial =x;
    int reversed =0;
    while (x>0){
      reversed = reversed*10;
      reversed = reversed + x%10;
      x = x/10;
    }
    return initial == reversed;
  }
}
