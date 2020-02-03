class Factorials {
  static int factorial1(int n) {
    System.out.println("factorial1(" + n + ")");
    int total = 1;
    System.out.println("i\ttotal before\ttotal after");
    for(int i = 1; i <= n; i += 1) {
      System.out.print(i + "\t\t" + total);
      total = total * i;
      System.out.println("\t\t" + total);
    }
    return total;
  }


  static int factorial2(int n) {
    System.out.println("factorial2(" + n + ")");
    int total = 1;
    System.out.println("i\ttotal before\ttotal after");
    for(int i = n; i >= 1; i -= 1) {
      System.out.print(i + "\t\t" + total);
      total = total * i;
      System.out.println("\t\t" + total);
    }
    return total;
  }

  public static void main(String[] args) {
    assert factorial1(5) == 120;
    assert factorial2(5) == 120;
  }

}


