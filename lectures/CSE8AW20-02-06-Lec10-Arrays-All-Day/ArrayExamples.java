class ArrayExamples {
  public static void main(String[] args) {
    int[] nums = {42, 56, 77};
    int numsAt1 = nums[1];
    nums[1] = 100;
    int numsAt1After = nums[1];
    System.out.println(numsAt1 + "\t" + numsAt1After);

    int[] maybeCopy = nums;
    maybeCopy[2] = 999;
    System.out.println("Did nums[2] change?" + nums[2]);
    System.out.println(nums);
    System.out.println(maybeCopy);
  }
}

