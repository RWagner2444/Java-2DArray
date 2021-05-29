
/**
 * Object class for 2D Array tester
 * 3/25/2021
 * Ryan Wagner
 */
public class Catapult
{
    private String fruit;
    private String units;
    private int[] speeds;
    private int[] degrees;
    
    public Catapult(String fruit, String units, int[] speeds, int[] degrees){
        this.fruit = fruit;
        this.units = units;
        this.speeds = speeds;
        this.degrees = degrees;
    }
    
    public String getFruit(){
        return fruit;
    }
    
    public void setFruit(String fruit){
        this.fruit = fruit;
    }
    
    public String getUnit(){
        return units;
    }
    
    public void setUnits(String units){
        this.units = units;
    }
    
    public int[] getSpeeds(){
        return speeds;
    }
    
    public void setSpeeds(int[] speeds){
        this.speeds = speeds;
    }
    
    public int[] getDegrees(){
        return degrees;
    }
    
    public void setDegrees(int[] degrees){
        this.degrees = degrees;
    }
}
