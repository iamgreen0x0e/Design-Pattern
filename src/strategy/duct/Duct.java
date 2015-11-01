/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.duct;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;

/**
 *
 * @author misrc
 */
public abstract class Duct {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duct(){
        
    }
    
    public void performFly(){
        flyBehavior.Fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    
    public void swim(){
        System.out.println("All duct float, even decoy!!");
    }
    
}
