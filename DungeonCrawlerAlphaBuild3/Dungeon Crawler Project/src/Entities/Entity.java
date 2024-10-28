/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author liz10
 */
public class Entity implements EntityInterface

{
    //ADD METHOD WITH FORMULA TO INCREASE MONSTER STATS FOR EACH FLOOR
    private int hp;
    private int attack;
    private int speed;
    private int defense;
    private String name;
    
    
    public Entity(int entityHP, int entityAttack, int entityDefense, int entitySpeed)//, String entityName)
    {
        hp = entityHP;
        attack = entityAttack;
        defense = entityDefense;
        speed = entitySpeed;
        name="defaultName";
    }
    
    public Entity(int entityHP, int entityAttack, int entityDefense, int entitySpeed, String entityName)
    {
        hp = entityHP;
        attack = entityAttack;
        defense = entityDefense;
        speed = entitySpeed;
        name=entityName;
    }
    
    @Override
    public void attack(Entity anyEntity)
    {
        int resultingLife = anyEntity.getHP() - (this.getAttack() - anyEntity.getDefense());
        
        if(resultingLife>=anyEntity.getHP())
        {
            resultingLife=anyEntity.getHP()-1;
        }
        
        anyEntity.setHP(resultingLife);//consider edge cases for negative attacks or zero-damage scenarios possibly in method somehow? Or make another method for that?
    }
    
    
    @Override
    public int compareSpeed(Object whateverEntity)//if entity 1 is faster the output is 1, if entity 2 is fater the output is -1, and if they are the same speed the output is 0. https://www.codejava.net/java-core/the-java-language/everything-you-need-to-know-about-interfaces-in-java
    {
        int x;
        
        if(this.getSpeed()>((Entity) whateverEntity).getSpeed())
            x=1;
        else if(this.getSpeed()<((Entity) whateverEntity).getSpeed())
            x=-1;
        else
            x=0;
        
        return x;
    }
    
    
    public void printStats()
    {
        System.out.println( ""+name+"\nHP:"+hp+" Attack:"+attack+" Defense:"+defense+" Speed:"+speed);//HP, ATTACK, DEFENSE, SPEED
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    
    
    
    
    //getters and setters
    
    
    @Override
    public void setSpeed(int speed)
    {
    	this.speed = speed;
    }
    
    @Override
    public void setDefense(int defense)
    {
    	this.defense = defense;
    }
    
    @Override
    public void setAttack(int attack)
    {
    	this.attack = attack;
    }
    
    @Override
    public void setHP(int inputHP)
    {
        hp = inputHP;
    }
    
    @Override
    public int getAttack()
    {
        return attack;
    }
    
    @Override
    public int getDefense()
    {
        return defense;
    } 
      
    @Override
    public int getSpeed()
    {
        return speed;
    }
    
    @Override
    public int getHP()
    {
        return hp;
    }
    
    
}
