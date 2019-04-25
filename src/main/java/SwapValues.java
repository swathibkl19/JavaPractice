public class SwapValues {

    public static void main(String arg[])
    {
        System.out.println("Before swapping");
        int x=10;
        int y=20;
        System.out.println("value of x:"+x);
        System.out.println("value of y:"+y);
        System.out.println("After swapping");
//        x=x+y;
//        y=x-y;
//        x=x-y;
        x = x + y ;// z =30;
        y = x - y ;//30-20 =10;
        x = x - y; // 30 - 10 =20;


        System.out.println("value of x:"+x);
        System.out.println("value of y:"+y);
    }
}
