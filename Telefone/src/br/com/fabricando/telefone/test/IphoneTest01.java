package br.com.fabricando.telefone.test;

import br.com.fabricando.telefone.domain.Iphone;

public class IphoneTest01 {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testar telefone
        meuIphone.ligar("");
        meuIphone.atender();
        meuIphone.IniciarCorreioVoz();

        // Testar navegador de internet
        meuIphone.exibirPagina("");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Testar reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();
    }
}
