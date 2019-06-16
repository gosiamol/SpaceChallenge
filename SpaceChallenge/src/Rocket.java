/*
Create a class Rocket that implements the SpaceShip Interface and
hence implements all the methods above.

launch and land methods in the Rocket class should always return true.
When U1 and U2 classes extend the Rocket class they will override these methods to return true or false
based on the actual probability of each type.

carry and canCarry should be implemented here and will not need to be overridden in the U1 and U2 classes
 */
public class Rocket implements SpaceShip{
    int currentWeight;
    int weight;
    int maxCargo;
    int cost;
    double chanceOfLaunchExplosion;
    double chanceOfLandingCrash;

    @Override
    public  boolean launch(){
        return true;
    }
    @Override
    public boolean land(){
        return true;
    }
    @Override
    public boolean canCarry(Item item){
        return (this.currentWeight + item.weight) <= maxCargo;
    }
    @Override
    public int carry(Item item){

        this.currentWeight += item.weight;
        return currentWeight;
    }



}
