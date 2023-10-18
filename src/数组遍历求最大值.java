public class 数组遍历求最大值 {
    public static void main(String[] args) {
        int []arr = {11, 22, 66, 88, 100};
        int []arr1 = {11, 22, 66, 88, 33};
        int max = max(arr);
        int max1 = max(arr1);
        System.out.println("第一个数组最大:"+ max);
        System.out.println("第二个数组最大:"+ max1);
    }
    // 定义求最大值的方法
    public  static  int max(int []arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return  max;
    }
}
