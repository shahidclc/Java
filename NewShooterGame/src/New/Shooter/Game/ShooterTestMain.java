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
public class ShooterTestMain {

    public static void main(String args[]) {
        
        Shooter shooter = Shooter.getInstance();
        shooter.aim_and_fire();

    }
}


