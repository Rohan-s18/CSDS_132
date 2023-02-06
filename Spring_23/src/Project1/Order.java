package Project1;

public class Order {

    private int numShares;
    private double price;
    private Trader trader;
    private boolean allOrNone;
    private char symbol;

    public Order(int numShares, double price, Trader trader, boolean allOrNone, char symbol){
        this.numShares = numShares;
        this.allOrNone = allOrNone;
        this.trader = trader;
        this.symbol = symbol;
        this.price = price;
    }

    public char getStockSymbol(){
        return symbol;
    }

    public int getNumberShares(){
        return numShares;
    }

    public void setNumberShares(int numShares){
        this.numShares = numShares;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setAllOrNone(boolean allOrNone){
        this.allOrNone = allOrNone;
    }

    public boolean isAllOrNone(){
        return allOrNone;
    }

    public Trader getTrader(){
        return trader;
    }



    
}
