package Project1;

public class Market extends Trader {
    
    private char symbol;
    private double commission;
    private double tradeFee;
    private int orderSize;
    private double priceOffset;
    private BuyOrder bestBuyOrder;
    private BuyOrder secondBestBuyOrder;
    private SellOrder bestSellOrder;
    private SellOrder secondBestSellOrder;
    private MarketBuyOrder marketMakerBuyOrder;
    private MarketSellOrder marketMakerSellOrder;
    private String name;
    

    public Market(String name, char symbol, double tradeFee, double commission, int orderSize, double priceOffset){
        super(name);
        this.name = name;
        this.symbol = symbol;
        this.tradeFee = tradeFee;
        this.commission = commission;
        this.orderSize = orderSize;
        this.priceOffset = priceOffset;
    }

    public char getStockSymbol(){
        return symbol;
    }

    public double getCommission(){
        return commission;
    }

    public void setCommision(double commission){
        this.commission = commission;
    }

    public double getTradeFee(){
        return tradeFee;
    }

    public void setTradeFee(double tradeFee){
        this.tradeFee = tradeFee;
    }

    public int getMarketSize(){
        return orderSize;
    }

    public void setMarketSize(int size){
        orderSize = size;
    }

    public double getPriceOffset(){
        return priceOffset;
    }
    
    public void setPriceOffset(double priceOffset){
        this.priceOffset = priceOffset;
    }

    public BuyOrder getBestBuyOrder(){
        return bestBuyOrder;
    }

    public BuyOrder get2ndBestBuyOrder(){
        return secondBestBuyOrder;
    }

    public SellOrder getBestSellOrder(){
        return bestSellOrder;
    }

    public SellOrder get2ndBestSellOrder(){
        return secondBestSellOrder;
    }

    public MarketBuyOrder getMarketBuyOrder(){
        return marketMakerBuyOrder;
    }

    public MarketSellOrder getMarketSellOrder(){
        return marketMakerSellOrder;
    }

    



}
