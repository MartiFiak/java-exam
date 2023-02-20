public class Viewer {

    private String Name;
    private int Money;
    private Bet Bet;
    
    
    

    public Viewer(String name, int money) {
        Name = name;
        Money = money;
    }
    
    
    public Bet getBet() {
        return Bet;
    }
    public void setBet(Bet bet) {
        Bet = bet;
    }

    public int getMoney() {
        return Money;
    }
    public void setMoney(int money) {
        Money = money;
    }


    public String getName() {
        return Name;
    }
    
    @Override
    public String toString() {
        return "My name is " + getName() + " and I've " + getMoney() + "$";
    }
}
