package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_bufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// Buffer é instanciado a partir do FileReader

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
