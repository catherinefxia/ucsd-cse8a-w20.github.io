class Phase {
  // Takes a temperature in degrees celsius and
  // returns "water", "steam", or "ice"
  static String phaseOfWater(int temp) {
    if(temp < 0) {
      return "ice";
    }
    else if(temp < 100) {
      return "water";
    }
    else {
      return "steam";
    }
  }
  public static void main(String[] args) {
    assert phaseOfWater(50).equals("water");
    assert phaseOfWater(105).equals("steam");
    assert phaseOfWater(-9).equals("ice");

    System.out.println("Expect this to be water for 50: " + phaseOfWater(50));
  }
}


