package Project1;

public class MarketBuyOrder extends BuyOrder {
    
    public MarketBuyOrder(int numShares, double price, Trader trader, char symbol){
        super(numShares,price,trader,false,symbol);
    }

    public boolean isAllOrNone(){
        return false;
    }

}
