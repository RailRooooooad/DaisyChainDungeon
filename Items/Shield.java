/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;
/**
 *
 * @author liz10
 */
public class Shield extends Item{
    
    public Shield()
    {
        super(0,0,6,0,"Shield");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public Shield(int inputHP, int inputAttack, int inputDefense, int inputSpeed)//, String monsterName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, "Shield");
    } 
    
    
}
