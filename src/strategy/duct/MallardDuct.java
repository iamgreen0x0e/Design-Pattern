/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.duct;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;

/**
 *
 * @author misrc
 */
public class MallardDuct extends Duct{
    public MallardDuct(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display(){
        System.out.println("I'm a real mmallard duct");
    }
}
