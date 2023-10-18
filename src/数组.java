public class 数组 {
    public static void main(String[] args) {
       sz();
        sz1();
    }
    public  static  void  sz() {
       int[] arr = {11, 22, 333};
        System.out.println(arr[0]);
    }
    public  static  void  sz1() {
        int[] arr = {11, 22, 333};
        for (int i =0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }
}
