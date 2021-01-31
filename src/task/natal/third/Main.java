package task.natal.third;

public class Main {
    static int [] nums = new int[] {1, 2, 5, 7, 11};

    public static void main(String[] args) {
        int t = nums[0];
        nums [0] = nums [nums.length - 1];
        nums [nums.length - 1] = t;
        int sum = nums [0] + nums [nums.length/2];
        System.out.println(sum);

    }
}
