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
public class Bazooka extends Weapon {

    public Bazooka() {
        description = "Bazooka";
    }

    public void aim_and_fire() {
        System.out.println("Bazooka fire");
    }

    public double getWeight() {
        return 4.29;

    }
}
