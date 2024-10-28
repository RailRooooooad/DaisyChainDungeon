/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;

import Entities.Entity;
import Items.Item;

/**
 *
 * @author liz10
 */
public class Inventory
    {
    private Nodes<Item> items;
    private int maxSize = 10; // Maximum inventory size
    //private int count;
    private Item item;
    
    
    public Inventory() 
    {
        items = new Nodes<>();
        //count=0;
    }

    public boolean addItem(Item item) 
    {
        if (items.nodeSize() < maxSize)
        {
            items.add(item);
            return true;
        }
        return false;
    }

    public Item removeItem(int index)
    {
        return items.removeAtIndex(index);
    }
    
    public Item useItem(int index)
    {
    	item = items.get(index);
    	
    	return item;
    }
    

    public void displayInventory() {
        System.out.println("Inventory:");
        System.out.println(items.toString());
    }
}

