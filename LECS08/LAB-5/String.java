import java.util.Scanner;

public class String{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mString = scanner.nextLine();
        System.out.println("Enter the sub-string to be searched in the given string:");
        String tString = scanner.nextLine();

        int index = mString.indexOf(tString);
        if (index != -1) {
            if (index == 0) {
                System.out.println("The characters just before and after of the given sub-string's first occurrence is: " + mString.charAt(index + tString.length()));
            } else if (index + tString.length() == mString.length()) {
                System.out.println("The characters just before and after of the given sub-string's first occurrence is: " + mString.charAt(index - 1));
            } else {
                System.out.println("The characters just before and after of the given sub-string's first occurrence is: " + mString.charAt(index - 1) + "" + mString.charAt(index + tString.length()));
            }
        } else {
            System.out.println("The given sub-string does not occur in the main string");
        }
    }
}

