import java.util.Random;

public class 随机数动态数组 {
    public static void main(String[] args) {
        int[] arr = getInts();
        int min  = extracted(arr);
        System.out.println("最小值是" + min);
    }

    private static int[] getInts() {
        Random ra = new Random();
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
        return arr;
    }

    private static int extracted(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min > arr[i] ? arr[i] : min;
        }
        return  min;
    }
}
