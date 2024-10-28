/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;
import Entities.Entity;
import Entities.Monster;
import Entities.EmptyRoom;
import Items.Item;
import java.util.Scanner;
/**
 *
 * @author liz10
 */
public class Dungeon 
{
    private int roomNum;
    private int maxRoomNum;
    private Nodes<Room> roomNode;
    private Room setRoom;
    private Room storeRoom;
    private int floor;
    Scanner scan;
    
    public Dungeon(int floor)
    {
        this.floor=floor;
        maxRoomNum=8;
        scan = new Scanner(System.in);
    }
    
    
    public void createDungeon()
    {
        roomNode = new Nodes<Room>();//CHANGE UP NODE CLASS/WORK ON IT
        setRoom = new Room(); 
        roomNum=0;

        //Entity entity;
        
        while (roomNum < maxRoomNum) 
        {            
            Entity entity = setRoom.setRandom(floor);
            
            
            storeRoom = new Room(roomNum++, entity);
            roomNode.add(storeRoom);
        }
        roomNode.makeCircular();
        roomNum=0;
    }
    
    
    public void moveNext()
    {
        storeRoom = (Room)roomNode.get((storeRoom.getRoom() + 1) % 8);
    }

    public void movePrevious()
    {
        storeRoom = (Room)roomNode.get((storeRoom.getRoom() + 7) % 8);
    }

    public Room getCurrentRoom()
    {
        return storeRoom;
    }
    
    
    public void getStartRoom() 
    {
        moveNext();
    }
    
    
    public Item getItem()
    {
        //if()
            return storeRoom.getItem();
    }
    
    public boolean isDungeonCleared() {
    for (int i = 0; i < roomNode.nodeSize(); i++) { 
        Room room = (Room) roomNode.get(i); // Get the Room from your Nodes structure

        if (room.getEntity() instanceof Monster) {
            return false; // Found a Monster, dungeon is not cleared
        }
    }
    return true; // No Monsters found, dungeon is cleared
}
    
    public Entity getCurrentRoomEntity()
    {
        return storeRoom.getEntity();
    }

    public void clearCurrentEntity()
    {
        storeRoom.setEntity(new EmptyRoom());
    }
    
    
    public String getCurrentRoomDescription()
    {
        return storeRoom.toString(); // Assuming your Room class has a toString() method 
    }
    
    
    public void printOptions()
    {
        System.out.println("\nOptions:");
        System.out.println("1. Move");
        System.out.println("2. Check Inventory");
        //System.out.println("3. Rest");
    }
    
    
    public void drawRooms()
    {
        System.out.println("\nRooms:");
        System.out.println("      [5]");
        System.out.println("   [4]   [6]");
        System.out.println("[3]         [7]");
        System.out.println("   [2]   [8]");
        System.out.println("      [1]\n");
        
        
        
    }
    
}
