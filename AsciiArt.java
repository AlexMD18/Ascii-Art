/*
 Alex Drogo
 02-05-2019
 CIS 1068 - 005
 Assignment 3: Ascii Art Project
 
 Description: This program uses for loops to create a piece of ASCII art. The art that i created was the Empire State Building in NYC.
 This seems to work for all sizes that I have tried.*/

package asciiArt;

public class AsciiArt {

	static final int SIZE = 3;

	public static void main(String args[]) {
		spire();
		upperRoof();
		roof();
		meatOfBuilding();
		bottom();
	}

	// Prints out the spire(antenna)
	public static void spire() {
		for (int spire = 1; spire <= SIZE; spire++) {
			for (int placement = 1; placement <= SIZE * 3; placement++) {
				System.out.print(" ");
				for (int whitespace = 1; whitespace <= SIZE; whitespace++)
					System.out.print("");
			}
			System.out.println("||");
		}
	}

	// Prints out the part of the roof that looks like stairs
	public static void upperRoof() {
		for (int roof = 1; roof <= SIZE; roof++) {
			for (int space = 1; space <= SIZE - roof; space++) {
				System.out.print("   ");
			}
			System.out.print("__|");
			for (int j = 1; j <= roof - 1; j++) {
				System.out.print(":::");
			}
			System.out.print("||");
			for (int j = 1; j <= roof - 1; j++) {
				System.out.print(":::");
			}
			System.out.println("|__");
		}
	}

	// Prints out flat roof before the upper roof begins
	public static void roof() {
		System.out.print("|");
		for (int roof = 1; roof <= SIZE * 2; roof++) {
			for (int whitespace = 1; whitespace <= SIZE - roof; whitespace++) {
				System.out.print("");
			}
			System.out.print("---");
		}
		System.out.println("|");
	}

	// Prints out main part of the building and windows
	public static void meatOfBuilding() {
		for (int height = 1; height <= SIZE * 6; height++) {
			System.out.print("|");
			for (int j = 1; j <= SIZE; j++) {
				System.out.print(" [][] ");
			}
			for (int j = 1; j <= height; j++) {
				System.out.print("");
			}
			System.out.println("|");
		}
	}

	// Prints out base
	public static void bottom() {
		System.out.print("|");
		for (int floor = 1; floor <= SIZE * 2; floor++) {
			System.out.print("___");
		}
		System.out.print("|");
	}
}