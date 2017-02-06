// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Improved
// 2016-11-17

public class Monster extends Character
{
    //constructor
    public Monster()
    {
	HP = 150;
	def = 20;
	str = (int)(Math.random()*45)+20;
	dmg = 1.0;
    }
}
