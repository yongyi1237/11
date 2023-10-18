public class 数组求偶数和 {
    public static void main(String[] args) {
        int []arr = {11, 22, 33, 44, 55};
        int sum = sum(arr);
        System.out.println(sum);
    }
    // 定义数组求和的方法
    public static  int sum (int[]arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                a += arr[i];
            }
        }
        return  a;
    }
}
