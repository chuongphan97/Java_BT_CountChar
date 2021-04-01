import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        int count = 0;

        System.out.println("Enter char you want find in string: ");
        char a = scanner.next().charAt(0);

        char[] strArray = str.toCharArray();

        for (char s : strArray) {
            if (s == a) count += 1;
        }
        if (count == 0) System.out.println("No have char in that string!");
        else System.out.println("Have "+count+" char "+a+" in that string!");
    }
}
