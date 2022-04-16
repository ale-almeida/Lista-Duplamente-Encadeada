
public class ListaDupla {
	private No inicio, fim;
	int tamanho;

	public void inserirInicio(String info) {
		No no = new No();
		no.informacao = info;
		no.anterior = null;
		no.proximo = inicio;
		if(inicio!= null) {
			inicio.anterior =no;
		}
		inicio = no;
		if(tamanho == 0){
			fim  = inicio;
		}
		tamanho++;
	}
	public String retirarInicio() {
		if (inicio == null) {
			return null;
		}

		String out = inicio.informacao;
		inicio = inicio.proximo;
		if(inicio!= null) {
			inicio.anterior = null;
		}else {
			fim = null;
		}
		tamanho--;
		return out;

	}
	public void inserirFim(String info) {
		No no = new No();
		no.informacao = info;
		no.proximo = null;
		no.anterior = fim;
		if (fim != null){
			fim.proximo = no;
		}
		fim = no;
		if(tamanho == 0) {
			inicio = fim;
		}
		tamanho++;
	}
	public String retirarFim() {
		if (inicio == null) {
			return null;
		}
		String out = fim.informacao;
		fim = fim.anterior;

		if(fim!= null) {
			fim.proximo = null;
		}else {
			inicio = null;
		}
		tamanho--;
		return out;
	}
	public String toString () {
		String imprimir = " " +tamanho + " ";
		No local = inicio;
		while (local != null) {
			imprimir += local.informacao +" ";
			local = local.proximo;		
		}
		return imprimir;
	}
	public static void main(String[] args) {
		ListaDupla l = new ListaDupla();
		System.out.println(l);
		
		for (int i = 0; i < 6; i++) {
			l.inserirInicio("" + (char)(i + 97));
			System.out.println(l);
			
		}

	}

}
