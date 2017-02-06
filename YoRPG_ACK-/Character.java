// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW35 -- Ye Olde Role Playing Game, Realized 
// 2016-11-23

public abstract class Character
{
    // instance vars
    protected int counter = 0;
    protected String name = "";
    protected int HP;
    protected int str;
    protected int def;
    protected double dmg;
    protected int potions = 10;
   
    //returns boolean indicating living or dead when
    //true when HP is over 0, else false
    public boolean isAlive() 
    {
        return (HP > 0);
    }
    
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
    public int attack(Character c) 
    {
	int damage = (int)((str * dmg) - c.getDefense());
	if ( damage < 0 ){
	    damage = 0;
	}
	c.lowerHP(damage);
	return damage;
    }

    public abstract void heal();
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();
}
