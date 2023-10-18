public class 数组动态介绍 {
    public static void main(String[] args) {
        arrayTest();
    }
    /*
    * 默认值的分类:
    *    整数: 0,
    *    小数: 0.0;
    *    布尔: false;
    *    -------------------------
    *    字符: '\u0000';
    *    字符串: null;
    *
    * */
    public  static  void arrayTest () {
        char []arr = new char[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // '\u0000'
        }
    }
}
