public class Coin{
    /* Coin object for coin flipper. Constructor has no parameters
     * because side of coin is unknown prior to flipping it
     */

    private String side;

    public Coin(){
        // constructor has no parameters
        this.side = "";         
    }

    public String getSide(){
        return this.side;
    }

    public void setSideToHeads(){
        this.side = "heads";
    }

    public void setSideToTails(){
        this.side = "tails";
    }
}