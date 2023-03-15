package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_Buffered_Writer {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\Users\\Antonio\\Desktop\\Java Introdut\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
