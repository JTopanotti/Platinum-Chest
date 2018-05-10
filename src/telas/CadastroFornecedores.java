package telas;

import dao.FornecedorDAO;
import objetos.Fornecedor;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import javax.swing.border.BevelBorder;

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
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 533, 320);
		getContentPane().setLayout(null);
		
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

		forn = new JTextField();
		panel_2.add(forn, BorderLayout.CENTER);
		forn.setEditable(false);
		forn.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);

		fornnome = new JTextField();
		panel_13.add(fornnome);
		fornnome.setColumns(10);

		forncnpj = new JFormattedTextField();
		panel_13.add(forncnpj);
		
		fornie = new JTextField();
		panel_13.add(fornie);
		fornie.setColumns(10);

		fornender = new JTextField();
		panel_13.add(fornender);
		fornender.setColumns(10);

		forncidade = new JTextField();
		panel_13.add(forncidade);
		
		fornestado = new JComboBox();
		panel_13.add(fornestado);
		fornestado.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));

		forntelefone = new JTextField();
		panel_13.add(forntelefone);
		forntelefone.setColumns(10);

		fornemail = new JTextField();
		panel_13.add(fornemail);
		fornemail.setColumns(10);

		fornsit = new JComboBox();
		panel_13.add(fornsit);
		fornsit.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));

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
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(391, 11, 116, 268);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAlterar = new JButton("Salvar");
		btnAlterar.setBounds(10, 11, 95, 23);
		btnAlterar.addActionListener((e) -> salvarUsuario());
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
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj(Integer.parseInt(forncnpj.getText()));
		fornecedor.setIe(Integer.parseInt(fornie.getText()));
		fornecedor.setEndereco(fornender.getText());
		fornecedor.setEstado((String) fornestado.getSelectedItem());
		fornecedor.setTelefone(Integer.parseInt(forntelefone.getText()));
		fornecedor.setSituacao(fornsit.getSelectedIndex());
		fornecedor.setEmail(fornemail.getText());
		fornecedor.setCidade(forncidade.getText());
		fornecedor.setNome(fornnome.getText());
		new FornecedorDAO().salvarFornecedor(fornecedor);
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	}
}
