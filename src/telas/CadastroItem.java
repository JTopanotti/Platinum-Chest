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

public class CadastroItem extends JInternalFrame {
	private JTextField textField_1;
	private JTextField textField;
	private JFormattedTextField formattedTextField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox textField_5;
	private JComboBox textField_6;
	private JComboBox textField_7;
	private JTextField textField_4;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroItem frame = new CadastroItem();
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
	public CadastroItem() {
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 552, 342);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 371, 290);
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
		
		JLabel Setor = new JLabel("Setor:");
		Setor.setBounds(56, 64, 30, 14);
		panel.add(Setor);
		
		JLabel lblItem = new JLabel("Item:");
		lblItem.setBounds(60, 14, 26, 14);
		panel.add(lblItem);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(96, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox list = new JComboBox();
		list.setSelectedIndex(0);
		list.setBounds(96, 61, 117, 20);
		panel.add(list);
		
		JLabel lblNF = new JLabel("NF:");
		lblNF.setBounds(69, 89, 17, 14);
		panel.add(lblNF);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(96, 86, 117, 20);
		panel.add(formattedTextField);
		
		JLabel Valor = new JLabel("Valor:");
		Valor.setBounds(58, 114, 28, 14);
		panel.add(Valor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 111, 63, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDepr = new JLabel("Deprecia\u00E7\u00E3o:");
		lblDepr.setBounds(23, 139, 63, 14);
		panel.add(lblDepr);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 136, 63, 20);
		panel.add(textField_3);
		
		JLabel lblDataC = new JLabel("Data compra:");
		lblDataC.setBounds(21, 164, 65, 14);
		panel.add(lblDataC);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setBounds(41, 265, 45, 14);
		panel.add(lblSituao);
		
		textField_5 = new JComboBox();
		textField_5.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));
		textField_5.setBounds(96, 262, 86, 20);
		panel.add(textField_5);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPesquisar.setBounds(185, 11, 79, 20);
		panel.add(btnPesquisar);
		
		JLabel lblForn = new JLabel("Fornecedor:");
		lblForn.setBounds(27, 189, 59, 14);
		panel.add(lblForn);
		
		textField_6 = new JComboBox();
		textField_6.setBounds(96, 186, 139, 20);
		panel.add(textField_6);
		
		JLabel lblEmail = new JLabel("Usu. Gera\u00E7\u00E3o:");
		lblEmail.setBounds(17, 214, 69, 14);
		panel.add(lblEmail);
		
		textField_7 = new JComboBox();
		textField_7.setBounds(96, 212, 139, 20);
		panel.add(textField_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(96, 161, 117, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDataG = new JLabel("Data Gera\u00E7\u00E3o:");
		lblDataG.setBounds(16, 239, 70, 14);
		panel.add(lblDataG);
		
		textField_8 = new JTextField();
		textField_8.setBounds(96, 236, 117, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(391, 11, 135, 290);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(10, 11, 115, 23);
		panel_1.add(btnAlterar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(10, 45, 115, 23);
		panel_1.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 79, 115, 23);
		panel_1.add(btnExcluir);
		
		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.setBounds(10, 112, 115, 23);
		panel_1.add(btnAjuda);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(10, 180, 115, 23);
		panel_1.add(btnSair);
		
		JButton btnMovimentao = new JButton("Movimenta\u00E7\u00E3o");
		btnMovimentao.setBounds(10, 146, 115, 23);
		panel_1.add(btnMovimentao);

	}
	public JFormattedTextField getFormattedTextField() {
		return formattedTextField;
	}
}
