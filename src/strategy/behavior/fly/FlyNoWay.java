/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.behavior.fly;

/**
 *
 * @author misrc
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void Fly() {
        System.out.println("I can't fly");
    }
    
}
