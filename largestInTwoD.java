import java.util.*;

public class largestInTwoD {

    public static void largest(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j =0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element is: "+max);
    }

    public static void smallest(int matrix[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j =0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Smallest Element is: "+min);
    }
    
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n=matrix.length , m=matrix[0].length; 

        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        largest(matrix);
        smallest(matrix);
    }
}
