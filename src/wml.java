public class wml {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 4, 11, -5, 8, 3, 100 };
        int maxSum = getMaxSum2(arr);
        System.out.println("最大子数组的和为：" + maxSum);
    }
    public static int getMaxSum1(int[] arr) {
        int max = -100000;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (max < sum) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static int getMaxSum2(int[] arr) {
        int n = arr.length;
        int max = -1000000;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                max = 0;
            }
        }
        return max;
    }

}
