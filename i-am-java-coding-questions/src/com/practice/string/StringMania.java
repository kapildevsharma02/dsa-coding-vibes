package com.practice.string;

public class StringMania {
	public static int stringMania(int n, int m, String str1, String str2) {
		// Write your code here.
		if (str1.equals(str2)) {
			return 0;
		}
		int i = 0;
		int j = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		while (i <= n - 1 && j <= m - 1) {
			int number1 = str1.charAt(i) - '0';
			int number2 = str2.charAt(j) - '0';
			if (number1 < number2) {
				return -1;
			} else if (number1 > number2) {
				return 1;
			}
			i++;
			j++;
		}
		if (i == n) {
			return -1;
		}
		if (j == m) {
			return 1;
		}
		return 1;
	}

	public static void main(String[] args) {
		int answer = stringMania(1, 3, "a", "abc");
		System.out.println(answer);
	}

}
