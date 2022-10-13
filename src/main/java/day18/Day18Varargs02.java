package day18;

import java.util.Arrays;

public class Day18Varargs02 {
    /*
        Find the middle element by using vararg
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2=10
    */
    public static void main(String[] args) {
        System.out.println(middleElement(12,5,8));//8
        System.out.println(middleElement(3,5,1,2,4));//3
    }
    public static int middleElement(int... a){
        Arrays.sort(a);
        int middleIdx = a.length/2;

        return a[middleIdx];
    }
}
