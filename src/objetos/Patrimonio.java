package objetos;

import java.util.Date;

public class Patrimonio {
	
	private int cod;
	private String nome;
	private int setor;
	private float valor;
	private int nf;
	private Date data_compra;
	private int fornecedor;
	private int depreciacao;
	private Date data_geracao;
	private int situacao;
	private int usuario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getCod() {
		return cod;
	}
	public int getNf() {
		return nf;
	}
	public Date getData_compra() {
		return data_compra;
	}
	public int getFornecedor() {
		return fornecedor;
	}
	public int getDepreciacao() {
		return depreciacao;
	}
	public Date getData_geracao() {
		return data_geracao;
	}
	public int getUsuario() {
		return usuario;
	}
}
