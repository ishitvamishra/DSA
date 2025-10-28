public class smallest {
    public static int getSmallest(int numbers[]){
        int Smallest= Integer.MAX_VALUE; //+infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<Smallest){
                Smallest=numbers[i];
            }
        }
        return Smallest;
    }

    public static void main(String args[]){
        int numbers[]={2,3,4,5,6,7,8,9};
        System.out.println("Smallest number is: "+getSmallest(numbers));
    }
}
