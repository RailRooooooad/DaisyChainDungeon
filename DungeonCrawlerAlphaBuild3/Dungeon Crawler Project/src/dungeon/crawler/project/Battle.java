/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;
import Entities.Entity;
/**
 *
 * @author liz10
 */
public class Battle
{
    private int fastest;
    private Entity entity1;
    private Entity entity2;
    private boolean battle;
    
    public Battle(Entity entity1, Entity entity2)
    {
        this.entity1=entity1;
        this.entity2=entity2;
        battle = false;
    }
    
    
    public void battleSequence()//Entity entity1, Entity entity2)
    {
    	
        
    	printHP(entity1);
        printHP(entity2);
        
        fastest=entity1.compareSpeed(entity2); //if entity 1 is faster the output is 1, if entity 2 is faster the output is -1, and if they are the same speed the output is 0.
        
        
        
	        if(!(entity1.getName()).equals("There is nothing in here...") || !(entity2.getName()).equals("There is nothing in here..."))
	        {
	            battle = true;
	        	if(fastest == -1)
	            {
	                while(entity1.getHP()>0 && entity2.getHP()>0)//makes sure entities are alive before battle
	                {
	
	                        entity2.attack(entity1);
	                        printAttack(entity2,entity1);
	                        printHP(entity1);
	
	                    if(entity1.getHP()>0)
	                    {
	                        entity1.attack(entity2);
	                        printAttack(entity1,entity2);
	                        printHP(entity2);
	                    }
	                }
	            }
	            else
	            {
	                while(entity1.getHP()>0 && entity2.getHP()>0)//makes sure entities are alive before battle
	                {
	
	
	                    entity1.attack(entity2);
	                    printAttack(entity1,entity2);
	                    printHP(entity2);
	
	                    if(entity2.getHP()>0)
	                    {
	                        //add if statements to check if HP is too low
	                        entity2.attack(entity1);
	                        printAttack(entity2,entity1);
	                        printHP(entity1);
	                    }
	
	                }    
	
	            }
	            if(entity2.getHP()<=0)//returns true if entity 1 wins
	                System.out.println(entity1.getName()+" is the winner!!");
	            else
	                System.out.println(entity2.getName()+" is the winner!!");
	        }
	        else
	        {
	            System.out.println("Testing No Battle occurs when entity there is nothing in here happens");
	        }
        
        
    }
    
    private void printHP(Entity anyEntity)
    {
        if(anyEntity.getHP()<0)
            anyEntity.setHP(0);
        
        System.out.println(anyEntity.getName()+" HP: "+anyEntity.getHP());
    }
    
    private void printAttack(Entity entity1, Entity entity2)
    {
        if(entity1.getAttack()-entity2.getDefense()<=0)
            System.out.println(entity1.getName()+" attacked "+entity2.getName()+" for 1 damage!!");
        else
            System.out.println(entity1.getName()+" attacked "+entity2.getName()+" for "+(entity1.getAttack()-entity2.getDefense())+" damage!!");
    }
    
    
}
