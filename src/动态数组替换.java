import java.util.Scanner;

public class 动态数组替换 {
    public static void main(String[] args) {
        int []arr = new int[5];
        int[] arradd = arradd(arr);
        int max = max(arr);
        System.out.println("最大的值是" + max);

    }
   //    向数组里替换
    public  static  int[] arradd(int[]arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五位学生的成绩");
        for (int i =0; i<arr.length; i++) {
            System.out.println("请输入第" + ( i + 1) + "位学生成绩");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // 求数组的最大值
    public  static  int max(int []arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return  max;
    }
}
