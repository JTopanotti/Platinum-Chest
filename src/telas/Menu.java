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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel panel = new JPanel();
		panel.setLayout(new CardLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnCadastro.add(mnProdutos);
		
		JMenuItem mntmCadastro_1 = new JMenuItem("Cadastro");
		mntmCadastro_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroProdutos p = new CadastroProdutos();
				panel.add(p);
			}
		});
		mnProdutos.add(mntmCadastro_1);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mnProdutos.add(mntmConsulta);
		
		JMenuItem mntmMovimentao = new JMenuItem("Movimenta\u00E7\u00E3o");
		mnProdutos.add(mntmMovimentao);
		
		JMenu mnUsurios = new JMenu("Usu\u00E1rios");
		mnCadastro.add(mnUsurios);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroUsuarios cadastro = new CadastroUsuarios();
				cadastro.setVisible(true);
				panel.add(cadastro);
			}
		});
		mnUsurios.add(mntmCadastro);
		
		JMenuItem mntmConsulta_1 = new JMenuItem("Consulta");
		mnUsurios.add(mntmConsulta_1);
		
		JMenu mnFornecedores = new JMenu("Fornecedores");
		mnCadastro.add(mnFornecedores);
		
		JMenuItem mntmCadastro_2 = new JMenuItem("Cadastro");
		mnFornecedores.add(mntmCadastro_2);
		
		JMenuItem mntmConsulta_2 = new JMenuItem("Consulta");
		mnFornecedores.add(mntmConsulta_2);
		
		JMenuItem mntmSetores = new JMenuItem("Setores");
		mnCadastro.add(mntmSetores);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mnRelatrios.add(mntmProdutos);
		
		JMenuItem mntmMovimentaes = new JMenuItem("Movimenta\u00E7\u00F5es");
		mnRelatrios.add(mntmMovimentaes);
		
		JMenuItem mntmSetores_1 = new JMenuItem("Setores");
		mnRelatrios.add(mntmSetores_1);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(panel, BorderLayout.CENTER);	
	}
}
