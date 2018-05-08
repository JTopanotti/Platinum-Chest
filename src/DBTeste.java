import dao.FornecedorDAO;
import objetos.Fornecedor;

public class DBTeste {
    public static void main(String[] args){

        Fornecedor forn = new FornecedorDAO().getFornecedorPorIdHibernate(1);
        System.out.println(forn.getNome());

    }
}
