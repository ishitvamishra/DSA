public class printSpiral {

    public static void printspiral(int matrix[][]){
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        while(sr<=er && sc <= ec){
            //top, coloum is variable and row is constant
            for(int j=sc;j<=ec;j++){
                System.out.print(matrix[sr][j]+ " ");
            }

            //right, starts from sr+1 and row is variable and coloum is constant
            for(int i=sr+1;i<=er;i++){
                System.out.print(matrix[i][ec]+ " ");
            }

            //bottom, starts from ec-1 and coloum is variable and row is constant
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(matrix[er][j]+ " ");
            }

            //left, starts from er-1 and coloum is constant and row is variable
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(matrix[i][sc]+ " ");
            }

            sc++;
            sr++;
            ec--;
            er--; 
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        printspiral(matrix);
    }
    
}
