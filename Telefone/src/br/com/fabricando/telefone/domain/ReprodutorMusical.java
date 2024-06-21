package br.com.fabricando.telefone.domain;

public interface ReprodutorMusical {
    public void tocar();

    public void pausar();

    public void selecionarMusica();

    public void conectarInternet(boolean internet);
}