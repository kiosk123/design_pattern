package main;

public class Armor implements Defense {

    private Defense nextDefense;
    private int def;
    
    public Armor() {}
    public Armor(int def) {
        this.def = def;
    }
    
    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
    
    @Override
    public void defense(Attack attack) {
       process(attack);
       if (nextDefense != null) {
           nextDefense.defense(attack);
       }
    }
    
    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setDef(int def) {
        this.def = def;
    }
}
