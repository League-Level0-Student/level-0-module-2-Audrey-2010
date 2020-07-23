package _01_random._6_lottery_numbers;

import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {

		Random random = new Random();

		int randomMaker = random.nextInt(101);
		int randomMaker2 = random.nextInt(101);
		int randomMaker3 = random.nextInt(101);
		int randomMaker4 = random.nextInt(101);
		int randomMaker5= random.nextInt(101);
		int randomMaker6 = random.nextInt(101);
	}
}