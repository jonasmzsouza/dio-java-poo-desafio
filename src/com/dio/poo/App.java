package com.dio.poo;

import com.dio.poo.aparelhos.Iphone;

public class App {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();

		iphone.desligar();
		iphone.ligar();
		iphone.deslizarParaDesbloquear();
		iphone.navegarParaTelaInicial();

		iphone.reproduzirMusica();
		iphone.pausarMusica();
		iphone.selecionarMusica();
		iphone.avancarFaixa();
		iphone.retrocederFaixa();
		iphone.aumentarVolume();
		iphone.diminuirVolume();

		iphone.realizarChamada();
		iphone.atenderChamada();
		iphone.rejeitarChamada();
		iphone.encerrarChamada();
		iphone.chamadaEmEspera();
		iphone.conferenciaDeChamadas();
		iphone.ativarVivaVoz();
		iphone.desativarVivaVoz();
		iphone.iniciarCorreioDeVoz();

		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		iphone.favoritarPagina();
		iphone.fecharPagina();

	}

}
