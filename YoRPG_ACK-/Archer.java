// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW35 -- Ye Olde Role Playing Game, Realized 
// 2016-11-23
public class Archer extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Archer(String n)
    {
	name = n;
	HP = 1000;
	str = 600;
	def = 450;
	dmg = 0.6;
    }
    //heals a quarter of the HP
    public void heal()
    {
	if(potions > 0){
	    HP += 1000/4;
	    if (HP > 1000){
		HP = 1000;
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
	def -= 250;
	dmg += 0.6;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 250*counter;
	dmg -= 0.6*counter;
    }

   //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Archer Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }
	

}

