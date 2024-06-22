# iPhone Simulator Project

Este projeto simula funcionalidades básicas de um iPhone, implementado em Java. A classe `Iphone` implementa as interfaces `AparelhoTelefonico`, `NavegadorInternet` e `ReprodutorMusical`, proporcionando uma experiência interativa que inclui operações de telefone, navegação na internet e reprodução de música. Para compreender melhor assista ao vídeo de lançamento do iPhone para entender as funcionalidades principais.       

## Funcionalidades

### Aparelho Telefônico
- **Ligar para um número**: Permite discar e ligar para um número de telefone especificado.
- **Atender uma chamada**: Oferece a opção de atender ou recusar uma chamada telefônica.
- **Iniciar correio de voz**: Inicia o serviço de correio de voz, simulando a recepção de mensagens.

### Navegador de Internet
- **Exibir uma página da web**: Solicita a entrada de uma URL e exibe o conteúdo da página web correspondente.
- **Adicionar uma nova aba**: Simula a abertura de uma nova aba no navegador para navegação simultânea.
- **Atualizar a página atual**: Atualiza a página web atualmente exibida no navegador.

### Reprodutor Musical
- **Tocar música**: Inicia a reprodução da primeira música da playlist, se disponível.
- **Pausar música**: Interrompe a reprodução da música atualmente em execução.
- **Selecionar uma música da playlist**: Permite selecionar e reproduzir uma música específica da playlist.

## Estrutura do Código

### Interfaces

#### AparelhoTelefonico
```java
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}
```

#### NavegadorInternet
```java
public interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}
```
#### ReprodutorMusical
```java
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

```

- **Iphone**: implementa as interfaces AparelhoTelefonico, NavegadorInternet e ReprodutorMusical, fornecendo métodos concretos para cada funcionalidade descrita. Veja através dessa UML:
  
![UML Iphone](https://github.com/Vntts/Telefone/assets/145812111/deb23e4c-a814-4a71-bf2b-30e7424921d4)



