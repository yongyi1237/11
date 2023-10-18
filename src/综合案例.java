public class 综合案例 {
    public static void main(String[] args) {
        zh();
    }
    public  static  void zh() {
        int [] arr = {100, 50, 20, 90, 90};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int pjz = 0;
        int dpjz = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            min = min > arr[i] ? arr[i] : min;
            sum += arr[i];
        }
        pjz = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] < pjz) {
               dpjz++;
           }
        }
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
        System.out.println("总成绩:"+sum);
        System.out.println("平均值:"+pjz);
        System.out.println("低于平均值:"+dpjz);
    }
}
