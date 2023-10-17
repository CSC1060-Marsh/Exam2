import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        System.out.println("Your score is " + greenTicket());
        System.out.println(makeChocolate());
    }

    public static int greenTicket() {
        Scanner sc = new Scanner(System.in);
        int[] ticketStorage = new int[3];
        System.out.println("Enter the first lottery number:");
        ticketStorage[0] = sc.nextInt();
        System.out.println("Enter the second lottery number:");
        ticketStorage[1] = sc.nextInt();
        System.out.println("Enter the third lottery number:");
        ticketStorage[2] = sc.nextInt();
        if (ticketStorage[0] == ticketStorage[1] && ticketStorage[1] == ticketStorage[2]) {
            return 20;
        } else if (ticketStorage[0] == ticketStorage[1] || ticketStorage[0] == ticketStorage[2] || ticketStorage[1] == ticketStorage[2]) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int makeChocolate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of 1 pound chocolate bars:");
        int onePound = sc.nextInt();
        System.out.println("Enter the number of 5 pound chocolate bars:");
        int fivePound = sc.nextInt();
        System.out.println("Enter the goal number of pounds to sell:");
        int goalPounds = sc.nextInt();
        int counter = 0;
        int numberFivePoundsSold = 0;
        int numberOnePoundsSold = 0;

        if (fivePound > 0) {
            while (counter + 5 <= goalPounds && numberFivePoundsSold < fivePound) {
                counter = counter + 5;
                numberFivePoundsSold++;
            }
        }

        if (onePound > 0) {
            while (counter + 1 <= goalPounds && numberOnePoundsSold < onePound) {
                counter++;
                numberOnePoundsSold++;
            }
        }

        if (counter == goalPounds) {
            int i = numberFivePoundsSold + numberOnePoundsSold;
            return i;
        } else {
            return -1;
        }
    }
}
