package CensoOrganizado.Model;

public class Vulcanian extends Race {
    //  is a species that bases its lifestyle on reason and logic
    private int meditationLevel;

    public Vulcanian(String name){
        super(name, 3);
    }
    public Vulcanian(String name , int meditationLevel){
        super(name, 3);
        this.meditationLevel = meditationLevel;
    }

    public int getMeditationLevel() {
        return meditationLevel;
    }

    public void setMeditationLevel(int meditationLevel) {
        this.meditationLevel = meditationLevel;
    }

    @Override
    public String toString() {
        return "Vulcaniano: " +getName()+
                " - nivelCivilizacion=" + civilizationLevel +
                " - Meditation Level=" + meditationLevel;
    }
}
