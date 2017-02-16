package Atividade3Java;

public class ProdutoDao {

	public void Cadastrar(Produto produto) {
		produto.setId("1");
		produto.setNome("Café");
		produto.setTipo("Família");
		produto.setMarca("São Braz");
		produto.setDescricao("Café tem que ser São Braz");
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
