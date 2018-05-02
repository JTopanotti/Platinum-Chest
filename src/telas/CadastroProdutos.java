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
import javax.swing.JFrame;

public class CadastroProdutos extends JInternalFrame {
	private JTextField textField_1;
	private JTextField textField;
	private JFormattedTextField formattedTextField;
	private JComboBox textField_3;
	private JTextField textField_4;
	private JComboBox textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_2;
	private JLabel lblUsuarioG;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public CadastroProdutos() {
		setResizable(true);
		setTitle("Cadastro de Usu\u00E1rios");
		setMaximizable(true);
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 551, 428);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 7, 398, 356);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(50, 39, 46, 14);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(69, 18, 317, 29);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblItem = new JLabel("Item:");
		panel_2.add(lblItem, BorderLayout.WEST);
		
		textField = new JTextField();
		panel_2.add(textField, BorderLayout.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(65, 77, 190, 29);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSetor = new JLabel("Setor:");
		panel_3.add(lblSetor, BorderLayout.WEST);
		
		JComboBox list = new JComboBox();
		panel_3.add(list, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(69, 106, 141, 29);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblValor = new JLabel("Valor:");
		panel_4.add(lblValor, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		panel_4.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(21, 166, 198, 29);
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataCompra = new JLabel("Data Compra:");
		panel_5.add(lblDataCompra, BorderLayout.WEST);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		panel_5.add(formattedTextField_1, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(61, 48, 225, 29);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNome = new JLabel("Nome:");
		panel_6.add(lblNome, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		panel_6.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(85, 135, 177, 29);
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNF = new JLabel("NF:");
		panel_7.add(lblNF, BorderLayout.WEST);
		
		formattedTextField = new JFormattedTextField();
		panel_7.add(formattedTextField, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(31, 195, 260, 29);
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFornc = new JLabel("Fornecedor:");
		panel_8.add(lblFornc, BorderLayout.WEST);
		
		textField_3 = new JComboBox();
		panel_8.add(textField_3, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(28, 224, 236, 29);
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDeprec = new JLabel("Deprecia\u00E7\u00E3o:");
		panel_9.add(lblDeprec, BorderLayout.WEST);
		
		textField_4 = new JTextField();
		panel_9.add(textField_4, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(4, 312, 263, 29);
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		lblUsuarioG = new JLabel("Usu\u00E1rio Gera\u00E7\u00E3o:");
		panel_10.add(lblUsuarioG, BorderLayout.WEST);
		
		textField_6 = new JTextField();
		panel_10.add(textField_6, BorderLayout.CENTER);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(22, 253, 200, 29);
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataG = new JLabel("Data Gera\u00E7\u00E3o:");
		panel_11.add(lblDataG, BorderLayout.WEST);
		
		textField_7 = new JTextField();
		panel_11.add(textField_7, BorderLayout.CENTER);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(50, 282, 167, 29);
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		panel_12.add(lblSituao, BorderLayout.WEST);
		
		textField_5 = new JComboBox();
		panel_12.add(textField_5, BorderLayout.CENTER);
		textField_5.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(418, 6, 116, 299);
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
