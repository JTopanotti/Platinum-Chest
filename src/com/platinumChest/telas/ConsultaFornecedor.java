package com.platinumChest.telas;

import com.platinumChest.dao.FornecedorDAO;
import com.platinumChest.listeners.AcaoListener;
import com.platinumChest.objetos.Fornecedor;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class ConsultaFornecedor extends JInternalFrame {
    private JTextField textPesquisa;
    private JTable tabela;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ConsultaPatrimonio frame = new ConsultaPatrimonio();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public ConsultaFornecedor() {
        setRootPaneCheckingEnabled(false);
        setClosable(true);
        getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel.setLayout(new BorderLayout());
        JLabel lblNome = new JLabel("Nome:");
        panel.add(lblNome, BorderLayout.WEST);
        textPesquisa = new JTextField();
        panel.add(textPesquisa, BorderLayout.CENTER);
        textPesquisa.setColumns(10);
        JButton btnPesquisar = new JButton("Pesquisar");
        panel.add(btnPesquisar, BorderLayout.EAST);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel_1.setLayout(new BorderLayout());
        tabela = new JTable();
        panel_1.add(new JScrollPane(tabela), BorderLayout.CENTER);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        btnPesquisar.addActionListener(arg0 -> pesquisar());
        btnPesquisar.addActionListener(new AcaoListener("Listagem de Fornecedores"));

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panel, BorderLayout.NORTH);
        panelPrincipal.add(panel_1, BorderLayout.SOUTH);

        getContentPane().add(panelPrincipal, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);

    }

    private void pesquisar(){
        ArrayList<Fornecedor> fornecedores =
                new ArrayList<>(new FornecedorDAO().getFornecedoresPorNome(textPesquisa.getText()));
        DefaultTableModel model =
                new DefaultTableModel(new String[]{"ID", "NOME"}, 0);
        Iterator it = fornecedores.iterator();
        while (it.hasNext()){
            Fornecedor next = (Fornecedor) it.next();
            model.addRow(new Object[]{next.getId(), next.getNome()});
        }
        tabela.setModel(model);
    }
}
