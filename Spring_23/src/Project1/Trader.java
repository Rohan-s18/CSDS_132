package Project1;

public class Trader {

    private String name;
    private double balance;

    public Trader(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void withdraw(double input){
        balance-=input;
    }

    public void deposit(double input){
        balance+=input;
    }

    public double getBalance(){
        return balance;
    }
    
}
