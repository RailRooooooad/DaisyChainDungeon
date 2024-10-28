/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author liz10
 */
public class Skelezombie extends Monster{
    
    
    
    public Skelezombie()
    {
        super(7,11,6,10,"SkeleZombie");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public Skelezombie(int inputHP, int inputAttack, int inputDefense, int inputSpeed)//, String monsterName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, "SkeleZombie");
    } 
    
}
