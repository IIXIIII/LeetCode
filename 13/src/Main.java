public class Main {
  public static void main(String[] args) {
    String a = new String("MCMXCIV");
    System.out.println(romanToInt(a));
  }
  public static  int romanToInt(String s) {
    int result = 0;
    int lastChar =0;
    for (int i = s.length() -1 ; i >=0; i--) {
      int getValue = translate( s.charAt(i));
      if (getValue < lastChar) result -= getValue;
      else result += getValue;
      lastChar = getValue;
    }
    return result;
  }
  public static int translate(char a){
    if (a == 'I') return 1;
    else if (a == 'V') return 5;
    else if (a == 'X') return 10;
    else if (a == 'L') return 50;
    else if (a == 'C') return 100;
    else if (a == 'D') return 500;
    else if (a == 'M') return 1000;
    return 1;
  }
}
