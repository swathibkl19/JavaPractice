
import java.util.stream.IntStream;

public class StreamVersion {

    public static void printCodility(){
        System.out.print("Codility");
    }

    public static void printTest(){
        System.out.print("Test");
    }

    public static void printCoders(){
        System.out.print("Coders");
    }

    public static void main(String[] args) {


        IntStream
                .range(1, 25)
                .mapToObj(i -> {
                    boolean flag =false;
                    if (i % 2 == 0) { printCodility(); flag = true; }
                    if (i % 3 == 0) { printTest(); flag = true;}
                    if (i % 5 == 0) { printCoders(); flag = true;}
                    if(!flag) { System.out.print(i); }
                    return "";} )
                .forEach(System.out::println);

    }
}
