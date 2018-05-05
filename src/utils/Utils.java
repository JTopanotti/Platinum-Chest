package utils;

import java.io.FileWriter;
import java.io.IOException;

public class Utils {
	
	private static FileWriter fileWriter;
	
	public static void gravarUltimoAcesso(String username, String arquivo) throws IOException {
		fileWriter = new FileWriter(arquivo, false);
		fileWriter.write(username);
		fileWriter.flush();
		fileWriter.close();
	}

	public static void gravarLogAcesso(String username, String arquivo) throws IOException{
		fileWriter = new FileWriter(arquivo, true);
		fileWriter.write(username + '\n');
		fileWriter.flush();
		fileWriter.close();
	}
	
	
}
