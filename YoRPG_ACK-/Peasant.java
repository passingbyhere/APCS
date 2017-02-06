// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW35 -- Ye Olde Role Playing Game, Realized 
// 2016-11-23

public class Peasant extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Peasant(String n)
    {
	name = n;
	HP = 800;
	str = 100;
	def = 100;
	dmg = 0.2;
    }
    //heals a quarter of the HP
    public void heal()
    {
	if(potions > 0){
	    HP += 800/4;
	    if (HP > 800){
		HP = 800;
	    }
	    potions -= 1;
	}
	else{
	    System.out.println("No more potions!");
	}
    }
     //def is decreased and dmg is increased, counter idea credits given to Ishtiaque Mahdi!
    public void specialize()
    {
	def -= 100;
	dmg += 1;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 100*counter;
	dmg -= 1*counter;
    }

    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Peasant Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }


}

