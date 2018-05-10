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
import java.beans.PropertyVetoException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.border.BevelBorder;

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
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		setRootPaneCheckingEnabled(false);
		setClosable(true);
		setTitle("Cadastro de Patrim\u00F4nio");
		setBounds(100, 100, 552, 352);
		getContentPane().setLayout(null);
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 371, 290);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(114, 12, 245, 263);
		panel.add(panel_14);
		panel_14.setLayout(new BoxLayout(panel_14, BoxLayout.Y_AXIS));

		JPanel panel_2 = new JPanel();
		panel_14.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		item = new JTextField();
		panel_2.add(item);
		item.setEditable(false);
		item.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_2.add(btnPesquisar);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		nome = new JTextField();
		panel_14.add(nome);
		nome.setColumns(10);
		
		setor = new JComboBox();
		panel_14.add(setor);
		setor.setModel(new DefaultComboBoxModel(new String[] {"FIN", "RH", "TI", "COM", "PROD"}));
		setor.setSelectedIndex(0);

		nf = new JFormattedTextField();
		panel_14.add(nf);
		
		valor = new JTextField();
		panel_14.add(valor);
		valor.setColumns(10);

		deprec = new JTextField();
		panel_14.add(deprec);

		data_compra = (JFormattedTextField) new JTextField();
		panel_14.add(data_compra);
		data_compra.setColumns(10);

		fornecedor = new JComboBox();
		List<Fornecedor> fornecedores = new FornecedorDAO().getFornecedores();
		fornecedor.setModel(new DefaultComboBoxModel(fornecedores.toArray()));
		panel_14.add(fornecedor);
		
		usuario = new JComboBox();
		List<Usuario> usuarios = new UsuarioDAO().getUsuarios();
		usuario.setModel(new DefaultComboBoxModel(usuarios.toArray()));
		panel_14.add(usuario);
		
		Date d = new Date(System.currentTimeMillis());
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		data_ger = (JFormattedTextField) new JTextField(f.format(d).toString());
		data_ger.setEditable(false);
		panel_14.add(data_ger);
		data_ger.setColumns(10);


		
		situacao = new JComboBox();
		panel_14.add(situacao);
		situacao.setModel(new DefaultComboBoxModel(new String[] {"1- Ativo", "2- Inativo"}));

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(12, 12, 90, 263);
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblItem = new JLabel("Item:");
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblItem);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNome);

		JLabel Setor = new JLabel("Setor:");
		Setor.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(Setor);

		JLabel lblNF = new JLabel("NF:");
		lblNF.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNF);

		JLabel Valor = new JLabel("Valor:");
		Valor.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(Valor);

		JLabel lblDepr = new JLabel("Deprecia\u00E7\u00E3o:");
		lblDepr.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblDepr);

		JLabel lblDataC = new JLabel("Data compra:");
		lblDataC.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblDataC);

		JLabel lblForn = new JLabel("Fornecedor:");
		lblForn.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblForn);

		JLabel lblEmail = new JLabel("Usu. Gera\u00E7\u00E3o:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblEmail);

		JLabel lblDataG = new JLabel("Data Gera\u00E7\u00E3o:");
		lblDataG.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblDataG);

		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblSituao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(391, 11, 135, 290);
		getContentPane().add(panel_1);
		
		JButton btnAlterar = new JButton("Salvar");
		btnAlterar.addActionListener(e -> salvarPatrimonio());
		
		JButton btnNewButton = new JButton("Cancelar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnAjuda = new JButton("Ajuda");
		
		JButton btnSair = new JButton("Sair");
		
		JButton btnMovimentao = new JButton("Movimenta\u00E7\u00E3o");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(8)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAjuda, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnMovimentao, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(9)
								.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGap(10)
								.addComponent(btnAjuda, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addComponent(btnMovimentao, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);

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
