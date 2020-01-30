class IsLongerThan {
  static boolean isLongerThan(String str, int length) {
    return str.length() > length;
  }
  public static void main(String[] args) {


    // Has a type error (don't expect this to work)
    // assert 1;


    // Removing the == true produces the same results
    assert isLongerThan("abc", 2) == true;
// ->    assert true == true;
// ->    assert true;

    // Removing the == false causes an assertion error
    assert isLongerThan("abc", 4) == false;
// ->    assert false == false;
// ->    assert true;

    // Compare to
    assert isLongerThan("abc", 4);
// ->    assert false;      Would have assertion error!

    assert isLongerThan("password", 8) == false;

  }
}

