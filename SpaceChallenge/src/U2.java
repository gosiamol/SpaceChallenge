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
    public U2 () {
         cost = 120;
         weight = 18000;
         maxCargo = 29000;
    }
    @Override
    public  boolean launch(){
        int random = (int)(Math.random()*100 +1);

        chanceOfLandingCrash = 4 * (this.currentWeight)/(this.maxCargo);

        return chanceOfLaunchExplosion <= random;

    }
    @Override
    public  boolean land(){
        int random = (int)(Math.random()*100 +1);

        chanceOfLandingCrash = 8 * (this.currentWeight)/(this.maxCargo);

        return chanceOfLandingCrash <= random;

    }
}
