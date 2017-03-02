package ContaCorrente;
/***
 * 
 * @author aluno
 *
 */
public class ContaCorrente {

	private int numeroConta;
	private float numeroAgencia;
	public float saldo;
	private String cliente;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(float numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	

}