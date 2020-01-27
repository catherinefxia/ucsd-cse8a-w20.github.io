class Example {
  static int square(int x) {
    return x * x;
  }
  static String shout(String s) {
    return s.toUpperCase() + "!";
  }
  static String eTo3(String s) {
    return s.replace("e", "3");
  }
  public static void main(String[] args) {
    int x = 10;
    int y = x + 40;
    System.out.println(x);
    System.out.println(y);
    System.out.println(shout("a"));
    System.out.println(eTo3("hello"));
    assert shout("hi") == "HI!"; // This line should not use ==!
    assert shout("hi").equals("HI!"); // Use .equals() with strings
  }
}

