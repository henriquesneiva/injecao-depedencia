package com.henrique.notificacao;

import com.henrique.Cliente;

public class NotificadorHemail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente , String menssagem) {
		System.out.printf("notificando %s atraves do e-mail %s: %s\n ",cliente.getNome(),cliente.getHemail(), menssagem);
}
	
}
