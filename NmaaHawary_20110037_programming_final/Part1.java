package programming;

import java.util.Scanner;

public class Part1 { // Encrypted and decrypted code

	public static void main(String[] args) {

		Scanner statment = new Scanner(System.in);
		System.out.println("Enter your input:");
		String input = statment.next();
		String name = "";
		Scanner out = new Scanner(System.in);
		System.out.println("Enter your key:");
		int key = out.nextInt();
		char[] arrayChars = input.toCharArray();
		String name2 = encryption(input, key, name, arrayChars);
		char[] decryption = name2.toCharArray();
		decrypt(name, key, decryption);
	}

	public static String encryption(String name, int key, String input, char arrayChars[]) {
		name = "";

		System.out.print("Encrypted: ");
		for (char c : arrayChars) {

			c -= key;
			name += c;
			System.out.print(c);

		}
		return name;
	}

	public static void decrypt(String name2, int key, char decryption[]) {
		System.out.println();
		System.out.print("Decrypted:");
		for (char m : decryption)

		{
			m += key;

			System.out.print(m);

		}
	}
}
