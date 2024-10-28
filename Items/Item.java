/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;
import Entities.Entity;
import java.util.Random;
/**
 *
 * @author liz10
 */
public class Item extends Entity
{
    private Random rand;
    
    public Item()
    {
        super(0,0,0,0,"Item");//HP, ATTACK, DEFENSE, SPEED
    }
    
    
    public Item(int inputHP, int inputAttack, int inputDefense, int inputSpeed, String itemName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, itemName);
    } 
    
    public Item getRandom(int floor)
    {
        rand = new Random();
        int temp = rand.nextInt(3);
        
        if(temp == 0)
        {
            return new Shield(0,0,6+(floor*2),0);
        }
        else if(temp == 1)
        {
            return new Potion(6+(floor/2),0,0,0);
        }
        else
        	return new StrengthPotion(0,6+(floor),0,0);
    }
    
        @Override
        public String toString()
        {
            return getName();
        }
    
    
}
