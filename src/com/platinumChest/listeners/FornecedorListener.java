package com.platinumChest.listeners;

import com.platinumChest.objetos.Fornecedor;
import com.platinumChest.persistence.FornecedorPersister;
import com.platinumChest.telas.CadastroFornecedores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorListener implements ActionListener {

    private CadastroFornecedores cadastro;

    public FornecedorListener(CadastroFornecedores cadastro){
        this.cadastro = cadastro;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Fornecedor fornecedor = cadastro.salvarFornecedor();
        new FornecedorPersister().salvarFornecedor(fornecedor);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
