package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.sql.Connection;

import dao.UsuarioDAO;
import db.Conexao;
import utils.Utils;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField caixauser;
	private JTextField caixapass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private int check(String user, String pass) {
		//Busca do usuario no banco de dados
		if(user.equals("gustavo") && pass.equals("123")) {
			return 1;
		}
		else {
			return 0;
		}
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 103);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(10, 11, 40, 14);
		contentPane.add(lblUsurio);
		
		caixauser = new JTextField();
		caixauser.setBounds(66, 8, 86, 20);
		contentPane.add(caixauser);
		caixauser.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(16, 34, 34, 14);
		contentPane.add(lblSenha);
		
		caixapass = new JTextField();
		caixapass.setBounds(66, 31, 86, 20);
		contentPane.add(caixapass);
		caixapass.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener((e) -> {
			boolean check = verificarAcesso(caixauser.getText(), caixapass.getText());
			if(!check) {
				JOptionPane.showMessageDialog(null, "Usuário ou senha inválido ", "Credenciais inválidos", JOptionPane.WARNING_MESSAGE);
			} else {
				Menu menu = new Menu();
				gravarAcesso(caixauser.getText());
				menu.setVisible(true);
			}
		});
		btnEntrar.setBounds(175, 7, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(175, 30, 89, 23);
		contentPane.add(btnCancelar);
	}

	private boolean verificarAcesso(String username, String password){
		boolean check = false;
		if(username.isEmpty() || password.isEmpty()) return check;
		String credencial = new UsuarioDAO().getCredenciais(username);
		if(credencial == null) check = false;
		else if(credencial.equals(password)) check = true;
		return check;


	}
	
	private void gravarAcesso(String username) {
		//Criar um thread novo, tratar a exception, e executar
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Utils.gravarUltimoAcesso(username, "ultimo_acesso.txt");
					Utils.gravarLogAcesso(username, "log_acessos.txt");
				} catch(IOException e) {
					System.out.println(e);
				}
			}
		});
		t.start();
	}	
}