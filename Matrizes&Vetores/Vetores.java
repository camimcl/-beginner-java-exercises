import java.util.Scanner;
public class Vetores {
    public static void main(String[] args) {
        //vetores
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar ?");
        int N = scan.nextInt();         //N EH QUANTOS NUMEROS SERAO DIGITADOS
        double[] vet = new double[N];   // LOGO NA DECLARACAO DO VETOR, COLOCASSE
        // QUANTOS NUMEROS SERAO DIGITADOS, OU SEJA "N" EH A QUANTIDADE DE CAIXINHAS NA MEMORIA DO VETOR.

        //PARA PERCORRER AS POSICOES DO VETOR E PEDIR AO USUARIO PARA PREENCHER.
        for (int i=0; i<N;i++){ // a variavel i comeca com 0 e vai incrementando de 1 em 1 enquanto ela for menor que n
            System.out.print("digite um numero: ");
            vet[i] = scan.nextDouble();
        }
        //para percorrer todos as posicoes do vetor e printar na tela os elementos do vetor em cada posicao
        System.out.println();
        System.out.println("Numeros digitados:");
        for (int i= 0 ; i< N;i++){
            System.out.printf("%.1f%n",vet[i]);
        }
}}
