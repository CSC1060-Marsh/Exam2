import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        //This prints out the lottery score from the greenTicket method.
        System.out.println("Your score is " + greenTicket());
        //This executes the makeChocolate method.
        System.out.println(makeChocolate());
    }
    //This creates a greenTicket method to calculate lottery scores.
    public static int greenTicket() {
        //This adds a scanner to the program.
        Scanner sc = new Scanner(System.in);
        //This creates a new integer array to hold the 3 lottery numbers.
        int[] ticketStorage = new int[3];
        //This prompts the user to enter the first lottery number.
        System.out.println("Enter the first lottery number:");
        //This defines their input as the lottery number in the 0th place in the array.
        ticketStorage[0] = sc.nextInt();
        //This prompts the user to enter the second lottery number.
        System.out.println("Enter the second lottery number:");
        //This defines their input as the lottery number in the 1st place of the array.
        ticketStorage[1] = sc.nextInt();
        //This prompts the user to enter the final lottery number.
        System.out.println("Enter the third lottery number:");
        //This defines their input as the lottery number in the 2nd place of the array.
        ticketStorage[2] = sc.nextInt();
        //This executes the following if all the numbers are the same.
        if (ticketStorage[0] == ticketStorage[1] && ticketStorage[1] == ticketStorage[2]) {
            //This returns the score of 20.
            return 20;
            //This executes the following if two of the numbers are the same.
        } else if (ticketStorage[0] == ticketStorage[1] ||
                ticketStorage[0] == ticketStorage[2] || ticketStorage[1] == ticketStorage[2]) {
            //This returns the score of 10.
            return 10;
            //This executes the following if none of the numbers are the same.
        } else {
            //This returns the score of 0.
            return 0;
        }
    }
    //This creates a new makeChocolate method.
    public static int makeChocolate() {
        //This adds a scanner to the program.
        Scanner sc = new Scanner(System.in);
        //This prompts the user to enter the number of 1 pound chocolate bars.
        System.out.println("Enter the number of 1 pound chocolate bars:");
        //This defines the number of 1 pound bars as their input.
        int onePound = sc.nextInt();
        //This prompts the user to enter the number of 5 pound chocolate bars.
        System.out.println("Enter the number of 5 pound chocolate bars:");
        //This defines the number of 5 pound bars as their input.
        int fivePound = sc.nextInt();
        //This prompts the user to input the goal number of pounds of chocolate to sell.
        System.out.println("Enter the goal number of pounds to sell:");
        //This defines the goal as their input.
        int goalPounds = sc.nextInt();
        //This sets the counting mechanism of pounds sold to 0.
        int counter = 0;
        //This sets the number of 5 pound bars sold to 0.
        int numberFivePoundsSold = 0;
        //This sets the number of 1 pound bars sold to 0.
        int numberOnePoundsSold = 0;
        //This starts the if statement to execute if there are remaining 5 pound bars.
        if (fivePound > 0) {
            //This executes the following if another 5 pound bar can be added
            // without selling too much or running out of 5 pound bars.
            while (counter + 5 <= goalPounds && numberFivePoundsSold < fivePound) {
                //This adds 5 to the pounds of chocolate sold.
                counter = counter + 5;
                //This adds 1 5 pound bar to the number of 5 pound bars sold.
                numberFivePoundsSold++;
            }
        }
        //This starts the if statement to execute if there are remaining 1 pound bars.
        if (onePound > 0) {
            //This executes the following if another 1 pound bar can be added
            // without selling too much or running out of 1 pound bars.
            while (counter + 1 <= goalPounds && numberOnePoundsSold < onePound) {
                //This adds 1 to the pounds of chocolate sold.
                counter++;
                //This adds a single 1 pound bar to the number of 1 pound bars sold.
                numberOnePoundsSold++;
            }
        }
        //This starts the if statement to execute if the counter eventually hits the goal pounds sold.
        if (counter == goalPounds) {
            //This defines the integer i as the total number of bars sold.
            int i = numberFivePoundsSold + numberOnePoundsSold;
            //This returns the value of i.
            return i;
            //This executes the backup plan if the counter does not ever hit the goal chocolate sold.
        } else {
            //This returns -1 to inform the user that it is not possible to sell the goal with the inventory.
            return -1;
        }
    }
}
