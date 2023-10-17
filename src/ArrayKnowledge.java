import java.util.Arrays;
import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray()));
        System.out.println(Arrays.toString(generateArrayWithBounds()));
    }

    public static char[] stringToArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String originalInput = sc.nextLine();
        int inputLength = originalInput.length();
        char[] stringArray = new char[inputLength];
        for (int i = 0; i <= inputLength - 1; i++) {
            stringArray[i] = originalInput.charAt(i);
        }
        return stringArray;
    }

    public static int[] generateArrayWithBounds() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting integer:");
        int start = sc.nextInt();
        System.out.println("Enter the ending integer:");
        int end = sc.nextInt();
        System.out.println("Enter the integer step:");
        int step = sc.nextInt();
        int numberIntegers = end - start;
        int[] boundedArray = new int[numberIntegers];

        for (int i = 0; i <= numberIntegers - 1; i++) {
            boundedArray[i] = start;
            start = start + step;
        }
        return boundedArray;
    }
}
