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
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 36, 265, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(55, 39, 31, 14);
		panel.add(lblNome);
		
		JLabel label = new JLabel("");
		label.setBounds(40, 39, 46, 14);
		panel.add(label);
		
		JLabel lblForn = new JLabel("Fornecedor");
		lblForn.setBounds(46, 14, 40, 14);
		panel.add(lblForn);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(96, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(57, 64, 29, 14);
		panel.add(lblCnpj);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(96, 61, 139, 20);
		panel.add(formattedTextField);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(37, 114, 49, 14);
		panel.add(lblEndereo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 111, 265, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(49, 139, 37, 14);
		panel.add(lblCidade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 136, 139, 20);
		panel.add(textField_3);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(49, 164, 37, 14);
		panel.add(lblEstado);
		
		textField_4 = new JComboBox();
		textField_4.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		textField_4.setBounds(96, 161, 139, 20);
		panel.add(textField_4);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setBounds(40, 240, 45, 14);
		panel.add(lblSituao);
		
		textField_5 = new JComboBox();
		textField_5.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));
		textField_5.setBounds(96, 237, 86, 20);
		panel.add(textField_5);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPesquisar.setBounds(185, 11, 79, 20);
		panel.add(btnPesquisar);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(40, 189, 46, 14);
		panel.add(lblTelefone);
		
		textField_6 = new JTextField();
		textField_6.setBounds(96, 186, 139, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(58, 215, 28, 14);
		panel.add(lblEmail);
		
		textField_7 = new JTextField();
		textField_7.setBounds(96, 212, 139, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblIe = new JLabel("IE:");
		lblIe.setBounds(72, 89, 14, 14);
		panel.add(lblIe);
		
		textField_8 = new JTextField();
		textField_8.setBounds(96, 86, 117, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
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
