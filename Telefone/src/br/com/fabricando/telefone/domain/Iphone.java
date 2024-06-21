package br.com.fabricando.telefone.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private Scanner scanner;
    private List<String> historicoPaginas;
    private List<String> playlist;
    private boolean musicaTocando;

    public Iphone() {
        this.scanner = new Scanner(System.in);
        this.historicoPaginas = new ArrayList<>();
        this.playlist = new ArrayList<>();
        this.musicaTocando = false;

        // Adicionando algumas músicas à playlist para demonstração
        playlist.add("MELTDOWN (feat. Drake) - TRAVIS SCOTT");
        playlist.add("BILLIE JEAN - MICHAEL JACKSON");
        playlist.add("BEAUTIFUL - EMINEM");
    }

    @Override
    public void ligar(String numero) {
        System.out.print("Digite o Número Que Deseja Ligar: ");
        numero = scanner.nextLine();
        System.out.println("Ligando Para " + numero);
    }

    @Override
    public void atender() {
        System.out.print("Digite 1 Para Atender ou 2 Para Recusar Ligação: ");
        int recebendoScanner2 = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha pendente
        if (recebendoScanner2 == 1) {
            System.out.println("Atendendo Ligação");
        } else if (recebendoScanner2 == 2) {
            System.out.println("Recusando Ligação");
        } else {
            System.out.println("Digite um número válido!");
        }
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando Correio De Voz...");
        System.out.println("Você tem 3 mensagens novas.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.print("Digite o URL da página que deseja visitar: ");
        url = scanner.nextLine();
        historicoPaginas.add(url);
        System.out.println("Exibindo Página da Web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta no navegador.");
    }

    @Override
    public void atualizarPagina() {
        if (historicoPaginas.isEmpty()) {
            System.out.println("Nenhuma página para atualizar.");
        } else {
            String url = historicoPaginas.get(historicoPaginas.size() - 1);
            System.out.println("Atualizando Página da Web: " + url);
        }
    }

    @Override
    public void tocar() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist está vazia. Adicione músicas primeiro.");
        } else if (!musicaTocando) {
            System.out.println("Reproduzindo: " + playlist.get(0));
            musicaTocando = true;
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            System.out.println("Pausando música.");
            musicaTocando = false;
        } else {
            System.out.println("Nenhuma música está tocando no momento.");
        }
    }

    @Override
    public void selecionarMusica() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist está vazia. Adicione músicas primeiro.");
        } else {
            System.out.println("Selecione a música pelo número:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha pendente
            if (escolha > 0 && escolha <= playlist.size()) {
                System.out.println("Reproduzindo: " + playlist.get(escolha - 1));
                musicaTocando = true;
            } else {
                System.out.println("Escolha inválida.");
            }
        }
    }

    @Override
    public void conectarInternet(boolean internet) {
        System.out.println("Conectando Internet.");
    }
}
