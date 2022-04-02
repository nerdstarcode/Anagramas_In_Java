package src.application;

import java.io.IOException;

import java.io.File;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        File file = new File("D:\\Desktop\\Programas\\Senac\\Pure\\AnagramasNoTxt\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}