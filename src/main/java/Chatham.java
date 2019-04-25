
public class Chatham {

        public void selection(int N) {

            // write your code in Java SE 8

          Boolean flag ;
          for (int i = 1; i <= N; i++) {
              flag = false;
              if (i % 2 == 0) {
                  System.out.print("Codility");
                  flag = true;
              }
              if (i % 3 == 0) {
                  System.out.print("Test");
                 flag = true;
              }
              if (i % 5 == 0) {
                    System.out.print("Coders");
                    flag = true;
                }
                if(!flag) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }


        public static void main(String[] args) {
            Chatham ch = new Chatham();
            ch.selection(24);
        }
    }

