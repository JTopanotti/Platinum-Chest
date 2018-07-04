package com.platinumChest.listeners;

import com.platinumChest.utils.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoListener implements ActionListener {

    private String acao;

    public AcaoListener(String acao){
        this.acao = acao;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new Thread(() -> Utils.gravarAcao(acao)).start();
    }
}
