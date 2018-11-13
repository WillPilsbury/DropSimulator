import java.util.Random;

public class DropCalc {

	private static int roll;
	private static int roll2;
	static int i = 1;
	static int dropRate = 256;
	static String[] itemDrops = {"Ranger Boots", "Armadyl Hilt", "Bandos Hilt", "Saradomin Hilt", "Zamorak Hilt", "Dragon Warhammer"};
	
	public void DropRate() {
		
	}

	public void dCalc() {
		
		i = 1;
		
		Random random = new Random();
		roll = random.nextInt(dropRate - 1) + 1;
		roll2 = random.nextInt(dropRate - 1) + 1;

		while (roll != roll2) {
			System.out.println("You rolled: " + roll + " and: " + roll2);
			roll = random.nextInt(dropRate - 1) + 1;
			roll2 = random.nextInt(dropRate - 1) + 1;
			i++;
			
		}

		System.out.println("You rolled: " + roll + " and: " + roll2);
		System.out.println("It took you " + i + " rolls.");

		

	}

	public static int getRoll() {
		return roll;
	}

	public static void setRoll(int roll) {
		DropCalc.roll = roll;
	}

	public static int getRoll2() {
		return roll2;
	}

	public static void setRoll2(int roll2) {
		DropCalc.roll2 = roll2;
	}

}
