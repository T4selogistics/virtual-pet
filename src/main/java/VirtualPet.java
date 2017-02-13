import java.util.Scanner;

public class VirtualPet {

	
	private int hunger = 10;
	private int play = 10;
	private int sleeps = 10;

	public void tick() {
		hunger = hunger + 5;
		play = play + 5;
		sleeps = sleeps + 5;
	}

	public int getHunger() {
		return hunger;
	}

	// feeding decreases hunger
	public void feed() {
		hunger = hunger - 5;
		System.out.println(hunger);
	}

	public boolean isHungry() {
		boolean hungry = (hunger >= 5);
		return hungry;

	}

	// playtime aids in socialization and overall health
	public int getPlay() {
		return play;
	}

	public void play() {
		play = play - 5;
		System.out.println(play);
	}

	public boolean isPlayFull() {
		boolean playFull = (play >= 5);
		return playFull;
	}

	// playtime promotes sleep
	public int getSleeps() {
		return sleeps;
	}

	public void sleeps() {
		sleeps = sleeps - 5;
		System.out.println(sleeps);
	}

	public boolean isSleepy() {
		boolean sleepy = (sleeps >= 5);
		return sleepy;
	}

}
