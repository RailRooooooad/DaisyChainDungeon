/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import java.util.Random;

/**
 *
 * @author liz10
 */
public class Monster extends Entity
{
    private Random rand;
    Skelezombie skele;// = new Skelezombie();
    Goblin gob;
    
    public Monster()
    {
        super(7,5,6,10,"Monster");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public Monster(int inputHP, int inputAttack, int inputDefense, int inputSpeed, String monsterName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, monsterName);
    } 
    
    public Monster getRandom(int floor)
    {
        rand = new Random();
        skele = new Skelezombie();
        gob = new Goblin();
        
        
        if(rand.nextInt(2) == 0)
        {
            return new Skelezombie(skele.getHP()+(3*(floor/4)),skele.getAttack()+(3*(floor/2)),skele.getDefense()+(3*(floor/2)),skele.getSpeed()+(3*(floor/2)));
        }
        else 
            return new Goblin(gob.getHP()+(3*(floor/3)), gob.getAttack()+(3*(floor/3)), gob.getDefense()+(3*(floor/3)), gob.getSpeed()+(3*(floor/3)));

        
    }
    
    
    
}
