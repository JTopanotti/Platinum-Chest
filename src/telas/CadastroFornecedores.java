package telas;

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

public class CadastroFornecedores extends JInternalFrame {
	private JTextField textField_1;
	private JTextField textField;
	private JFormattedTextField formattedTextField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox textField_4;
	private JComboBox textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

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
		
		JLabel label = new JLabel("");
		label.setBounds(40, 39, 46, 14);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 8, 330, 20);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblForn = new JLabel("Fornecedor");
		panel_2.add(lblForn, BorderLayout.WEST);
		
		textField = new JTextField();
		panel_2.add(textField, BorderLayout.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(52, 31, 267, 20);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNome = new JLabel("Nome:");
		panel_3.add(lblNome, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(58, 55, 185, 20);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		panel_4.add(lblCnpj, BorderLayout.WEST);
		
		formattedTextField = new JFormattedTextField();
		panel_4.add(formattedTextField, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(77, 77, 168, 20);
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIe = new JLabel("IE:");
		panel_5.add(lblIe, BorderLayout.WEST);
		
		textField_8 = new JTextField();
		panel_5.add(textField_8, BorderLayout.CENTER);
		textField_8.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(32, 99, 305, 20);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		panel_6.add(lblEndereo, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		panel_6.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(46, 122, 216, 20);
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCidade = new JLabel("Cidade:");
		panel_7.add(lblCidade, BorderLayout.WEST);
		
		textField_3 = new JTextField();
		panel_7.add(textField_3, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(45, 146, 155, 20);
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEstado = new JLabel("Estado:");
		panel_8.add(lblEstado, BorderLayout.WEST);
		
		textField_4 = new JComboBox();
		panel_8.add(textField_4, BorderLayout.CENTER);
		textField_4.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(35, 169, 188, 20);
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		panel_9.add(lblTelefone, BorderLayout.WEST);
		
		textField_6 = new JTextField();
		panel_9.add(textField_6, BorderLayout.CENTER);
		textField_6.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(55, 193, 204, 20);
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEmail = new JLabel("Email:");
		panel_10.add(lblEmail, BorderLayout.WEST);
		
		textField_7 = new JTextField();
		panel_10.add(textField_7, BorderLayout.CENTER);
		textField_7.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(35, 217, 152, 20);
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		panel_11.add(lblSituao, BorderLayout.WEST);
		
		textField_5 = new JComboBox();
		panel_11.add(textField_5, BorderLayout.CENTER);
		textField_5.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(391, 11, 116, 268);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(10, 11, 95, 23);
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
	public JFormattedTextField getFormattedTextField() {
		return formattedTextField;
	}
}
