package telas;

import dao.PatrimonioDAO;
import objetos.Patrimonio;

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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

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
				pesquisar();
			}
		});

	}

	private void pesquisar(){
		List<Patrimonio> patrimonios = new PatrimonioDAO().getPatrimonios();
		if(!textPesquisa.getText().isEmpty()){
			patrimonios = patrimonios.stream().filter(patrimonio ->
					patrimonio.getNome().contains(textPesquisa.getText()))
					.collect(Collectors.toList());
		}
		System.out.println(patrimonios);
		DefaultTableModel model =
				new DefaultTableModel(new String[]{"ID", "NOME"}, 0);
		Iterator it = patrimonios.iterator();
		while (it.hasNext()){
			Patrimonio next = (Patrimonio) it.next();
			model.addRow(new Object[]{next.getId(), next.getNome()});
		}
		tabelaPatrimonio.setModel(model);
		tabelaPatrimonio.setVisible(true);
		this.setVisible(true);
	}
}
