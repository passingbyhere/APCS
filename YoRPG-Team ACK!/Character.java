// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Improved
// 2016-11-17

public class Character
{
     // instance vars
    protected String name;
    protected int HP;
    protected int str;
    protected int def;
    protected double dmg;
   
    //returns boolean indicating living or dead when
    //true when HP is over 0, else false
    public boolean isAlive() 
    {
        return (HP > 0);
    }
    //returns name attribute
    public String getName() 
    {
	return name;
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
    public int attack(Monster m) 
    {
	int damage = (int)(str * dmg) - m.getDefense();
	if(damage<0){
	    damage = 0;
	}
	m.lowerHP(damage);
	return damage;
    }
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
