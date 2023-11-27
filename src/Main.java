import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println(multiply(2, 3));
        System.out.println(concatStrings("ciao", 2));
        String[] arrOf5strings = {"ciao", "come", "stai", "io", "tutto"};
        System.out.println(Arrays.toString(addInArray(arrOf5strings, "ciao")));
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatStrings(String string1, int num1) {
        return string1 + num1;
    }

    public static String[] addInArray(String[] arrayOfStrings, String string1) {
        String[] sixStrings = new String[6];
        sixStrings[0] = arrayOfStrings[0];
        sixStrings[1] = arrayOfStrings[1];
        sixStrings[2] = string1;
        sixStrings[3] = arrayOfStrings[2];
        sixStrings[4] = arrayOfStrings[3];
        sixStrings[5] = arrayOfStrings[4];


        return sixStrings;
    }


}
