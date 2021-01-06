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
public class AK47 extends Weapon {

    public AK47() {
        description = "AK47";
    }

    public double getWeight() {
        return 4.29;
    }

    public void aim_and_fire() {
        System.out.println("AK47 fire");
    }
}
