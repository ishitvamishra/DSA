public class prefixApproach {
    public static void printSubarrays(int numbers[]){
        int max=Integer.MIN_VALUE;
        int prefix []=new int [numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;

                sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1]; //j is end and i is start
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
