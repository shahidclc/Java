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
public class Shooter {

    private static Shooter uniqueInstance;

    private Shooter() {
        System.out.println("Shooter fire");

    }

    public static Shooter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Shooter();
        }
        return uniqueInstance;

    }

    public void aim_and_fire() {

        Weapon weapon = new TomyRiffle();
        System.out.println(weapon.getDescription()
                + " Weight in Pounds " + weapon.getWeight());

        Weapon weapon2 = new M16();
        weapon2 = new Silencer(weapon2);
        weapon2 = new Magazine(weapon2);
        weapon2 = new Lazer(weapon2);
        System.out.println(weapon2.getDescription()
                + " Weight in pounds " + weapon2.getWeight());

        Weapon weapon3 = new AK47();
        weapon3 = new Silencer(weapon3);
        weapon3 = new Scoope(weapon3);
        weapon3 = new Magazine(weapon3);
        System.out.println(weapon3.getDescription()
                + " Weight in pounds " + weapon3.getWeight());

        Weapon weapon4 = new AK47();
        weapon4 = new Silencer(weapon4);
        weapon4 = new Scoope(weapon4);
        weapon4 = new Magazine(weapon4);
        weapon4 = new Lazer(weapon4);
        System.out.println(weapon4.getDescription()
                + " Weight in pounds " + weapon4.getWeight());

    }

}
