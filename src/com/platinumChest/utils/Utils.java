package com.platinumChest.utils;

import java.io.*;
import java.util.*;

public class Utils {
	
	public static void gravarUltimoAcesso(String username, String arquivo) throws IOException {
		FileWriter fileWriter = new FileWriter(arquivo, false);
		fileWriter.write(username);
		fileWriter.flush();
		fileWriter.close();
	}

	public static void gravarLog(String conteudo, String arquivo) throws IOException{
		FileWriter fileWriter = new FileWriter(arquivo, true);
		fileWriter.write(conteudo + '\n');
		fileWriter.flush();
		fileWriter.close();
	}

	public static String getUltimoUsuarioLogado(){
		try {
			FileReader fileReader = new FileReader("ultimo_acesso.txt");
			BufferedReader br = new BufferedReader(fileReader);
			String output = br.readLine();
			br.close();
			fileReader.close();
			return output;
		} catch (Exception e){
			gravarException();
		}
		return null;
	}

	public static void gravarException(){
		List<StackTraceElement> elementos = Arrays.asList(Thread.currentThread().getStackTrace());
		String ls = System.lineSeparator();
		String stackTrace = "EXCEPTION ==> [" + ls + elementos.stream()
				.map(element -> element.getClassName() + "." + element.getMethodName() + "{" +
						element.getFileName() + ":" + element.getLineNumber() + "}")
				.reduce("", (sum, element) ->
					sum += element + ls)
				+ "]" + ls;
		try{
			gravarLog(stackTrace, "log_sistema.txt");
		} catch (IOException e) {
			System.out.println("Erro de sistema impossibilita a gravação de log!!!");
		}
	}

	public static void gravarAcao(String acao){
		String usuario = getUltimoUsuarioLogado();
		Date data = new Date();
		String log_acao = "ACAO [" + data.toString() + "]: \"" + acao + "\" finalizado pelo usuário {" +
				usuario + "};";

		try {
			gravarLog(log_acao, "log_sistema.txt");
		} catch (IOException e) {
			gravarException();
		}
	}

}
