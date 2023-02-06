package Project1;

public class MarketSellOrder extends SellOrder {
    
    public MarketSellOrder(int numShares, double price, Market trader, char symbol){
        super(numShares,price,trader,false,symbol);
    }

    public boolean isAllOrNone(){
        return false;
    }

}