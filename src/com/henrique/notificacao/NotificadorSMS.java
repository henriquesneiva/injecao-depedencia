package com.henrique.notificacao;

import com.henrique.Cliente;

public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente , String menssagem) {
		System.out.printf("notificando %s por sms atraves do telefone: %s\n ",cliente.getNome(),cliente.getTelefone(), menssagem);
}
	
}
