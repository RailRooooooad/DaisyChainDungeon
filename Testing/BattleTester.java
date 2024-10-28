/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;
import dungeon.crawler.project.Battle;
import Entities.Player;
import Entities.Skelezombie;
import Entities.Monster;
import java.util.Random;
/**
 *
 * @author liz10
 */
public class BattleTester 
{
    public static void main (String[] args)
    {
        Random random = new Random();
        
        //int hp=random.nextInt(100)+1, attack=random.nextInt(90)+11,defense=random.nextInt(70)+1,speed=random.nextInt(100)+1;//HP, ATTACK, DEFENSE, SPEED
        
        //int monsterHP=random.nextInt(100)+1,monsterAttack=random.nextInt(90)+11,monsterDefense=random.nextInt(70)+1,monsterSpeed=random.nextInt(100)+1; //HP, ATTACK, DEFENSE, SPEED
        
        //Monster scary = new Monster(monsterHP,monsterAttack,monsterDefense,monsterSpeed, "Big Scary Monster");
        //Player user = new Player(hp,attack,defense,speed, "Ethan");
        //Skelezombie scary = new Skelezombie();
        Player user = new Player();
        Monster monster = new Monster();
        
        
        Battle battle = new Battle(user, monster.getRandom(2));

        battle.battleSequence();
    }
    
    
    
}
