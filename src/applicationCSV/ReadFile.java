package src.applicationCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import src.entities.ProductRead;

public class ReadFile {
	public static void main(String[] args) {
		String path = "D:\\Desktop\\Programas\\Senac\\Pure\\AnagramasNoTxt\\in.txt";
		List<ProductRead> list = new ArrayList<ProductRead>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);

				ProductRead prod = new ProductRead(name, price, qte);
				list.add(prod);

				line = br.readLine();
			}
			System.out.println("Products:");
			for (ProductRead p : list) {
				System.out.println(p);

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}