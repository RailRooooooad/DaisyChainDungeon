/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Items.Item;

/**
 *
 * @author liz10
 */
public class Player extends Entity
{
    
    public Player()
    {
        super(18,10,13,20,"Player");//HP, ATTACK, DEFENSE, SPEED
    }
    
    public Player(int inputHP, int inputAttack, int inputDefense, int inputSpeed, String playerName)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed, playerName);
    } 
    
    
    public Player useItem(Item item, Player player)
    {
    	player.setAttack(player.getAttack()+item.getAttack());
    	player.setDefense(player.getDefense()+item.getDefense());
    	player.setHP(player.getHP()+item.getHP());
    	player.setSpeed(player.getSpeed()+item.getSpeed());
    	
    	return player;
    }
    
    
}
