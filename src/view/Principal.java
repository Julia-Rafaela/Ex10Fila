package view;


import br.juliarafaela.FilaString.Fila;
import controller.OperacaoController;
import model.Cliente;

	public class Principal {
	    public static void main(String[] args) {
	    	
	        Fila f = new Fila();

	        // Inserir 20 clientes com suas características
	        for (int i = 1; i <= 20; i++) {
	            String nome = "Cliente" + i;
	            int quantidade = (int) (Math.random() * 31) + 20; // entre 20 e 50
	            double valor = (Math.random() * 96) + 5; // entre 5.00 e 100.00
	            Cliente model = new Cliente(nome, quantidade, valor);
	            f.insert(model);
	        }

	        OperacaoController operacaoController = new OperacaoController();
	        try {
				operacaoController.caixa(f);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
