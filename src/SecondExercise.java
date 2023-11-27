import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire la prima stringa");
        String string1 = scanner.nextLine();
        System.out.println("Inserire la seconda stringa");
        String string2 = scanner.nextLine();
        System.out.println("Inserire la terza stringa");
        String string3 = scanner.nextLine();
        System.out.println(concatStrings(string1, string2, string3));
        System.out.println(concatReversedStrings(string1, string2, string3));

    }

    public static String concatStrings(String str1, String str2, String str3) {
        String inOrder = str1 + str2 + str3;
        return inOrder;
    }

    public static String concatReversedStrings(String str1, String str2, String str3) {
        String reversedOrder = str3 + str2 + str1;
        return reversedOrder;
    }
}
