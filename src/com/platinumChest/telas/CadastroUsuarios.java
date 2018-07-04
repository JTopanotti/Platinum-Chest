package com.platinumChest.telas;

import com.platinumChest.listeners.AcaoListener;
import com.platinumChest.listeners.UsuarioListener;
import com.platinumChest.objetos.Usuario;
import com.platinumChest.utils.TextFieldLimiter;


import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.text.MaskFormatter;
import java.awt.GridLayout;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import javax.swing.border.BevelBorder;

public class CadastroUsuarios extends JInternalFrame {
	private JTextField tfNome;
	private JTextField tfUsuario;
	private JFormattedTextField ftfCPF;
	private JTextField tfEndereco;
	private JTextField tfCidade;
	private JComboBox cbEstado;
	private JComboBox cbSituacao;
	private JFormattedTextField ftfTelefone;
	private JTextField tfEmail;
	private MaskFormatter maskCPF;
	private MaskFormatter maskTelefone;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CadastroUsuarios() {
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		setTitle("Cadastro de Usu\u00E1rios");
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 582, 370);
		getContentPane().setLayout(null);

		try {
			maskCPF = new MaskFormatter("###.###.###-##");
			maskTelefone = new MaskFormatter("(##) ####-####");
		} catch (ParseException e) {
			System.out.println("Erro de Parsing na máscara: "+e.getMessage());
		}
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(444, 7, 116, 322);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnPersistir = new JButton("Salvar");
		btnPersistir.setBounds(10, 11, 95, 23);
		btnPersistir.addActionListener(new UsuarioListener(this));
		btnPersistir.addActionListener(new AcaoListener("Cadastro de Usuario"));
		panel_1.add(btnPersistir);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 79, 95, 23);
		panel_1.add(btnExcluir);

		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.setBounds(10, 112, 95, 23);
		panel_1.add(btnAjuda);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(10, 146, 95, 23);
		panel_1.add(btnSair);

		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(10, 45, 95, 23);
		panel_1.add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 7, 425, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(10, 11, 88, 301);
		panel.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblUsurio);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNome);

		JLabel lblNewLabel = new JLabel("Classifica\u00E7\u00E3o:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblCpf);

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

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(108, 11, 307, 301);
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_13.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		tfUsuario = new JTextField();
		panel_2.add(tfUsuario, BorderLayout.CENTER);
		tfUsuario.setEditable(false);
		tfUsuario.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);

		tfNome = new JTextField();
		tfNome.setDocument(new TextFieldLimiter(255));
		panel_13.add(tfNome);
		tfNome.setColumns(10);

		JComboBox classificacao = new JComboBox();
		panel_13.add(classificacao);
		classificacao.setModel(new DefaultComboBoxModel(new String[] {"0- Gerente", "1- Funcionario"}));
		classificacao.setSelectedIndex(0);

		ftfCPF = new JFormattedTextField(maskCPF);
		ftfCPF.setDocument(new TextFieldLimiter(14));
		panel_13.add(ftfCPF);

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

		ftfTelefone = new JFormattedTextField(maskTelefone);
		ftfTelefone.setDocument(new TextFieldLimiter(14));
		panel_13.add(ftfTelefone);
		ftfTelefone.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setDocument(new TextFieldLimiter(255));
		panel_13.add(tfEmail);
		tfEmail.setColumns(10);

		cbSituacao = new JComboBox();
		panel_13.add(cbSituacao);
		cbSituacao.setModel(new DefaultComboBoxModel(new String[] {"0- Ativo", "1- Inativo"}));

	}

	public Usuario salvarUsuario(){
		Usuario user = new Usuario();
		user.setNome(tfNome.getText());
		user.setCidade(tfCidade.getText());
		user.setCpf(Integer.parseInt(ftfCPF.getText()));
		user.setEmail(tfEmail.getText());
		user.setEndereco(tfEndereco.getText());
		user.setEstado((String) cbEstado.getSelectedItem());
		user.setSituacao(cbSituacao.getSelectedIndex());
		user.setTelefone(Integer.parseInt(ftfTelefone.getText()));
		user.setUsuario(tfUsuario.getText());
		return user;

	}
}
