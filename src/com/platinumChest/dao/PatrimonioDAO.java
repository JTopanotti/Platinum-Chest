package com.platinumChest.dao;

import com.platinumChest.objetos.Patrimonio;
import java.util.ArrayList;

public interface PatrimonioDAO {

    ArrayList<Patrimonio> getPatrimonios();

    ArrayList<Patrimonio> getPatrimoniosPorNome(String nome);


    boolean salvarPatrimonio(Patrimonio pat);

}
