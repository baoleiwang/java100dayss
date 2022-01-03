import java.text.DecimalFormat;

public class HelloWorld {
//    public static void main(String[] args){
//        System.out.println("HelloWorld");
//    }
    public static void main(String[] args) {
        System.out.println("123");
        int[] arr2 = new int[4];
        for (int i = 1; i <= 4; i++) {
            arr2[i - 1] = i;
//            System.out.println(arr2[i-1]);
        }
        int a = mathUtils.sum(arr2);
        double b = mathUtils.mean(arr2);
        System.out.println(a);
        System.out.println(b);
        int a1=10;
        int a2= 010;
        int a3= 0x10;
        int a4= 0b10;
        System.out.println(String.format("%s,%s,%s,%s",a1,a2,a3,a4));
        float f = 0.1f;
        double d = 0.1;
        DecimalFormat dec = new DecimalFormat("0.0000000000000000");
        System.out.println(dec.format(f));
        System.out.println(dec.format(d));
        mathUtils temp = new mathUtils();
    }

}
