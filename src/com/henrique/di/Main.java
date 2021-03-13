package com.henrique.di;

import com.henrique.Cliente;
import com.henrique.notificacao.Notificador;
import com.henrique.notificacao.NotificadorSMS;
import com.henrique.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente henrique = new Cliente("henrique","henrique@gmail.com","6544654");
		Cliente pedro = new Cliente("pedro","pedro@gmail.com","654546");
			
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(henrique);
		ativacaoCliente.ativar(pedro);
	}
	
}
