import java.util.Arrays;
import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        //This executes the stringToArray program.
        System.out.println(Arrays.toString(stringToArray()));
        //This executes the generateArrayWithBounds program.
        System.out.println(Arrays.toString(generateArrayWithBounds()));
    }
    //This creates a new method called stringToArray.
    public static char[] stringToArray() {
        //This adds a scanner to the program.
        Scanner sc = new Scanner(System.in);
        //This prompts the user to input their string.
        System.out.println("Please enter your string:");
        //This defines their input as their response to the prompt.
        String originalInput = sc.nextLine();
        //This takes the length of their input.
        int inputLength = originalInput.length();
        //This creates a character array with the length of their input.
        char[] stringArray = new char[inputLength];
        //This starts a for loop, executing the interior when i is less than or equal to the input length.
        for (int i = 0; i <= inputLength - 1; i++) {
            //This takes the character at the ith place in the string
            // and inserts it into the array at the ith place in the array.
            stringArray[i] = originalInput.charAt(i);
        }
        //This returns the stringArray to the main method to be printed out.
        return stringArray;
    }
    //This creates the generateArrayWithBounds method.
    public static int[] generateArrayWithBounds() {
        //This adds a scanner to the program.
        Scanner sc = new Scanner(System.in);
        //This prompts the user to enter the starting integer.
        System.out.println("Enter the starting integer:");
        //This defines their starting integer.
        int start = sc.nextInt();
        //This prompts the user to enter the ending integer.
        System.out.println("Enter the ending integer:");
        //This defines their ending integer.
        int end = sc.nextInt();
        //This promps the user to enter their step integer.
        System.out.println("Enter the integer step:");
        //This defines their step integer.
        int step = sc.nextInt();
        //This calculates the number of integers in the array.
        int numberIntegers = ((end - start) / step) + 1;
        //This creates the boundedArray as an integer array with the number of integers calculated above.
        int[] boundedArray = new int[numberIntegers];
        //This starts a for loop executing when i is less than or equal to the number of integers.
        for (int i = 0; i <= numberIntegers - 1; i++) {
            //This inserts the starting integer in the array at the ith place.
            boundedArray[i] = start;
            //This redefines the starting integer as the previous starting integer plus the stepping integer.
            start = start + step;
        }
        //This passes the boundedArray to the main method to be printed out.
        return boundedArray;
    }
}
