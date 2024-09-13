import java.util.Scanner;

public class MakeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the sub-string to be searched in the given string: ");
        String subString = scanner.nextLine();

        int index = mainString.indexOf(subString);

        if (index != -1) {
            char charBefore = mainString.charAt(index - 1);
            char charAfter = mainString.charAt(index + subString.length());
            System.out.println("The characters just before and after of the given sub-string's first occurrence is: " + charBefore + charAfter);
        } else {
            System.out.println("The given sub-string does not occur in the main string");
        }

        scanner.close();
    }
}