package aula12;


public class ControleRemoto implements Controlador{
    //atributos
    private boolean ligado;
    private boolean tocando;
    private int volume;
    //construtor
    public ControleRemoto(){
        this.ligado = false;
        this.tocando = false;
        this.volume = 50;
    }
    //metodos especiais
    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }
    //metodos implementados
    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()!=0){
            this.setVolume(0);
        }
        else {
            System.out.println("Não consigo ativar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void ligar() {
        if (!this.isLigado()){ //!falso
            setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(this.isLigado()){
            setLigado(false);
        }
        else{
            System.out.println("Já está desligado");
        }
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.println("---MENU---");
            System.out.println("-STATUS-\nLigado :"+this.isLigado()+"\nVolume: "+this.getVolume()+"\nTocando :"+this.isTocando());
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()){
            System.out.println("Ok,fechando menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() && getVolume()!=100){
            this.setVolume(this.getVolume()+5);
        }
        else {
            System.out.println("Não consigo aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(getVolume()-5);
        }
        else {
            System.out.println("Não consigo diminuir o volume");
        }
    }

    @Override
    public void play() {
        if (this.isLigado()&& !this.isTocando()){
            setTocando(true);
        }
        else{
            System.out.println("Não pude dar play");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            setTocando(false);
        }

    }
}
