package CensoOrganizado.Model;

public class Andorian extends Race {
    // they are warriors and fervent defenders of their family
    private String range;
    //Some Andorians live under the ice of the poles.(aenar)
    private boolean Aenar;

    public Andorian(String name , String range , boolean aenar){
        super(name, 2);
        this.range = range;
        this.Aenar = aenar;
    }
    public Andorian(String name){
        super(name , 2);
    }

    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }

    public boolean isAenar() {
        return Aenar;
    }

    public void setAenar(boolean aenar) {
        Aenar = aenar;
    }

    @Override
    public String toString() {
        return "Andorian: " + getName()+
                "- range:'" + range + '\'' +
                "- Aenar: " + Aenar +
                "- civilizationLevel: " + civilizationLevel ;
    }
}
