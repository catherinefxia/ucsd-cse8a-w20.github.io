class IsLongerThan {
  static boolean isLongerThan(String str, int length) {
    return str.length() > length;
  }
  public static void main(String[] args) {
    // No change in behavior without == true
    assert isLongerThan("abc", 2);
    assert true;

    assert isLongerThan("abc", 2) == true;
    assert true == true;

    // Change in behavior without == false
    assert isLongerThan("abc", 4);
    assert false;

    assert isLongerThan("abc", 4) == false;
    assert false == false;

    assert isLongerThan("password", 8) == false;
  }


/*
  if(SUPER_IMPORTANT_SECURITY_CHECK()) {
    do_secret_thing();
    do_other_secret_thing();
  }
*/
}

