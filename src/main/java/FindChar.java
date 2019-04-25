public class FindChar {

    public  Character findChar(String str , Character character) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                System.out.println("Char found" +"-----" + character);
            }
        }

        return character;
    }

    public static void main(String[] args) {
        FindChar findChar = new FindChar();
        findChar.findChar("Bank Of America" , 'e');

    }

}

