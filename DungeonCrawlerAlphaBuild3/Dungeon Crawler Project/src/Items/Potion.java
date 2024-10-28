/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;
/**
 *
 * @author liz10
 */
public class Potion extends Item{
    
    
    
    public Potion()
    {
        super(10,0,0,0,"Potion");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public Potion(int inputHP, int inputAttack, int inputDefense, int inputSpeed)//, String monsterName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, "Potion");
    } 
    
    
}
