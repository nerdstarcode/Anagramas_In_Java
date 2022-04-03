package src.Anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAnagram {
	public static void main(String[] args) {
		String path = "D:\\Desktop\\Programas\\Senac\\Pure\\AnagramasNoTxt\\anagram.txt";
		String anagrama = "anagrama";
		Integer anagramaLength = anagrama.length();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = "entra";
			Integer vectLength = 0;
			while (line != null) {
				line = br.readLine();
				String[] vect = line.split(" ");
				for (String i : vect) {
					vectLength = i.length();
					if (vectLength != null && vectLength == anagramaLength) {
						System.out.println("tem mesma quantidade");
					}
				}

			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}