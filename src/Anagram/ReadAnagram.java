package src.Anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import src.Compare.CompareString;

public class ReadAnagram {
	public static void main(String[] args) {
		String path = "D:\\Desktop\\Programas\\Senac\\Pure\\AnagramasNoTxt\\anagram.txt";
		String anagrama = "anagrama";
		Integer anagramaLength = anagrama.length();
		String[] vectSplitAnagram = anagrama.split("");
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = "entra";
			Integer vectLength = 0;
			while (line != null) {
				line = br.readLine();
				String[] vect = line.split(" ");
				for (String i : vect) {
					vectLength = i.length();
					if (vectLength != null && vectLength == anagramaLength) {
						System.out.println("pode ser um anagrama");
						String[] vectSplit = i.split("");
						for (String x : vectSplitAnagram) {
							for (String y : vectSplit) {
								if (CompareString.stringCompare(x, y) == 0) {
									Integer index = i.indexOf(y);
									System.out.println("Tem letra igual");
									// i.splice encontrar o equivalente do splice
									break;
								} else {
									System.out.println("Não é letra igual");
								}
							}
						}
					}
				}

			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}