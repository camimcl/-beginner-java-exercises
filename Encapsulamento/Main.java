package aula12;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.maisVolume();
        controleRemoto.pause();
        controleRemoto.ligarMudo();
        controleRemoto.abrirMenu();
    }
}
