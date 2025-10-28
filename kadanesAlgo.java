public class kadanesAlgo {

    public static void sum(int s1, int s2){
        int sum=s1+s2;
        System.out.println(sum);
    }

    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int c=0;
        for(int j=0;j<numbers.length;j++){
            if(numbers[j]<0){
                c++;
            }
        }
        if(c==numbers.length){
            for(int k=0;k<numbers.length;k++){

                if(numbers[k]>ms){
                    ms=numbers[k];
                }
            }
            System.out.println("our max subarray sum is :"+ms);
        }
        else{

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our max subarray sum is : "+ ms);
        }
    }
    public static void main(String args[]){
        int numbers[]={-2,-3};
        kadanes(numbers);
    }
}

