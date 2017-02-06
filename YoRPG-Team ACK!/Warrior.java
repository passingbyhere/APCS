// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Improved
// 2016-11-17

public class Warrior extends Character
{
    //constructor
     public Warrior(String n)
    {
	name = n;
	HP = 125;
	str = 100;
	def = 40;
	dmg = 0.4;
    }
   
    //def is decreased and dmg is increased
    public void specialize() 
    {
	def = 30;
	dmg = 0.5;
    }
    //def and dmg reset
    public void normalize() 
    {
	def = 40;
	dmg = 0.4;
    }
}
