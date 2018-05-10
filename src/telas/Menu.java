package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DesktopPaneUI;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu(int user) {
		setTitle("Platinum Chest");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
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
		panel.setLayout(new CardLayout(0, 0));
	}
}
