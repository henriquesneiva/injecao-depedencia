package com.henrique.service;

import com.henrique.Cliente;
import com.henrique.Produto;
import com.henrique.notificacao.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO enviar a nota fiscal aqui ...
		
		this.notificador.notificar(cliente, "nota fiscal do produto " + produto.getNome() + "foi emitida");
		
	}
	
}
