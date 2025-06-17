
import java.util.Random;

public class CoinFlipper {
    /*
     * Flips Coin objects. Interacts with CoinMemory object
     * Currently creates a new set of results each time flipNCoins() is called
     * 
     */

     private Random tosser;
     private CoinMemory tossResults;    // holds results of each flip in a Map
     // private int flipCounter;           // currently not used. Could use to extend memory for separate groups of flips

    public CoinFlipper(CoinMemory tossResults){
        this.tosser = new Random();         // flipper creates its own randomizer
        this.tossResults = tossResults;     // flipper receives a CoinMemory object
        // this.flipCounter = 0;
        
    }

    private Coin flipCoin(Coin coin){
        // flip coin and set result
        // set to private. Used by class for flipNCoins()
        
        if(tosser.nextInt(2) == 0){
                coin.setSideToHeads();  // 0 = H
    
        } else{
                coin.setSideToTails();  // 1 = T;
        }

        return coin;
    }


    public void flipNCoins(int N){
        // flip n coins. N is a positive integer
        // map is reset each time since index starts at 0
        // results are saved into Coin Memory object (not yet created)

        for (int index = 0; index < N; index++){
            Coin tempCoin = this.flipCoin(new Coin());  // flip new coin
            tossResults.setFlipN(tempCoin, index);
        }
    }

}
