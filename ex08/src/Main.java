import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Incrementação de Matriz

        Scanner sc = new Scanner(System.in);
        System.out.print("Input vertical matrix: ");
        int n = sc.nextInt();

        System.out.print("Input Horizontal matrix: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                mat[i][j] = (int)(Math.random() * 10) + 1;
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.print("\nInput: ");
        int a = sc.nextInt();

        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == a) {
                    System.out.print("Position: " + i + "," + j + "\n");
                    if(j-1!=-1) {
                        System.out.print("Left: "+mat[i][j - 1]+"\n");
                    }
                    if(j+1!=-1){
                        System.out.print("Right: "+mat[i][j + 1]+"\n");
                    }
                    if(i-1!=-1){
                        System.out.print("Up: "+mat[i-1][j]+"\n");
                    }
                    if(i+1!=-1){
                        System.out.print("Down: "+mat[i+1][j]+"\n");
                    }
                    System.out.print("");
                }
            }
        }
    }
}
