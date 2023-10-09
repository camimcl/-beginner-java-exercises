import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.println("Quantas linhas vai ter a matriz? ");
        x=scan.nextInt();
        System.out.println("Quantas colunas vai ter a matriz? ");
        y=scan.nextInt();

        int[][] mat = new int[x][y]; // x=linhas y=colunas
        /*
        tem que criar um for para percorrer as linhas
        e para cada linha, necessita-se de um for para
        percorrer as colunas.
        */

        for (int i = 0; i < x;i++){   //percorrer as linhas
            for (int j =0 ; j < y; j++){ //percorrer as colunas
                System.out.print("Elemento ["+i+ "," +j+ "]: ");  //i e j pq eles sao os indices das linhas e colunas da matriz.
                mat[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriz digitada:");
        for (int i= 0; i<x; i++){
          for (int j= 0 ; j<y; j++){
              System.out.print(mat[i][j] + " "); //espaco em branco pra ter espaco entre os elementos
          }
            System.out.println();
        }
    }
}
//matrizes 3d
