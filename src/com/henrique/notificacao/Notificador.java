package com.henrique.notificacao;

import com.henrique.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String menssagem);
	
}
