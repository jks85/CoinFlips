
import java.util.Scanner;

public class UserInterface {
    /*
     * UI for coin class. Recives a coin flipper and a coin memory.
     * Prompts user for number of flips and summarizes results
     */

     
     private CoinMemory coinBank;       // coin memory object
     private CoinFlipper tosser;        // RNG coin flipper
     private Scanner scanner;

     public UserInterface(CoinMemory coinBank, CoinFlipper tosser){
        this.coinBank = coinBank;
        this.tosser = tosser;
        this.scanner = new Scanner(System.in);

     }

     public void start(){
        
        boolean userHasQuit = false;
        
        System.out.println("----------------------------");
        System.out.println("Welcome to the Coin Flipper!");
        System.out.println("----------------------------");
        System.out.println("");
        while(true){
            // get user input
            
            System.out.println("Enter the number of the command you wish to execute:");
            System.out.println("1: Flip coins");
            System.out.println("2: See results");
            System.out.println("3: Check a coin");
            System.out.println("4: Quit");
            System.out.print("Command number: ");

            Integer userInput = Integer.valueOf(scanner.nextLine());
            // Integer userInput = scanner.nextInt();

            if (userInput == 4){
                userHasQuit = true;
                break;
            } else if (userInput == 1){
                // run program
                System.out.print("How many coins? ");
                

                int numCoins = Integer.valueOf(scanner.nextLine());
                tosser.flipNCoins(numCoins);
                System.out.println("");
                System.out.println(numCoins + " coins flipped.");
                System.out.println("Press 2 to see results.");
                System.out.println("");


            } else if (userInput == 2){
                // See results: print coin bank
                System.out.println("Showing results...");
                System.out.println("-------------------");
                System.out.println(coinBank);
                System.out.println("-------------------");
                System.out.println("");
            } else if (userInput == 3){
                int currentNumFlips = coinBank.getNumFlips();
                
                if (currentNumFlips == 0){
                    System.out.println("You have not flipped any coins yet!");
                    System.out.println("");
                    continue;
                }
                System.out.println("");
                System.out.println("There are " + currentNumFlips +  " coins. Which coin do you want to check?");
                System.out.print("Coin number: ");

                
                int coin_num = Integer.valueOf(scanner.nextLine());
                
                
                if (coin_num < 1 | coin_num > currentNumFlips){
                    System.out.println("Invalid coin number.");
                    System.out.println("");
                    
                } else {
                    System.out.println("");
                    System.out.println("Flip number " + coin_num + ": " + coinBank.getFlipN((coin_num)));
                    System.out.println("");
                }
            } else {
                // bad input (not a positive integer)
                System.out.println("Invalid command! Please input 1 or 2.");
                System.out.println("");
            }
        
        }

        if (userHasQuit){
            System.out.println("");
            System.out.println("--------");
            System.out.println("Goodbye!");
            System.out.println("--------");
        }
     }

}
