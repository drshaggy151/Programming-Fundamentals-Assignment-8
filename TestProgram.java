import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//*******************************************************************************
//Assignment 8          Author: Carlos Fernandez/L30031020
//
//Alphabetic Organizer Program
//*******************************************************************************

public class TestProgram {

	public static void main(String[] args) {

		String filename = "FruitsAndVegetables.txt";

		File file = new File(filename);

		try {

			Scanner inputStream = new Scanner(file);

			StringTree t = new StringTree();

			String value;

			while (inputStream.hasNextLine()) {

				value = inputStream.nextLine();

				System.out.println("Adding: " + value);

				t.addValue(value);

			}

			inputStream.close();

			System.out.println("\n\n====================");
			
			System.out.println("The sorted order is: ");
			
			System.out.println("====================");

			t.print();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

}