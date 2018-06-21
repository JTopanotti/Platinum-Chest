package com.platinumChest.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public final class Conexao {
	private static String host = "gutinho0710.ddns.net:54321";
	private static String banco = "platinum_chest";
	private static String usuario = "pc";
	private static String senha = "pc2018";
	private static String url = "jdbc:mysql://" + host + "/" + banco
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static Connection conexao = null;
	
	public static Connection getConexao() {
		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
		}catch (SQLException ex){
			System.out.println("Erro de conexão: " + ex.getMessage());
		}
		return conexao;
	}
	
	public static void closeConexao() {
		if(conexao!=null) {
			try {
				conexao.close();
			}catch(SQLException ex) {
				System.out.println("Erro de conexão: " + ex.getMessage());
			}
		}
	}
}
