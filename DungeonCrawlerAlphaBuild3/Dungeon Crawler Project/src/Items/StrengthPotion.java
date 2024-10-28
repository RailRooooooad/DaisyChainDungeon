/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author liz10
 */
public class StrengthPotion extends Item{
    
    public StrengthPotion()
    {
        super(0,6,0,0,"Strength Potion");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public StrengthPotion(int inputHP, int inputAttack, int inputDefense, int inputSpeed)//, String monsterName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, "Strength Potion");
    } 
    
    
	
}
