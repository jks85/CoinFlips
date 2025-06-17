public class Main {
    
    public static void main(String[] args){

        // create coin memory and coin flipper
        CoinMemory coinBank = new CoinMemory();
        CoinFlipper coinTosser = new CoinFlipper(coinBank);

        // // testing UI
        UserInterface UI = new UserInterface(coinBank, coinTosser);
        UI.start();




        // testing CoinMemory and CoinFlipper
        // // flip coins
        // System.out.println("Flipping coins...");
        // coinTosser.flipNCoins(3000);

        // // check some results
        // System.out.println("Results...");
        // // System.out.println("Number of flips: " + coinBank.getNumFlips());
        // // System.out.println("Number of heads: " + coinBank.getNumHeads());   
        // // System.out.println("Number of tails: " + coinBank.getNumTails());
        // System.out.println("");
        // System.out.println(coinBank);

    }
}
