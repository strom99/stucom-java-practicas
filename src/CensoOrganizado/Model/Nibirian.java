package CensoOrganizado.Model;

public class Nibirian extends Race {
    // they are spiritual beings and expert ship drivers
    private boolean redFloraFood;
    private boolean fishFeed;

    public Nibirian(String name){
        super(name);
    }

    public Nibirian(String name , boolean redFloraFood , boolean fishFeed){
        super(name);
        this.redFloraFood = redFloraFood;
        this.fishFeed = fishFeed;
    }

    public boolean isRedFloraFood() {
        return redFloraFood;
    }

    public void setRedFloraFood(boolean redFloraFood) {
        this.redFloraFood = redFloraFood;
    }

    public boolean isFishFeed() {
        return fishFeed;
    }

    public void setFishFeed(boolean fishFeed) {
        this.fishFeed = fishFeed;
    }

    @Override
    public String toString() {
        return "Nibiriano: " + getName()+
                " - Red Flora Food=" + redFloraFood +
                " - Fish Feed=" + fishFeed;
    }
}
