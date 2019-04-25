public class Fibannoci {

    public void fibNumbers(Integer num) {


        int a = 0, b = 1, c;
        System.out.print(a + " " + b);//printing 0 and 1
        for (int i = 2; i < num; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            Integer sum = a + b;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Fibannoci fibannoci = new Fibannoci();
        fibannoci.fibNumbers(5);
    }
}
