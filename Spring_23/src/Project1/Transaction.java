package Project1;

public class Transaction {
    
    private char stockSymbol;
    private int numShares;
    private double price;
    private Trader buyer;
    private Trader seller;
    private Market maker;
    private boolean isClosed;

    public Transaction(char stockSymbol, int numShares, double price, Trader buyer, Trader seller, Market maker){
        this.stockSymbol = stockSymbol;
        this.numShares = numShares;
        this.price = price;
        this.buyer = buyer;
        this.seller = seller;
        this.maker = maker;
    }

    public char getStockSymbol(){
        return stockSymbol;
    }

    public int getNumberShares(){
        return numShares;
    }

    public double getPrice(){
        return price;
    }

    public Trader getBuyer(){
        return buyer;
    }

    public Trader getSeller(){
        return seller;
    }

    public Market getMarketMaker(){
        return maker;
    }

    public boolean isClosed(){
        return isClosed;
    }

    public void processTransaction(){
        if(isClosed) return;
        getBuyer().withdraw(getNumberShares()*getPrice() + (maker.getTradeFee() + (maker.getCommission()*getNumberShares())));
        getSeller().deposit(getNumberShares()*getPrice() - (maker.getTradeFee() + (maker.getCommission()*getNumberShares())));
        isClosed=true;
    }


}
