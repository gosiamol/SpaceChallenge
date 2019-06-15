import java.util.Random;

/*
Create classes U1 and U2 that extend the Rocket class and override the land and
launch methods to calculate the corresponding chance of exploding and return either true or false
based on a random number using the probability equation for each.
U-2
Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)
*/
public class U2 extends Rocket {
    private int cost = 120000000;
    private int weight = 180000;
    private int maxCargo = 29000;
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

    @Override
    public  boolean launch(){
        double random = Math.random();
        chanceOfLandingCrash = 0.04 * getTotalWeight()/getMaxCargo();
        if (chanceOfLaunchExplosion >= random){
            return false;
        } else{
            return true;
        }

    }
    @Override
    public  boolean land(){
        double random = Math.random();
        chanceOfLandingCrash = 0.08 * getTotalWeight()/getMaxCargo();
        if (chanceOfLandingCrash >= random){
            return false;
        } else{
            return true;
        }

    }
}
