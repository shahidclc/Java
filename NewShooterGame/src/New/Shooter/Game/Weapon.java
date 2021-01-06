/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New.Shooter.Game;

/**
 *
 * @author shahi
 */
public abstract class Weapon {

    String description = "unknown weapon";

    public String getDescription() {
        return description;
    }

    public abstract double getWeight();

    public abstract void aim_and_fire();

}
