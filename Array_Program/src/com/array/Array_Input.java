
/* Get Array Input.....*/

package com.array;

import java.util.Scanner;

public class Array_Input {

	public static void main(String[] args) {
		
		String str = "Sneha";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Elements you want to store :");
		int n = scanner.nextInt();

		int a[] = new int[n];

		System.out.println("Enter aray elements:");

		for (int i = 0; i <= a.length; i++) {

			a[i] = scanner.nextInt();

		}

		for (int i = 0; i < n; i++) {

			System.out.println("Elements are :" + a[i]);

		}

	}

}
