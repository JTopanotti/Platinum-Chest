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
		setBounds(100, 100, 551, 343);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 398, 294);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 36, 265, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(65, 39, 31, 14);
		panel.add(lblNome);
		
		JLabel label = new JLabel("");
		label.setBounds(50, 39, 46, 14);
		panel.add(label);
		
		JLabel lblSetor = new JLabel("Setor:");
		lblSetor.setBounds(66, 64, 30, 14);
		panel.add(lblSetor);
		
		JLabel lblItem = new JLabel("Item:");
		lblItem.setBounds(70, 14, 26, 14);
		panel.add(lblItem);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(106, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox list = new JComboBox();
		list.setSelectedIndex(0);
		list.setBounds(106, 61, 117, 20);
		panel.add(list);
		
		JLabel lblNF = new JLabel("NF:");
		lblNF.setBounds(79, 114, 17, 14);
		panel.add(lblNF);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(106, 111, 117, 20);
		panel.add(formattedTextField);
		
		JLabel lblDataCompra = new JLabel("Data Compra:");
		lblDataCompra.setBounds(29, 139, 67, 14);
		panel.add(lblDataCompra);
		
		JLabel lblFornc = new JLabel("Fornecedor:");
		lblFornc.setBounds(37, 164, 59, 14);
		panel.add(lblFornc);
		
		textField_3 = new JComboBox();
		textField_3.setBounds(106, 161, 139, 20);
		panel.add(textField_3);
		
		JLabel lblDeprec = new JLabel("Deprecia\u00E7\u00E3o:");
		lblDeprec.setBounds(33, 189, 63, 14);
		panel.add(lblDeprec);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 186, 86, 20);
		panel.add(textField_4);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setBounds(50, 265, 45, 14);
		panel.add(lblSituao);
		
		textField_5 = new JComboBox();
		textField_5.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));
		textField_5.setBounds(106, 262, 86, 20);
		panel.add(textField_5);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPesquisar.setBounds(195, 11, 79, 20);
		panel.add(btnPesquisar);
		
		lblUsuarioG = new JLabel("Usu\u00E1rio Gera\u00E7\u00E3o:");
		lblUsuarioG.setBounds(13, 214, 83, 14);
		panel.add(lblUsuarioG);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(106, 211, 139, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDataG = new JLabel("Data Gera\u00E7\u00E3o:");
		lblDataG.setBounds(26, 239, 70, 14);
		panel.add(lblDataG);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(106, 237, 139, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(106, 136, 117, 20);
		panel.add(formattedTextField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 86, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(68, 89, 28, 14);
		panel.add(lblValor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(418, 24, 116, 281);
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
