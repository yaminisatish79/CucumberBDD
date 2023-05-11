package com.Sample;

class SimpleDotCom{
	int numOfHits;
	String result;
	int[] locationCells;
	int guess;
	
void setLocations(int[] location) {
	locationCells = location;
	
}

String checkYourself(String stringGuess) {
	guess= Integer.parseInt(stringGuess);
	
	int locationCellsLength = locationCells.length;
	System.out.println("the length is" + locationCellsLength);
	//for(int i=0;i<locationCellsLength;i++) {
	System.out.println("hii"+locationCells[0]);
	System.out.println(locationCells[1]);
	System.out.println(locationCells[2]);
	
	for(int i :locationCells) {
		System.out.println("the value of i is" + i);
		if(i == guess) {
			
			result = "hit";
			break;
		}else {
			result= "miss";
		}
		
	}
	System.out.println("your guess is a " +result);
	return result;
}
}


public class SimpleDotComTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom sim=new SimpleDotCom();
		
		int randomNumber = (int)(Math.random()*5);
		int[] locations= {randomNumber,randomNumber+1,randomNumber+2};
		//System.out.println("the rando numner is"+locations[0]);
		//int[] locations= {2,3,4};
		System.out.println("calling the set method");
		sim.setLocations(locations);
		
		String userGuess = "2";
		
		String answer = sim.checkYourself(userGuess);
		System.out.println("this is your result" +answer);
	
		userGuess = "8";
		 answer = sim.checkYourself(userGuess);
System.out.println("this is your result" +answer);

userGuess = "0";
answer = sim.checkYourself(userGuess);
System.out.println("this is your result" +answer);

	}

}
