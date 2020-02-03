class ArrayExamples {

  static int product(int[] nums) {
    int total = 1;
    for(int n: nums ) {
      total *= n;
    }
    return total;
  }
  static {
    int[] nums1 = {1, 2, 3, 5};
    assert product(nums1) == 30;
    int[] nums2 = {4, 2, 3};
    assert product(nums2) == 24;
  }

  static int max(int[] nums) {
    int biggest = nums[0];
    for(int n: nums) {
      if(n > biggest) { biggest = n; }
    }
    return biggest;
  }
  static {
    int[] nums1 = {50, 60, 70, 30};
    assert max(nums1) == 70;
    int[] nums2 = {30, 50, 60, 10, 90};
    assert max(nums2) == 90;
    int[] nums3 = {90};
    assert max(nums3) == 90;
  }

  static int find(String[] strs, String tofind) {
    for(int index = 0; index < strs.length; index += 1) {
      if(strs[index].equals(tofind)) { return index; }
    }
    return -1;
  }
  static {
    String[] abc = {"a", "b", "c"};
    assert find(abc, "b") == 1;
    assert find(abc, "d") == -1;
    assert find(abc, "c") == 2;
  }

  static int sumAlternating(int[] nums) {
    int total = 0;
    for(int i = 0; i < nums.length; i += 2) {
      total += nums[i];
    }
    return total;
  }
  static {
    int[] nums1 = {50, 70, 10, 30};
    assert sumAlternating(nums1) == 60;
    int[] nums2 = {90, 20, 60, 80, 30};
    assert sumAlternating(nums2) == 180;
    int[] nums3 = {90};
    assert sumAlternating(nums3) == 90;
    int[] nums4 = {};
    assert sumAlternating(nums4) == 0;
  }


  public static void main(String[] args) {
    // All the blocks above run the assertions
  }

  static boolean contains(int[] nums, int tofind) {
    for(int n: nums ) {
      if(n == tofind) { return true; }
    }
    return false;
  }
  static {
    int[] testnums = {4, 7, 2, 100};
    assert contains(testnums, 4) == true;
    assert contains(testnums, 9) == false;
    assert contains(testnums, 100) == true;
  }


  static int sumPositives(int[] nums) {
    int total = 0;
    for(int n: nums) {
      if(n > 0) { total += n; }
    }
    return total;
  }

  static String commaSeparate(String[] strs) {
    String fullstring = "";
    int index = 0;
    for(String s: strs) {
      fullstring = fullstring + s;
      if(index < strs.length - 1) {
        fullstring = fullstring + ", ";
      }
    }
    return fullstring;
  }

}
