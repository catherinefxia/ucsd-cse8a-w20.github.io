class LetterGrade {
  static String letterGrade(int points) {
    if(points >= 90) {
      return "A";
    }
    else if(points >= 80) {
      return "B";
    }
    else if(points >= 70) {
      return "C";
    }
    else {
      return "F";
    }
  }
  public static void main(String[] args) {
    assert letterGrade(7).equals("F");
    assert letterGrade(95).equals("A");
    assert letterGrade(88).equals("B");
  }
}

