package chapter8;

/**
 * Coins: Given an infinite number of quarters (25 cents), dimes (10 cents),
 * nickels (5 cents), and pennies (1 cent), write code to calculate the number
 * of ways of representing n cents.
 */

public class Question11 {

	public static int coins(int amount) {
		int[] coins = { 25, 10, 5, 1 };
		return ways(amount, coins, 0);
	}

	public static int ways(int amount, int[] coins, int index) {
		if (index >= coins.length)
			return 1;
		int ways = 0;
		int coinIndex = coins[index];
		int remainder;
		for (int i = 0; i * coinIndex < coins.length; i++) {
			remainder = amount - i * coinIndex;
			ways += ways(remainder, coins, index + 1);
		}

		return ways;
	}

}
