package utils;

import java.io.FileWriter;
import java.io.IOException;

public class Utils {
	
	private static FileWriter fileWriter;
	
	public static void gravarUltimoAcesso(String username) throws IOException {
		fileWriter = new FileWriter("../ultimo_acesso.txt", false);
		fileWriter.write(username);
		fileWriter.close();
	}
	
	
	
}
