import java.util.Scanner;
public class vairable {
    static int b = 5; //static variable
    public static void main(String[] args) {
        int a = 10; //local variable
        System.out.println(a);
        System.out.println(b);
         System.out.println(Byte.MIN_VALUE+" TO "+Byte.MAX_VALUE);
         System.out.println(Short.MIN_VALUE+" TO "+Short.MAX_VALUE);
         System.out.println(Double.MIN_VALUE+" TO "+Double.MAX_VALUE);
         System.out.println(Float.MIN_VALUE+" TO "+Float.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE+" TO "+Integer.MAX_VALUE);
         System.out.println(Long.MIN_VALUE+" TO "+Long.MAX_VALUE);
        Scanner SC = new Scanner(System.in);
        int c = SC.nextInt();
        System.out.println(a+b+c);
        int d = SC.nextInt();
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c/d);
        System.out.println(c*d);
        System.out.println(c%d);
        int []arr ={1,7,9};
        for(int j: arr){
            System.out.println(j);
        }

    }
}
