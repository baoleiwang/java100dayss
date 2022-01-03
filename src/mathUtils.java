import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @ author: 32085
 * @ created: 2022-01-02 : 13:56
 */
public class mathUtils {
    public class add1{
        int a= larger(3,5);
    }

    /**
     * @description 求和
     * @author blWang
     * @date 2022-01-02 17:34:04
     * @para * @param: arr
     * @return
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double mean(int[] arr) {
        double mean = (double) sum(arr) / arr.length;
        return mean;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = larger(max, arr[i]);
        }

        return max;
    }

    public static int larger(int a, int b) {
//
        return (a>=b) ? a : b;
    }

    public static void sayHello(){
        System.out.println("What's your name?");
        Scanner scanner= new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("Hello," + str);
        }
    }


    public static int smaller(int a, int b) {
//        if (a <= b) {
//            return a;
//        } else {
//            return b;
//        }
        return  (a <= b) ? a : b;
    }

    public static int min(int[] arr) {
        List<String> ll = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = smaller(min, arr[i]);
        }
        return min;
    }


    public static String addString(String a, String b) {
        String res = a + "\t" + b;
        return res;
    }

    public static void print(){
        int i=0;
        while(i<11){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[4] = 4;
        int[] arr1 = new int[200000];
        int[] arr2 = new int[50];
        for (int i = 1; i <= 50; i++) {
            arr2[i - 1] = i;
//            System.out.println(arr2[i-1]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }
        int sum = sum(arr2);
        System.out.println(sum);
        String c = addString("hel  l l", "wcc xs");
        System.out.println(c);
        System.out.println(addString("hel  l l", "wcc xs"));
        System.out.println(larger(5, 3));
        float f=0.1f;
        double d= 1.0/ 10;
        System.out.println(f==d);
        print();
        sayHello();
    }

}