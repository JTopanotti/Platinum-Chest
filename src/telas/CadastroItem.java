package telas;

import dao.FornecedorDAO;
import dao.PatrimonioDAO;
import dao.UsuarioDAO;
import objetos.Fornecedor;
import objetos.Patrimonio;
import objetos.Usuario;
import org.hibernate.Session;

import java.awt.*;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CadastroItem extends JInternalFrame {
	private JTextField nome;
	private JTextField item;
	private JFormattedTextField nf;
	private JTextField valor;
	private JTextField deprec;
	private JComboBox situacao;
	private JComboBox fornecedor;
	private JComboBox setor;
	private JComboBox usuario;
	private JFormattedTextField data_compra;
	private JFormattedTextField data_ger;

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
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 371, 290);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(64, 5, 251, 20);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblItem = new JLabel("Item:");
		panel_2.add(lblItem, BorderLayout.WEST);
		
		item = new JTextField();
		panel_2.add(item, BorderLayout.CENTER);
		item.setEditable(false);
		item.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(56, 30, 251, 20);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNome = new JLabel("Nome:");
		panel_3.add(lblNome, BorderLayout.WEST);
		
		nome = new JTextField();
		panel_3.add(nome, BorderLayout.CENTER);
		nome.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(59, 55, 194, 20);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel Setor = new JLabel("Setor:");
		panel_4.add(Setor, BorderLayout.WEST);
		
		setor = new JComboBox();
		setor.setModel(new DefaultComboBoxModel(new String[] {"FIN", "RH", "TI", "COM", "PROD"}));
		panel_4.add(setor, BorderLayout.CENTER);
		setor.setSelectedIndex(0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(76, 80, 134, 20);
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNF = new JLabel("NF:");
		panel_5.add(lblNF, BorderLayout.WEST);
		
		nf = new JFormattedTextField();
		panel_5.add(nf, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(61, 105, 135, 20);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel Valor = new JLabel("Valor:");
		panel_6.add(Valor, BorderLayout.WEST);
		
		valor = new JTextField();
		panel_6.add(valor, BorderLayout.CENTER);
		valor.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(16, 130, 251, 20);
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDepr = new JLabel("Deprecia\u00E7\u00E3o:");
		panel_7.add(lblDepr, BorderLayout.WEST);
		
		deprec = new JTextField();
		panel_7.add(deprec, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(13, 155, 190, 20);
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataC = new JLabel("Data compra:");
		panel_8.add(lblDataC, BorderLayout.WEST);

		data_compra = new JFormattedTextField(df);
		panel_8.add(data_compra, BorderLayout.CENTER);
		data_compra.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(22, 180, 243, 20);
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblForn = new JLabel("Fornecedor:");
		panel_9.add(lblForn, BorderLayout.WEST);
		
		fornecedor = new JComboBox();

		List<Fornecedor> fornecedores = new FornecedorDAO().getFornecedores();
		fornecedor.setModel(new DefaultComboBoxModel(fornecedores.toArray()));
		panel_9.add(fornecedor, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(11, 205, 212, 20);
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEmail = new JLabel("Usu. Gera\u00E7\u00E3o:");
		panel_10.add(lblEmail, BorderLayout.WEST);

		List<Usuario> usuarios = new UsuarioDAO().getUsuarios();
		usuario = new JComboBox();
		usuario.setModel(new DefaultComboBoxModel(usuarios.toArray()));
		panel_10.add(usuario, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(12, 230, 189, 20);
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataG = new JLabel("Data Gera\u00E7\u00E3o:");
		panel_11.add(lblDataG, BorderLayout.WEST);
		
		data_ger = new JFormattedTextField(df);
		panel_11.add(data_ger, BorderLayout.CENTER);
		data_ger.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(42, 255, 149, 20);
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		panel_12.add(lblSituao, BorderLayout.WEST);
		
		situacao = new JComboBox();
		panel_12.add(situacao, BorderLayout.CENTER);
		situacao.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(391, 11, 135, 290);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAlterar = new JButton("Salvar");
		btnAlterar.setBounds(10, 11, 115, 23);
		btnAlterar.addActionListener(e -> salvarPatrimonio());
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

	private void salvarPatrimonio(){
		Patrimonio pat = new Patrimonio();
		pat.setNome(nome.getText());
		pat.setSetor((String)setor.getSelectedItem());
		pat.setSituacao(situacao.getSelectedIndex());
		float valor_f = valor.getText().isEmpty() ? new Float(0):
				Float.parseFloat(valor.getText());
		pat.setValor(valor_f);
		pat.setFornecedor(((Fornecedor)fornecedor.getSelectedItem()).getId());
		pat.setUsuario(((Usuario)usuario.getSelectedItem()).getId());
		pat.setData_compra(new Date(data_compra.getText()));
		pat.setData_geracao(new Date(data_ger.getText()));
		new PatrimonioDAO().salvarPatrimonio(pat);
	}

	public JFormattedTextField getFormattedTextField() {
		return nf;
	}
}
