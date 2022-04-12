package CensoOrganizado.Model;

public class Klingonian extends Race {
    //They are excellent warriors and like to assess their level of strength.
    private int strengthLevel ;

    public Klingonian(String name){
        super(name);
    }
    public Klingonian(String name , int strengthLevel){
        super(name , 3);
        this.strengthLevel = strengthLevel;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    @Override
    public String toString() {
        return "Klingonian: " + getName()+
                " - Civilization Level: " + civilizationLevel +
                " - Strength Level=" + strengthLevel ;
    }
}
