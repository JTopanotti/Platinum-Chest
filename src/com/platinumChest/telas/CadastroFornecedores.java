package com.platinumChest.telas;

import com.platinumChest.listeners.AcaoListener;
import com.platinumChest.listeners.FornecedorListener;
import com.platinumChest.objetos.Fornecedor;
import com.platinumChest.utils.TextFieldLimiter;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import javax.swing.border.BevelBorder;
import javax.swing.text.MaskFormatter;

public class CadastroFornecedores extends JInternalFrame {
	private JTextField tfNome;
	private JTextField tfFornecedor;
	private JFormattedTextField ftfCnpj;
	private JTextField tfEndereco;
	private JTextField tfCidade;
	private JComboBox cbEstado;
	private JComboBox cbSituacao;
	private JFormattedTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfIE;
	private MaskFormatter maskCnpj;
	private MaskFormatter maskTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedores frame = new CadastroFornecedores();
					frame.setVisible(true);
					frame.toFront();
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
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		setClosable(true);
		setTitle("Cadastro de Fornecedor");
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 533, 320);
		getContentPane().setLayout(null);

		try {
			maskCnpj = new MaskFormatter("##.###.###/####-##");
			maskTelefone = new MaskFormatter("(##) ####-####");
		} catch (ParseException e) {
			System.out.println("Erro de Parsing na máscara: "+e.getMessage());
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 371, 268);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(104, 12, 255, 244);
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_13.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		tfFornecedor = new JTextField();
		panel_2.add(tfFornecedor, BorderLayout.CENTER);
		tfFornecedor.setEditable(false);
		tfFornecedor.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);

		tfNome = new JTextField();
		tfNome.setDocument(new TextFieldLimiter(255));
		panel_13.add(tfNome);
		tfNome.setColumns(10);

		ftfCnpj = new JFormattedTextField(maskCnpj);
		ftfCnpj.setDocument(new TextFieldLimiter(18));
		panel_13.add(ftfCnpj);
		
		tfIE = new JTextField();
		tfIE.setDocument(new TextFieldLimiter(11));
		panel_13.add(tfIE);
		tfIE.setColumns(10);

		tfEndereco = new JTextField();
		tfEndereco.setDocument(new TextFieldLimiter(255));
		panel_13.add(tfEndereco);
		tfEndereco.setColumns(10);

		tfCidade = new JTextField();
		tfCidade.setDocument(new TextFieldLimiter(255));
		panel_13.add(tfCidade);
		
		cbEstado = new JComboBox();
		panel_13.add(cbEstado);
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));

		tfTelefone = new JFormattedTextField(maskTelefone);
		tfTelefone.setDocument(new TextFieldLimiter(14));
		panel_13.add(tfTelefone);
		tfTelefone.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setDocument(new TextFieldLimiter(255));
		panel_13.add(tfEmail);
		tfEmail.setColumns(10);

		cbSituacao = new JComboBox();
		panel_13.add(cbSituacao);
		cbSituacao.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(10, 11, 82, 246);
		panel.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblForn = new JLabel("Fornecedor:");
		lblForn.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblForn);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNome);

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblCnpj);

		JLabel lblIe = new JLabel("IE:");
		lblIe.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblIe);

		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblEndereo);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblCidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblEstado);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblTelefone);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblEmail);

		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblSituao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(391, 11, 116, 268);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnPersistir = new JButton("Salvar");
		btnPersistir.setBounds(10, 11, 95, 23);
		btnPersistir.addActionListener(new FornecedorListener(this));
		btnPersistir.addActionListener(new AcaoListener("Cadastro de Fornecedor"));
		panel_1.add(btnPersistir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 45, 95, 23);
		panel_1.add(btnCancelar);
		
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

	public Fornecedor salvarFornecedor(){
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj(Integer.parseInt(ftfCnpj.getText()));
		fornecedor.setIe(Integer.parseInt(tfIE.getText()));
		fornecedor.setEndereco(tfEndereco.getText());
		fornecedor.setEstado((String) cbEstado.getSelectedItem());
		fornecedor.setTelefone(Integer.parseInt(tfTelefone.getText()));
		fornecedor.setSituacao(cbSituacao.getSelectedIndex());
		fornecedor.setEmail(tfEmail.getText());
		fornecedor.setCidade(tfCidade.getText());
		fornecedor.setNome(tfNome.getText());
		return fornecedor;
	}
}
