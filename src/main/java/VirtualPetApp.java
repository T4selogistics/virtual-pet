import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		VirtualPet daisyTheDog = new VirtualPet();
		
		{			
		// call tick inside the loop
		daisyTheDog.tick();
			System.out.println("hunger = "+ daisyTheDog.getHunger());}
		
		//if daisey's hunger is less than 5; she needs fed
		{
		int hunger = 0;
		while (hunger<5)
		{
			System.out.println(hunger);
			hunger++; //feeding reduces hunger
		}
		
		//if daisy's energy level is greater than 5; she wants to play			
			daisyTheDog.tick();
		System.out.println("plays = "+ daisyTheDog.getPlay());}
		{
		int plays = 0;
		while (plays>5)
		{
			System.out.println(plays);
			plays--; //playing reduces energy level
		}
			
		//if daisey's energy level is less than 5, she needs to sleep
			daisyTheDog.tick();
		System.out.println("sleeps = "+ daisyTheDog.getSleeps());
		{
			int sleeps = 0;
			while (sleeps<5)
			{
				System.out.println(sleeps);
				sleeps++; //sleeping promotes rest
			}
}
		
			
		

