class IsLongerThan {
  static boolean isLongerThan(String s, int length) {
    return s.length() > length;
  }
  public static void main(String[] args) {
    System.out.println(isLongerThan("abc", 4));
    System.out.println(isLongerThan("abc", 2));
    System.out.println(isLongerThan("password", 7));
  }
}


