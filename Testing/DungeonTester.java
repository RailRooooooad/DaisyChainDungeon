/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

import Items.Item;
import dungeon.crawler.project.Dungeon;
import dungeon.crawler.project.Inventory;

/**
 *
 * @author liz10
 */
public class DungeonTester {
    public static void main(String[] Args)
    {
        Dungeon dungeon = new Dungeon(1);
        Inventory inventory = new Inventory();
        dungeon.createDungeon();
        
        //dungeon.drawRooms();
        dungeon.getItem().printStats();
        
        if(dungeon.getItem() instanceof Item)
                {
                  //  System.out.println("Would you like to pick up this item and add it to your inventory? (y for yes and anything else for no)");
                  //  str = scan.nextLine(); //ADD ERROR HANDLING
                    
                    //(str.equals("y"))
                        inventory.addItem(dungeon.getItem());
                }
        inventory.displayInventory();
        
    }
}
