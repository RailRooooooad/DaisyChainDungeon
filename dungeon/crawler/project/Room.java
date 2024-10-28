/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;
import Entities.Entity;

import Entities.Monster;
import Entities.Skelezombie;
import Entities.EmptyRoom;
import Items.Item;
import java.util.Random;
/**
 *
 * @author liz10
 * File Version 2.0 
 * 10/27/24
 */
public class Room {
    private Random rand;
    private Entity itemOrMonster;
    private int roomNum;
    private int monsterCount;

    public Room() {
        this.rand = new Random();
        this.monsterCount = 0;
    }

    public Room(int roomNum, Entity thingInRoom) {
        this.roomNum = roomNum;
        this.itemOrMonster = thingInRoom;
        this.monsterCount = 0;
    }

    @Override
    public String toString() {
        return "Room: " + (roomNum + 1) + " This room has a " + (itemOrMonster != null ? itemOrMonster.getName() : "nothing");
    }

    public int getRoom() {
        return roomNum;
    }

    public Item getItem() {
        return (itemOrMonster instanceof Item) ? (Item) itemOrMonster : null;
    }

    public Entity getEntity() {
        return itemOrMonster != null ? itemOrMonster : new EmptyRoom();
    }

    public Entity setRandom(int floor) {
        int temp = rand.nextInt(5);
        
        if ((temp == 1 || temp == 2 || temp == 3) && monsterCount < 4) {
            monsterCount++;
            itemOrMonster = new Monster().getRandom(floor);
        } else if (temp == 0){// || temp == 3) {
            itemOrMonster = new Item().getRandom(floor);
        } else {
            itemOrMonster = new EmptyRoom();
        }
        return itemOrMonster;
    }

    public void setEntity(Entity entity) {
        this.itemOrMonster = entity;
    }
    
 
}

