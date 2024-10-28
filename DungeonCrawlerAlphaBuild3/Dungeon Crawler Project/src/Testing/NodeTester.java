/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author liz10
 */
public class NodeTester {

    public static void main(String[] args) {
        Nodes roomNode = new Nodes();//CHANGE UP NODE CLASS/WORK ON IT
        Room setRoom = new Room();
        Room storeRoom;// =  new Room();
        int roomNum = 0;

        int floor=5;
        
        setRoom.setRandom(5);
        
        
        
        //storeRoom = new Room(roomNum++, setRoom.setRandom());
        while (roomNum < 4) {
            storeRoom = new Room(roomNum++, setRoom.setRandom(floor));
            roomNode.add(storeRoom);
        }
        
        System.out.println(roomNode.toString());
        //System.out.println(storeRoom.toString());
        
        
        roomNode.removeAtIndex(2);
        
        
        System.out.println(roomNode.toString());
        
        

        
        
    }

}
