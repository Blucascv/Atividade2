package Atividade3Java;

public class ProdutoDao {

	public void Cadastrar(Produto produto) {
		produto.setId("1");
		produto.setNome("Caf�");
		produto.setTipo("Fam�lia");
		produto.setMarca("S�o Braz");
		produto.setDescricao("Caf� tem que ser S�o Braz");
	}

	public void Atualizar(Produto produto) {
		System.out.println("Atualizando produto");
	}

	public void Excluir(Produto produto) {
		System.out.println("Excluindo produto");
	}

	public Produto listar(Produto produto) {
		return produto;
	}
}
