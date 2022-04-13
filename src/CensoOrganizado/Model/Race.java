package CensoOrganizado.Model;

public class Race {

    private String name;
    public int civilizationLevel;
    // aggregation of planets
    public Race(){}

    public Race(String name){
        this.name = name;
    }
    public Race(String name, int civilizationLevel) {
        this.name = name;
        this.civilizationLevel = civilizationLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCivilizationLevel() {
        return civilizationLevel;
    }

    public void setCivilizationLevel(int civilizationLevel) {
        this.civilizationLevel = civilizationLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Race)) {
            return false;
        }
        final Race other = (Race) obj;

        return this.getName().equalsIgnoreCase(other.getName());
    }

    @Override
    public String toString() {
        return "Species: "+ name + "\n" +
                "[civilizationLevel: " + civilizationLevel +
                ']';
    }
}
