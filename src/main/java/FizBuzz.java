public class FizBuzz {

    public void fizBuzz( Integer number){
        // for (int i = 1; i <= 10; i++) {
        // boolean fizzOrBuzz = false;
        if(number%15 == 0){
            System.out.println("FizzBuzz");
        }
        if (number % 2 == 0) {
            System.out.print(number + "---" + "Fizz" + "\n" );
            // fizzOrBuzz = true;
        }
        if (number % 4 == 0) {
            System.out.print(number + "---" + "Buzz" + "\n" );
            //  fizzOrBuzz = true;
        }

//            if (fizzOrBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(String.valueOf(i));
//            }
    }

    public static void main(String[] args) {
        FizBuzz fizBuzz = new FizBuzz();
        fizBuzz.fizBuzz(15);
    }
}
