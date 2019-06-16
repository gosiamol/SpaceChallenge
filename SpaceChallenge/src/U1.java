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
    public U1 () {
        cost = 100; //mln
        weight = 10000;
        maxCargo = 18000;
       }
    @Override
    public  boolean launch(){
        int random = (int)(Math.random()*100 +1);

        chanceOfLandingCrash = 5.0 * (this.currentWeight)/(this.maxCargo);

        return chanceOfLaunchExplosion <= random;

    }
    @Override
    public  boolean land(){
        int random = (int)(Math.random()*100 +1);

        chanceOfLandingCrash = 1.0 * (this.currentWeight)/(this.maxCargo);

        return chanceOfLandingCrash <= random;

    }


}
