import dao.FornecedorDAO;
import dao.PatrimonioDAO;
import dao.UsuarioDAO;
import objetos.Fornecedor;
import objetos.Patrimonio;
import objetos.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class DBTeste {
    public static void main(String[] args){

        List<Patrimonio> pats = new PatrimonioDAO().getPatrimonios();
        pats = pats.stream().filter(patrimonio ->
           patrimonio.getNome().contains("PC"))
                .collect(Collectors.toList());
        System.out.println(pats.get(0).getNome());

    }
}
