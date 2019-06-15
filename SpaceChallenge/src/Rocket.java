/*
Create a class Rocket that implements the SpaceShip Interface and
hence implements all the methods above.

launch and land methods in the Rocket class should always return true.
When U1 and U2 classes extend the Rocket class they will override these methods to return true or false
based on the actual probability of each type.

carry and canCarry should be implemented here and will not need to be overridden in the U1 and U2 classes
 */
public class Rocket implements SpaceShip{
    private int currentWeight;
    private int weight;
    private int maxCargo;
    private double totalWeight = currentWeight + weight;
    private int cost;

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
        if (maxCargo >= (currentWeight + item.getWeight())){
            return true;
        } else{
            //nie miesci sie
            return false;
        }
    }
    @Override
    public void carry(Item item){
        currentWeight += item.getWeight();
    }
    public  double getMaxCargo(){
        return maxCargo;
    }
    public double getTotalWeight(){
        totalWeight = getCurrentWeight() + getWeight();
        return totalWeight;
    }
    public int getCurrentWeight(){
        return  currentWeight;
    }
    public double getWeight(){
        return weight;
    }
}
