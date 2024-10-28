package Testing;

import Entities.Entity;
import dungeon.crawler.project.Room;

public class RoomTester

{
	
	public static void main (String[] args)
	{
		Room room = new Room();
		Entity monster;// = new Entity(0,0,0,0);
		
		
		monster = room.setRandom(1);
		
		System.out.println(monster.getName());
	}
	
	
	
	
}
