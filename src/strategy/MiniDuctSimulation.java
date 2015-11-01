/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.duct.*;

/**
 *
 * @author misrc
 */
public class MiniDuctSimulation {
    public static void main(String args[]){
        Duct mallard = new MallardDuct();
        mallard.performFly();
        mallard.performQuack();
    }
}
