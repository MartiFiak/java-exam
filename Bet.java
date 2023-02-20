public class Bet {

    


    private String PilotName;
    private int Money;
    
    
    public Bet(String pilotName, int money) {
        this.PilotName = pilotName;
        this.Money = money;
    }
    
    
    public int getMoney() {
        return Money;
    }
    
    public String getPilotName() {
        return PilotName;
    }
    

    public int Win(Vehicle[] ranking) {
        for (int i = 0; i < 3; i++) {
            if (ranking[i].getPilotName().equals(PilotName)) {
                return 2 * Money;
            }
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Bet " + this.getMoney() + "€ on " + this.getPilotName();
    }
}

