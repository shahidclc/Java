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
public class TomyRiffle extends Weapon {

    public TomyRiffle() {
        description = "Tomy Riffle";
    }

    public double getWeight() {
        return 3.89;
    }

    public void aim_and_fire() {
        System.out.println("Tomy fire");
    }
}
