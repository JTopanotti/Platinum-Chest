package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.io.IOException;

import dao.UsuarioDAO;
import utils.Utils;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField caixauser;
	private JPasswordField caixapass;
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 7, 254, 46);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 1, 142, 43);
		panel_2.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel_4.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 5));

		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		panel.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha:");
		panel.add(lblSenha);

		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		caixauser = new JTextField();
		panel_1.add(caixauser);
		caixauser.setColumns(10);
		
		caixapass = new JPasswordField();
		panel_1.add(caixapass);
		caixapass.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(165, 0, 89, 46);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(e -> {
            boolean valido = verificarAcesso();
            if(!valido) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido", "Credenciais inválidos", JOptionPane.WARNING_MESSAGE);
            } else {
                Menu menu = new Menu();
                gravarAcesso(caixauser.getText());
                menu.setVisible(true);
            }
        });
		btnEntrar.setBounds(0, 0, 89, 23);
		panel_3.add(btnEntrar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(0, 23, 89, 23);
		panel_3.add(btnCancelar);
	}

	private boolean verificarAcesso(){
		String username = caixauser.getText();
		String password = caixapass.getText();
		if(username.isEmpty() || password.isEmpty())
			return false;
		else {
			String credencial = new UsuarioDAO().getCredenciais(username);
			if(credencial == null) return false;
			else return password.equals(credencial);
		}
	}
	
	private void gravarAcesso(String username) {
		//Criar um thread novo, tratar a exception, e executar
		Thread t = new Thread(() -> {
            try {
                Utils.gravarUltimoAcesso(username, "ultimo_acesso.txt");
                Utils.gravarLog(username, "log_acessos.txt");
            } catch(IOException e) {
            	Utils.gravarException();
            }
        });
		t.start();
	}	
}