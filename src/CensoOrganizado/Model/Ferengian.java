package CensoOrganizado.Model;

public class Ferengian extends Race {
    /* their main characteristic is the desire for wealth and they are guided by the Rules of
     Acquisition (“A Ferengi without wealth is not a Ferengi”, among others…). They treasure Latinum.*/
    private int latinum;

    public Ferengian(){}
    public Ferengian(String name){
        super(name);
    }
    public Ferengian(String name , int latinum) {
        super(name, 1);
        this.latinum = latinum;
    }

    public int getLatinum() {
        return latinum;
    }
    public void setLatinum(int latinum) {
        this.latinum = latinum;
    }

    public static int latinumRestriction(int latinum){
        if(latinum <= 0 ){
            System.out.println("the amount you want to deposit is low");
        }
        return latinum;
    }
    @Override
    public String toString() {
        return "Ferengian: " + getName()+
                " - Civilization Level: " + civilizationLevel +
                " - Latinum: " + latinum ;

    }
}
