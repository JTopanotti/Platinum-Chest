package telas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class ConsultaItem extends JInternalFrame {
	private JTextField textPesquisa;
	private JTable tabelaPatrimonio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaItem frame = new ConsultaItem();
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
	public ConsultaItem() {
		setRootPaneCheckingEnabled(false);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 414, 23);
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblNome = new JLabel("Nome:");
		panel.add(lblNome);
		
		textPesquisa = new JTextField();
		panel.add(textPesquisa);
		textPesquisa.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel.add(btnPesquisar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(4, 237, 426, -185);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		tabelaPatrimonio = new JTable();
		tabelaPatrimonio.setBounds(6, 16, 414, -207);
		panel_1.add(tabelaPatrimonio);
		tabelaPatrimonio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}
}
