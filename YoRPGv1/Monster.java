// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW30 -- Making a Role Playing Game
// 2016-11-16

public class Monster
{
    // instance vars
    int HP, str, def;
    double dmg;

    //constructor
    public Monster()
    {
	HP = 150;
	def = 20;
	str = (int)(Math.random()*45)+20;
	dmg = 1.0;
    }
    //returns boolean indicating living or dead when
    //true when HP is over 0, else false
    public boolean isAlive() 
    {
        return (HP > 0);
    }
    //returns defense attribute
    public int getDefense()
    {
	return def;
    }
    //decreases HP by HPlost
    public void lowerHP(int HPlost)
    {
	HP -= HPlost;
    }
    //lowers monster HP by int damage
    public int attack(Warrior w) 
    {
	int damage = (int)(str * dmg) - w.getDefense();
	if(damage<0){
	    damage = 0;
	}
	w.lowerHP(damage);
	return damage;
    }
}
