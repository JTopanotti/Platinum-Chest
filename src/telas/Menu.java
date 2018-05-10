package telas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Platinum Chest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		JDesktopPane panel = new JDesktopPane();
		
		JMenu mnCadastro = new JMenu("Cadastro");
		JMenu mnProdutos = new JMenu("Produtos");
		JMenu mnFornecedores = new JMenu("Fornecedores");
		JMenu mnUsuarios = new JMenu("Usu\u00E1rios");
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		JMenuItem miCadastroProduto = new JMenuItem("Cadastro");
		JMenuItem miCadastroUsuario = new JMenuItem("Cadastro");
		JMenuItem miCadastroFornecedor = new JMenuItem("Cadastro");
		JMenuItem miConsultaUsuario = new JMenuItem("Consulta");
		JMenuItem miConsultaProduto = new JMenuItem("Consulta");
		JMenuItem miConsultaFornecedor = new JMenuItem("Consulta");
		JMenuItem miMovimentacao = new JMenuItem("Movimenta\u00E7\u00E3o");
		JMenuItem mntmMovimentaes = new JMenuItem("Movimenta\u00E7\u00F5es");
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		JMenu mnSobre = new JMenu("Sobre");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		miCadastroProduto.addActionListener((e) -> {
			CadastroItem cadastroItem = new CadastroItem();
			cadastroItem.setVisible(true);
			panel.add(cadastroItem);
		});
		miCadastroUsuario.addActionListener((e) -> {
			CadastroUsuarios cadastroUsuario = new CadastroUsuarios();
			cadastroUsuario.setVisible(true);
			panel.add(cadastroUsuario);
		});
		miCadastroFornecedor.addActionListener((e) -> {
			CadastroFornecedores cadastroFornecedor 
				= new CadastroFornecedores();
			cadastroFornecedor.setVisible(true);
			panel.add(cadastroFornecedor);
		});

		miConsultaProduto.addActionListener((e) -> {
			ConsultaItem consultaItem = new ConsultaItem();
			consultaItem.setVisible(true);
			panel.add(consultaItem);
		});

		miConsultaFornecedor.addActionListener((e) -> {
			ConsultaFornecedor consultaFornecedor = new ConsultaFornecedor();
			consultaFornecedor.setVisible(true);
			panel.add(consultaFornecedor);
		});

		miConsultaUsuario.addActionListener((e) -> {
			ConsultaUsuario consultaUsuario = new ConsultaUsuario();
			consultaUsuario.setVisible(true);
			panel.add(consultaUsuario);
		});
		
		menuBar.add(mnCadastro);
		mnCadastro.add(mnProdutos);
		mnProdutos.add(miCadastroProduto);
		mnProdutos.add(miConsultaProduto);
		mnProdutos.add(miMovimentacao);
		mnCadastro.add(mnUsuarios);
		mnUsuarios.add(miCadastroUsuario);
		mnUsuarios.add(miConsultaUsuario);
		mnCadastro.add(mnFornecedores);
		mnFornecedores.add(miCadastroFornecedor);
		mnFornecedores.add(miConsultaFornecedor);
		menuBar.add(mnRelatrios);
		mnRelatrios.add(mntmProdutos);
		mnRelatrios.add(mntmMovimentaes);
		menuBar.add(mnSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}
}
