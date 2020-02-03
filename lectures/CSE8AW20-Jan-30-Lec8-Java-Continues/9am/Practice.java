class Practice {
  static boolean between(int obs, int low, int high) {
    // This does not work:
    // return (low < obs) < high;

    // This avoids adding an if statement
    return (obs > low) && (obs < high);
  }

  static int addLengths(String s1, String s2) {
    return s1.length() + s2.length();    
  }

  public static void main(String[] args) {

    assert between(0, -5, 5) == true;
    assert between(10, -5, 5) == false;
    // This test fails with this interpretation of between,
    // challenge: make the version of between for all
    // these tests!
    // assert between(0, 5, -5) == true;


    assert addLengths("abc", "a") == 4;
    assert addLengths("abc", "abcde") == 8;
    assert addLengths("", "") == 0;


  }
}
