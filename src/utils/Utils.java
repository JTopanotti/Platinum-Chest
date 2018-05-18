package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Stack;

public class Utils {
	
	private static FileWriter fileWriter;
	
	public static void gravarUltimoAcesso(String username, String arquivo) throws IOException {
		fileWriter = new FileWriter(arquivo, false);
		fileWriter.write(username);
		fileWriter.flush();
		fileWriter.close();
	}

	public static void gravarLog(String conteudo, String arquivo) throws IOException{
		fileWriter = new FileWriter(arquivo, true);
		fileWriter.write(conteudo + '\n');
		fileWriter.flush();
		fileWriter.close();
	}
	
	public static void gravarException(){
		StackTraceElement[] elementos = Thread.currentThread().getStackTrace();
		String stackTrace = System.getProperty("line.separator");

		for(StackTraceElement element : elementos){
			stackTrace += System.getProperty("line.separator") + element.getClassName() + "."
					+ element.getMethodName() + "{" + element.getFileName()
					+ ":" + element.getLineNumber() + "}";
		}

		try{
			Date data = new Date();
			gravarLog(stackTrace, data.toString() + "-exception.txt");
		} catch (IOException e) {
			System.out.println("Erro de sistema impossibilita a gravação de log!!!");
		}
	}


}
