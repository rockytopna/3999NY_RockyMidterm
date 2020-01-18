package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			String fileName = "/Users/rockytopna/Documents/Midterm/MidtermJuly2019/src/data/self-driving-car";
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);

			String data = "";
			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("Invalid file name, please enter a valid file");
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IO error");
		} finally {
			bufferedReader.close();
			fileReader.close();
		}

	}
}






