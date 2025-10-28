public class maxminsums {
    public static void printSubarrays(int numbers[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            
            for(int j=i+1;j<numbers.length;j++){
                int sum=0;
                System.out.print("Sum of ");
                for(int k=i;k<=j;k++){
                    sum=sum+numbers[k];
                    System.out.print(numbers[k] + " ");
                    
                }
                System.out.println("is "+sum);
                if(max<sum){
                    max=sum;
                }
                
            }
            System.out.println();
        }
        System.out.println("max sum ="+ max);
    }
    public static void main(String args[]){
        int numbers[]={2,3,4,5};
        printSubarrays(numbers);
    }
}
