// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW35 -- Ye Olde Role Playing Game, Realized 
// 2016-11-23

public class Monster extends Character
{
    //constructor, initializes values for all the instance variables above
    public Monster()
    {
	HP = 1500;
	def = 200;
	str = (int)(Math.random()*250)+400;
	dmg = 1.0;
    }

    public void heal()
    { 
    }

     public void specialize()
    {
	def -= 0;
	dmg += 0;
	counter += 0;
    }

    public void normalize()
    {
	def += 0*counter;
	dmg -= 0*counter;
    }
    
    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Monster Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    } 

}
