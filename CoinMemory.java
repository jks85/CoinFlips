
import java.util.Map;
import java.util.HashMap;

public class CoinMemory {
    
    private Map<Integer, Coin> results;     // flip results. maps index to heads or tails

    public CoinMemory(){
        this.results  = new HashMap<>();
        //System.out.println("coin memory created");
    }

    public int getNumFlips(){
        // return number of flips

        if (this.results.isEmpty()){
            return 0;           // null map case
        }

        return this.results.size();
    }

    public int getNumHeads(){
        // return number of heads flipped
        
        if (this.results.isEmpty()){
            return 0;           // null map case
        }

        int numHeads = 0;

        for (Coin coin : this.results.values()){
            if (coin.getSide().equals("heads")){
                numHeads++;
            }

        }
        
        return numHeads;
    }

    public int getNumTails(){
        // return number of tails flipped

        if (this.results.isEmpty()){
            return 0;           // null map case
        }

        return this.getNumFlips() - this.getNumHeads();
    }

    public String getFlipN(int N){
        // return result of nth flip
        // requires positive integer N

        if (N < 1 ){
            return "Choose a positive integer";               // for non positive integer 
        }

        if (this.results.isEmpty()){
            return "The coin has not been flipped";           // null map case
        }

        int index = N-1;
        Coin NthCoin = this.results.get(index);
        return NthCoin.getSide();
    }

    public void setFlipN(Coin coin, int N){
        // set Nth flip result
        this.results.put(N, coin);
    }

    public String toString(){
        String results;

        results = "Number of heads: " + this.getNumHeads() + "\n" +
                  "Number of tails: " + this.getNumTails() + "\n" +
                  "Number of flips: " + this.getNumFlips();

        return results;
    }
}
