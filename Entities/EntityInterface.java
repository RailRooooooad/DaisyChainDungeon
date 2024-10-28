/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author liz10
 */
public interface EntityInterface {
    
    public void attack(Entity anyEntity);
    
    public int compareSpeed(Object whateverEntity);
    
    public String getName();
    
    public int getHP();
    
    public void setHP(int inputHP);
    
    public int getAttack();
    
    public int getDefense();
    
    public int getSpeed();
    
    public void setAttack(int attack);
    
    public void setDefense(int defense);
    
    public void setSpeed(int speed);
    
    
}
