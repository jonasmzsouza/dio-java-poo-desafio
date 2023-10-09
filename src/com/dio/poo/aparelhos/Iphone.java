package com.dio.poo.aparelhos;

import com.dio.poo.aplicativos.NavegadorInternet;
import com.dio.poo.aplicativos.ReprodutorMusical;
import com.dio.poo.aplicativos.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página...");
	}

	@Override
	public void fecharPagina() {
		System.out.println("Fechando página...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");

	}

	@Override
	public void favoritarPagina() {
		System.out.println("Favoritando página..");
	}

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando música...");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}

	@Override
	public void avancarFaixa() {
		System.out.println("Avançando para próxima faixa...");
	}

	@Override
	public void retrocederFaixa() {
		System.out.println("Retrocedendo para a faixa anterior...");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume...");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume...");
	}

	@Override
	public void realizarChamada() {
		System.out.println("Realizando chamada...");
	}

	@Override
	public void atenderChamada() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void rejeitarChamada() {
		System.out.println("Rejeitando chamada...");
	}

	@Override
	public void encerrarChamada() {
		System.out.println("Encerrando chamada...");
	}

	@Override
	public void chamadaEmEspera() {
		System.out.println("Chamada em espera...");
	}

	@Override
	public void conferenciaDeChamadas() {
		System.out.println("Conferência de chamadas...");
	}

	@Override
	public void ativarVivaVoz() {
		System.out.println("Ativando viva-voz...");
	}

	@Override
	public void desativarVivaVoz() {
		System.out.println("Desativando viva-voz...");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	public void ligar() {
		System.out.println("Ligando telefone...");
	}

	public void desligar() {
		System.out.println("Desligando telefone...");
	}

	public void deslizarParaDesbloquear() {
		System.out.println("Deslizando para desbloquear...");
	}

	public void navegarParaTelaInicial() {
		System.out.println("Navegando para a tela inicial...");
	}

}
