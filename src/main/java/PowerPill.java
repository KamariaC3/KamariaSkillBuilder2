
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    // TODO - replace this line with instruction from step 1
    static int DEFAULT_POWER = 10;
    int power;
    // instance variables
    // TODO - replace this line with instruction from step

    // TODO - replace this line with instruction from step 3
    String name;
    // constructors

    public PowerPill(String name){
        this.name = name;
        this.power = DEFAULT_POWER;
    }

    public PowerPill(String name, int power){
        this.power = power;
        this.name = name;
    }

    // Powerpill p = new Powerpill("purple")
    // TODO - replace this line with instruction from step 4
    public int getPower(){
        return power;
    }
    public String getName(){
        return name;
    }
    // TODO - replace this line with instruction from step 5
    // accessor methods
    public void setPower(int power) {
        this.power = power;
    }
    public void setName(String name) {
        this.name = name;
    }
    // TODO - replace this line with instruction from step 6
    public String toString() {
        return ("PowerPill " +  name + " = " + power);
    }


    // mutator methods

    // TODO - replace this line with instruction from step 7

    // toString method

    // TODO - replace this line with instruction from step 8

}