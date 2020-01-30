class Practice {

  static boolean between(int n, int start, int end) {
    return (n > start) && (n < end);

    /*
    if((n > start) && (n < end)) {
      return true;
    }
    else {
      return false;
    }
    */
  }

  static int addLengths(String s1, String s2) {
    return s1.length() + s2.length();
  }


  public static void main(String[] args) {
    assert between(2, 3, 1) == false;
    assert between(6, 2, 5) == false;
    assert between(2, 1, 3) == true;

    assert addLengths("abc", "a") == 4;
    assert addLengths("abc", "abcde") == 8;

  }
}
