

	//1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

	//toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//equals() method
	if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
	else
	    System.out.println( "No match. Firestarter you can not be." );
	//while loop that flips until x heads occur or when y mathces are achieved or when 13 matches have come up, and the number of matches is divisible by the year of my birth(2000)
	int x = 20;
	int y = 20;
	int headCtr = 0;
	int numMatches = 0;
	while(headCtr < x || numMatches < y || (numMatches > 13000 && numMatches%2000 == 0)){
	    System.out.println("yours: "+yours.flip());
	    System.out.println("wayne: "+wayne.flip());
	    if (yours.equals(wayne)){
		numMatches += 1;
		System.out.println( "Matchee matchee!" );		
	    }
	    else {
		numMatches += 0;
	        System.out.println( "No match. Firestarter you can not be." );
	    }
	    if (yours.flip() == "heads" || wayne.flip() == "heads"){
		headCtr += 1;
	    }
	    else{
		headCtr += 0;
	    }
	}

    }//end main

}//end class
