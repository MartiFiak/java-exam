public class Bet extends Viewer {

    private String PilotName;
    private int Money;
    
    
    public Bet(String name, int money) {
        super(name, money);
    }
    
    
    public int getMoney() {
        return Money;
    }
    
    public String getPilotName() {
        return PilotName;
    }
    

    public Vehicle[] Win(int mise) {
        if (Vehicle[PilotName] <= 3) {
            Money *= 2;
        }
        Money 
    }
}

