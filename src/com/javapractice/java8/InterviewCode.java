package com.javapractice.java8;

public class InterviewCode {

	public static void main(String[] args) {
		int limit = 10;
		int rev = 1234;
		int arm = 9475;
		int palin = 2112;

		armstrong(arm);
		palindrome(palin);
		reverse(rev);

		for (int i = 0; i <= limit; i++) {
			prime(i);
		}

		fibonacci(limit);

	}

	// Fibonacci series

	public static void fibonacci(int num) {
		int first = 0;
		int second = 1;
		System.out.print(first + " " + second);
		for (int i = 2; i < num; i++) {
			int temp = first;
			first = second;
			second = second + temp;
			System.out.print(" " + second);
		}
	}

	// prime function

	public static void prime(int num) {
		int count = 0;
		for (int j = 1; j <= num; j++) {
			if (num % j == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.print(" " + num);
		}

	}

	// armstrong function

	public static void armstrong(int num) {
		int count = 0, rem = 0;
		int sum = 0;
		int temp = num, temp2 = num;

		while (temp != 0) {
			count++;
			temp = temp / 10;
		}

		while (num != 0) {
			rem = num % 10;
			sum = sum + (int) Math.pow(rem, count);
			num = num / 10;
		}

		if (sum == temp2) {
			System.out.println(temp2 + " is a Armstrong Number" + '\n');
		} else
			System.out.println(temp2 + " is Not a armstrong number" + '\n');

	}

	// Reverse Number Function

	public static void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);

	}
	// palindromin number

	public static void palindrome(int num) {
		int temp = num;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		if (temp == reverse) {
			System.out.println(temp + " Is a palindorme");
		} else
			System.out.println(temp + " IS not a palindrome");

	}

}