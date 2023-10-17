import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        System.out.println(endOther());
    }

    public static boolean endOther() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = sc.nextLine().toLowerCase();
        System.out.println("Enter the second string:");
        String secondString = sc.nextLine().toLowerCase();
        System.out.println(firstString);
        System.out.println(secondString);

        if (!secondString.contains(firstString) || !firstString.contains(secondString)) {
            return true;
        } else {
            return false;
        }
    }
}
