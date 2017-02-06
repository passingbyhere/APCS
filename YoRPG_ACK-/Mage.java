// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW35 -- Ye Olde Role Playing Game, Realized 
// 2016-11-23

public class Mage extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Mage(String n)
    {
	name = n;
	HP = 1200;
	str = 400;
	def = 500;
	dmg = 0.7;
    }

    //heals a quarter of the HP
    public void heal()
    {
	if(potions > 0){
	    HP += 1200/4;
	    if (HP > 1200){
		HP = 1200;
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
	def -= 300;
	dmg += 0.8;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 300*counter;
	dmg -= 0.8*counter;
    }

    public String about()
    {
	return "Mage Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }
    
    public String toString()
    {
	return "Mage Class:\n" + about();
    } 


}

