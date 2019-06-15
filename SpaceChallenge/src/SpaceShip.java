/*Create a SpaceShip Interface that includes the definitions of these methods:

        launch: a method that returns either true or false indicating if the launch was successful or if the rocket has crashed.
        land: a method that also returns either true or false based on the success of the landing.
        canCarry: a method that takes an Item as an argument and returns true if the rocket can carry such item or false if it will exceed the weight limit.
        carry: a method that also takes an Item object and updates the current weight of the rocket.
        Create a class Rocket that implements the SpaceShip Interface and hence implements all the methods above.

        launch and land methods in the Rocket class should always return true. When U1 and U2 classes extend the Rocket class they will override these methods to return true or false based on the actual probability of each type.
        carry and canCarry should be implemented here and will not need to be overridden in the U1 and U2 classes
        Create classes U1 and U2 that extend the Rocket class and override the land and launch methods to calculate the corresponding chance of exploding and return either true or false based on a random number using the probability equation for each.
*/
public class SpaceShip {
}
