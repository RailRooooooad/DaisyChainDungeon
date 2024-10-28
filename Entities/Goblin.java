/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author liz10
 */
public class Goblin extends Monster{
    
     public Goblin()
    {
        super(4,8,7,8,"Goblin");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public Goblin(int inputHP, int inputAttack, int inputDefense, int inputSpeed)//, String monsterName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, "Goblin");
    } 
    
    
}
