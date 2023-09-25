import java.util.Scanner;

public class Array2DAddingMatrieces {
    public static void main(String args[]){
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        int arr2[][]=new int[rows][cols];
        int c[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
