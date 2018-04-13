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
		setBounds(100, 100, 552, 352);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 371, 290);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(40, 39, 46, 14);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(64, 7, 251, 20);
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
		panel_3.setBounds(56, 29, 251, 20);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNome = new JLabel("Nome:");
		panel_3.add(lblNome, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(59, 53, 194, 20);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel Setor = new JLabel("Setor:");
		panel_4.add(Setor, BorderLayout.WEST);
		
		JComboBox list = new JComboBox();
		panel_4.add(list, BorderLayout.CENTER);
		list.setSelectedIndex(0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(76, 77, 134, 20);
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNF = new JLabel("NF:");
		panel_5.add(lblNF, BorderLayout.WEST);
		
		formattedTextField = new JFormattedTextField();
		panel_5.add(formattedTextField, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(61, 101, 135, 20);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel Valor = new JLabel("Valor:");
		panel_6.add(Valor, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		panel_6.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(16, 126, 251, 20);
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDepr = new JLabel("Deprecia\u00E7\u00E3o:");
		panel_7.add(lblDepr, BorderLayout.WEST);
		
		textField_3 = new JTextField();
		panel_7.add(textField_3, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(13, 150, 190, 20);
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataC = new JLabel("Data compra:");
		panel_8.add(lblDataC, BorderLayout.WEST);
		
		textField_4 = new JTextField();
		panel_8.add(textField_4, BorderLayout.CENTER);
		textField_4.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(22, 174, 243, 20);
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblForn = new JLabel("Fornecedor:");
		panel_9.add(lblForn, BorderLayout.WEST);
		
		textField_6 = new JComboBox();
		panel_9.add(textField_6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(11, 199, 212, 20);
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEmail = new JLabel("Usu. Gera\u00E7\u00E3o:");
		panel_10.add(lblEmail, BorderLayout.WEST);
		
		textField_7 = new JComboBox();
		panel_10.add(textField_7, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(12, 222, 189, 20);
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataG = new JLabel("Data Gera\u00E7\u00E3o:");
		panel_11.add(lblDataG, BorderLayout.WEST);
		
		textField_8 = new JTextField();
		panel_11.add(textField_8, BorderLayout.CENTER);
		textField_8.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(42, 246, 149, 20);
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
