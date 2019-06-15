/*
Create classes U1 and U2 that extend the Rocket class and override the land and
launch methods to calculate the corresponding chance of exploding and return either true or false
based on a random number using the probability equation for each.
U-1
Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)
 */
public class U1 extends Rocket{
    private int cost = 100000000;
    private int weight = 100000;
    private int maxCargo = 18000;
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

    @Override
    public  boolean launch(){
        double random = Math.random();
        chanceOfLandingCrash = 0.05 * getTotalWeight()/getMaxCargo();
        if (chanceOfLaunchExplosion >= random){
            return false;
        } else{
            return true;
        }

    }
    @Override
    public  boolean land(){
        double random = Math.random();
        chanceOfLandingCrash = 0.01 * getTotalWeight()/getMaxCargo();
        if (chanceOfLandingCrash >= random){
            return false;
        } else{
            return true;
        }

    }

}
