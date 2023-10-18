public class 数组赋值 {
    public static void main(String[] args) {
        int []arr ={11, 22, 33, 44, 55};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static  void  change(int[]arr) {
        arr[0] = 66;
    }
}
