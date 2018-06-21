package com.platinumChest.listeners;

import com.platinumChest.dao.PatrimonioDAO;
import com.platinumChest.objetos.Patrimonio;
import com.platinumChest.telas.CadastroPatrimonio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatrimonioListener implements ActionListener {

    private CadastroPatrimonio cadastro;

    public PatrimonioListener(CadastroPatrimonio cadastro){
        this.cadastro = cadastro;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Patrimonio patrimonio = cadastro.salvarPatrimonio();
        new PatrimonioDAO().salvarPatrimonio(patrimonio);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
