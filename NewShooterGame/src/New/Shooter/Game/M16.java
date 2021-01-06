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
public class M16 extends Weapon {

    public M16() {
        description = "M16";
    }

    public double getWeight() {
        return 4.00;
    }

    public void aim_and_fire() {
        System.out.println("M16 fire");
    }
}
