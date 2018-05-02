package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public final class Conexao {
	private String host = "gutinho0710.ddns.net:54321";
	private String banco = "platinum_chest";
	private String usuario = "pc";
	private String senha = "pc2018";
	private String url = "jdbc:mysql://" + host + "/" + banco
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private Connection conexao = null;
	
	public Connection getConexao() {
		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
		}catch (SQLException ex){
			System.out.println("Hey fella, there's a problem over here: " + ex.getMessage());
		}
		return conexao;
	}
	
	public void closeConexao() {
		if(conexao!=null) {
			try {
				conexao.close();
			}catch(SQLException ex) {
				System.out.println("Yo gurte, there's a problem over here: " + ex.getMessage());
			}
		}
	}
}
