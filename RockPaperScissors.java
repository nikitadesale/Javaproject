import java.util.Random;
import java.util.Scanner;
public class Application {
public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors; Let's Play!");
        Scanner playerName = new Scanner(System.in);
        Scanner roundsToWin = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String text = playerName.nextLine();
        System.out.println("Hello, " + text + "\nHow many rounds would you like to play?");
        int rounds = roundsToWin.nextInt();
        int value = 0;
        int player = 0;
        int computer = 0;
        do {
            // System.out.println("Current rounds played: " + value);
            String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
            Random random = new Random();
            Scanner playerChoice = new Scanner(System.in);
            System.out.println("Please enter Rock, Paper or Scissors: \nCapitilization Matters!");
            String choice = playerChoice.nextLine();
            System.out.println();
            int select = random.nextInt(rockPaperScissors.length);
            System.out.println("Computer selection: " + rockPaperScissors[select]);
            System.out.println("Your selection: " + choice);
            System.out.println();
            if (choice.equals(rockPaperScissors[select])) {
                System.out.println("It is a Tie");
            }
            else {
                if(choice.equals("Rock")) {
                    if(rockPaperScissors[select].equals(rockPaperScissors[1])) {
                        System.out.println("Paper beats rock.");
                        computer++;
                    }
                    if(rockPaperScissors[select].equals(rockPaperScissors[2])) {
                        System.out.println("Rock beats scissors.");
                        player++;
                    }
                }
                if(choice.equals("Paper")) {
                    if(rockPaperScissors[select].equals(rockPaperScissors[0])) {
                        System.out.println("Paper beats rock.");
                        player++;
                    }
                    if(rockPaperScissors[select].equals(rockPaperScissors[2])) {
                        System.out.println("Scissors beat paper.");
                        computer++;
                    }
                }
                if(choice.equals("Scissors")) {
                    if(rockPaperScissors[select].equals(rockPaperScissors[0])) {
                        System.out.println("Rock beats scissors.");
                        computer++;
                    }
                    if(rockPaperScissors[select].equals(rockPaperScissors[1])) {
                        System.out.println("Scissors cuts paper.");
                        player++;
                    }   }   }
            System.out.println();
            System.out.println(text + ": " + player);
            System.out.println("Computer: " + computer);
            System.out.println();
            System.out.println();
            try {
                Thread.sleep(3000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            value++;
        }
        while(value < rounds);
        System.out.println("Final Score!");
        System.out.println(text + ": " + player);
        System.out.println("Computer:" + computer);
        System.out.println();
        if(computer > player) {
            System.out.println("You Lose! Computer Wins");
        }
        if(player > computer) {
            System.out.println("Congratulations " + text + ", You won!");
     }
  }
}
