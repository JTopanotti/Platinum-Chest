package telas;

import dao.FornecedorDAO;
import objetos.Fornecedor;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class CadastroFornecedores extends JInternalFrame {
	private JTextField fornnome;
	private JTextField forn;
	private JFormattedTextField forncnpj;
	private JTextField fornender;
	private JTextField forncidade;
	private JComboBox fornestado;
	private JComboBox fornsit;
	private JTextField forntelefone;
	private JTextField fornemail;
	private JTextField fornie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedores frame = new CadastroFornecedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFornecedores() {
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 533, 320);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 371, 268);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 6, 330, 20);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblForn = new JLabel("Fornecedor");
		panel_2.add(lblForn, BorderLayout.WEST);
		
		forn = new JTextField();
		panel_2.add(forn, BorderLayout.CENTER);
		forn.setEditable(false);
		forn.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(48, 32, 267, 20);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNome = new JLabel("Nome:");
		panel_3.add(lblNome, BorderLayout.WEST);
		
		fornnome = new JTextField();
		panel_3.add(fornnome, BorderLayout.CENTER);
		fornnome.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(48, 58, 185, 20);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		panel_4.add(lblCnpj, BorderLayout.WEST);
		
		forncnpj = new JFormattedTextField();
		panel_4.add(forncnpj, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(65, 84, 168, 20);
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIe = new JLabel("IE:");
		panel_5.add(lblIe, BorderLayout.WEST);
		
		fornie = new JTextField();
		panel_5.add(fornie, BorderLayout.CENTER);
		fornie.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(32, 110, 305, 20);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		panel_6.add(lblEndereo, BorderLayout.WEST);
		
		fornender = new JTextField();
		panel_6.add(fornender, BorderLayout.CENTER);
		fornender.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(46, 136, 216, 20);
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCidade = new JLabel("Cidade:");
		panel_7.add(lblCidade, BorderLayout.WEST);
		
		forncidade = new JTextField();
		panel_7.add(forncidade, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(45, 162, 155, 20);
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEstado = new JLabel("Estado:");
		panel_8.add(lblEstado, BorderLayout.WEST);
		
		fornestado = new JComboBox();
		panel_8.add(fornestado, BorderLayout.CENTER);
		fornestado.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(35, 188, 188, 20);
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		panel_9.add(lblTelefone, BorderLayout.WEST);
		
		forntelefone = new JTextField();
		panel_9.add(forntelefone, BorderLayout.CENTER);
		forntelefone.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(55, 214, 204, 20);
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEmail = new JLabel("Email:");
		panel_10.add(lblEmail, BorderLayout.WEST);
		
		fornemail = new JTextField();
		panel_10.add(fornemail, BorderLayout.CENTER);
		fornemail.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(35, 240, 152, 20);
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		panel_11.add(lblSituao, BorderLayout.WEST);
		
		fornsit = new JComboBox();
		panel_11.add(fornsit, BorderLayout.CENTER);
		fornsit.setModel(new DefaultComboBoxModel(new String[] {"0- Ativo", "1- Inativo"}));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(391, 11, 116, 268);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAlterar = new JButton("Salvar");
		btnAlterar.setBounds(10, 11, 95, 23);
		btnAlterar.addActionListener((e) -> {
			salvarUsuario();
		});
		panel_1.add(btnAlterar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(10, 45, 95, 23);
		panel_1.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 79, 95, 23);
		panel_1.add(btnExcluir);
		
		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.setBounds(10, 112, 95, 23);
		panel_1.add(btnAjuda);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(10, 146, 95, 23);
		panel_1.add(btnSair);

	}

	private void salvarUsuario(){
		//Falta implementar
	}


	public JFormattedTextField getFormattedTextField() {
		return forncnpj;
	}
}
