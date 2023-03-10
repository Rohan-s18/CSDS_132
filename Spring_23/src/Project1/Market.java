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
    

    public Market(String name, char symbol, double tradeFee, double commission, int orderSize, double priceOffset){
        super(name);
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

    public int getMarketOrderSize(){
        return orderSize;
    }

    public void setMarketOrderSize(int size){
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

    public void setMarketBuyOrder(MarketBuyOrder marketBuyOrder){
        this.marketMakerBuyOrder = marketBuyOrder;
    }

    public void setMarketSellOrder(MarketSellOrder marketSellOrder){
        this.marketMakerSellOrder = marketSellOrder;
    }

    public double currentMarketBuyPrice(){
        if(getBestBuyOrder() != null) return getBestBuyOrder().getPrice();
        return marketMakerBuyOrder.getPrice();
    }

    public double currentMarketSellPrice(){
        if(getBestSellOrder() != null) return getBestSellOrder().getPrice();
        return marketMakerSellOrder.getPrice();
    }

    public boolean isOpen(){
        return (marketMakerBuyOrder!=null && marketMakerSellOrder!=null);
    }
    
    public boolean isValidOrder(Order order){
        return ((order.getStockSymbol()==this.getStockSymbol()) && (order.getPrice()>=this.marketMakerBuyOrder.getPrice()) && (order.getPrice() <= this.marketMakerSellOrder.getPrice()));
    }

    public boolean matchingOrders(BuyOrder buyOrder, SellOrder sellOrder){
        return ((buyOrder.getPrice()>=sellOrder.getPrice()) && ((!buyOrder.isAllOrNone() && !sellOrder.isAllOrNone()) || (sellOrder.isAllOrNone() && (buyOrder.getNumberShares() >= sellOrder.getNumberShares())) || (buyOrder.isAllOrNone() && (sellOrder.getNumberShares() >= buyOrder.getNumberShares()))));
    }

    public void addOrderToMarket(BuyOrder buyOrder){
        if(buyOrder.getStockSymbol() != this.getStockSymbol()) return;
        if(bestBuyOrder==null)bestBuyOrder=buyOrder;
        else if(buyOrder.getPrice() > bestBuyOrder.getPrice()){
            secondBestBuyOrder = bestBuyOrder;
            bestBuyOrder = buyOrder;
        }
        else if(secondBestBuyOrder==null)secondBestBuyOrder=buyOrder;
        else if(buyOrder.getPrice() > secondBestBuyOrder.getPrice())secondBestBuyOrder=buyOrder;
        else return;
    }

    public void addOrderToMarket(SellOrder sellOrder){
        if(sellOrder.getStockSymbol() != this.getStockSymbol()) return;
        if(bestSellOrder==null)bestSellOrder=sellOrder;
        else if(sellOrder.getPrice() < bestSellOrder.getPrice()){
            secondBestSellOrder = bestSellOrder;
            bestSellOrder = sellOrder;
        }
        else if(secondBestSellOrder==null)secondBestSellOrder=sellOrder;
        else if(sellOrder.getPrice() < secondBestSellOrder.getPrice())secondBestSellOrder=sellOrder;
        else return;
    }

    public Transaction placeOrder(BuyOrder buyOrder){
        if(!this.isOpen() || !this.isValidOrder(buyOrder)) return null;
        if(matchingOrders(buyOrder, bestSellOrder)){
            Transaction transaction = new Transaction(getStockSymbol(), Math.min(buyOrder.getNumberShares(), getBestSellOrder().getNumberShares()) , getBestSellOrder().getPrice(), buyOrder.getTrader(), getBestSellOrder().getTrader(), this);
            bestSellOrder = secondBestSellOrder;
            secondBestSellOrder = null;
            return transaction;
        }
        if(matchingOrders(buyOrder, secondBestSellOrder)){
            Transaction transaction = new Transaction(getStockSymbol(), Math.min(buyOrder.getNumberShares(), get2ndBestSellOrder().getNumberShares()) , get2ndBestSellOrder().getPrice(), buyOrder.getTrader(), get2ndBestSellOrder().getTrader(), this);
            secondBestSellOrder = null;
            return transaction;
        }
        if(matchingOrders(buyOrder, marketMakerSellOrder)){
            Transaction transaction = new Transaction(getStockSymbol(), Math.min(buyOrder.getNumberShares(), getMarketOrderSize()) , getMarketSellOrder().getPrice()+getPriceOffset(), buyOrder.getTrader(), getMarketSellOrder().getTrader(), this);
            return transaction;
        }
        addOrderToMarket(buyOrder);
        return null;
    }

    public Transaction placeOrder(SellOrder sellOrder){
        if(!this.isOpen() || !this.isValidOrder(sellOrder)) return null;
        if(matchingOrders(getBestBuyOrder(), sellOrder)){
            Transaction transaction = new Transaction(getStockSymbol(), Math.min(getBestBuyOrder().getNumberShares(), sellOrder.getNumberShares()) , getBestBuyOrder().getPrice(), getBestBuyOrder().getTrader(), getBestSellOrder().getTrader(), this);
            bestBuyOrder = secondBestBuyOrder;
            secondBestBuyOrder = null;
            return transaction;
        }
        if(matchingOrders(get2ndBestBuyOrder(), sellOrder)){
            Transaction transaction = new Transaction(getStockSymbol(), Math.min(get2ndBestBuyOrder().getNumberShares(), sellOrder.getNumberShares()) , get2ndBestBuyOrder().getPrice(), get2ndBestBuyOrder().getTrader(), get2ndBestSellOrder().getTrader(), this);
            secondBestBuyOrder = null;
            return transaction;
        }
        if(matchingOrders(getMarketBuyOrder(), sellOrder)){
            Transaction transaction = new Transaction(getStockSymbol(), Math.min(getMarketBuyOrder().getNumberShares(), sellOrder.getNumberShares()) , getMarketBuyOrder().getPrice()+getPriceOffset(), getMarketBuyOrder().getTrader(), getMarketSellOrder().getTrader(), this);
            return transaction;
        }
        addOrderToMarket(sellOrder);
        return null;
    }



}
