package telas;

import dao.UsuarioDAO;
import objetos.Usuario;


import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.text.MaskFormatter;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class CadastroUsuarios extends JInternalFrame {
	private JTextField nome;
	private JTextField usuario;
	private JFormattedTextField cpf;
	private JTextField endereco;
	private JTextField cidade;
	private JComboBox estado;
	private JComboBox situacao;
	private JFormattedTextField telefone;
	private JTextField email;
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
			System.out.println("Ferrou bicho, a mascara ta dando problema: "+e.getMessage());
		}
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(444, 7, 116, 322);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnAlterar = new JButton("Salvar");
		btnAlterar.setBounds(10, 11, 95, 23);
		btnAlterar.addActionListener(e -> salvarUsuario());
		panel_1.add(btnAlterar);

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

		usuario = new JTextField();
		panel_2.add(usuario, BorderLayout.CENTER);
		usuario.setEditable(false);
		usuario.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);

		nome = new JTextField();
		panel_13.add(nome);
		nome.setColumns(10);

		JComboBox classificacao = new JComboBox();
		panel_13.add(classificacao);
		classificacao.setModel(new DefaultComboBoxModel(new String[] {"0- Gerente", "1- Funcionario"}));
		classificacao.setSelectedIndex(0);

		cpf = new JFormattedTextField(maskCPF);
		panel_13.add(cpf);

		endereco = new JTextField();
		panel_13.add(endereco);
		endereco.setColumns(10);

		cidade = new JTextField();
		panel_13.add(cidade);

		estado = new JComboBox();
		panel_13.add(estado);
		estado.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));

		telefone = new JFormattedTextField(maskTelefone);
		panel_13.add(telefone);
		telefone.setColumns(10);

		email = new JTextField();
		panel_13.add(email);
		email.setColumns(10);

		situacao = new JComboBox();
		panel_13.add(situacao);
		situacao.setModel(new DefaultComboBoxModel(new String[] {"0- Ativo", "1- Inativo"}));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}

	private void salvarUsuario(){
		Usuario user = new Usuario();
		user.setNome(nome.getText());
		user.setCidade(cidade.getText());
		user.setCpf(Integer.parseInt(cpf.getText()));
		user.setEmail(email.getText());
		user.setEndereco(endereco.getText());
		user.setEstado((String)estado.getSelectedItem());
		user.setSituacao(situacao.getSelectedIndex());
		user.setTelefone(Integer.parseInt(telefone.getText()));
		user.setUsuario(usuario.getText());
		new UsuarioDAO().salvarUsuario(user);
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

	}
}
