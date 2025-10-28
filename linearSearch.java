public class linearSearch {
    public static int LinearSearch(int numbers[], int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={2,3,4,5,6,7,10,11,18,26};
        int key=6;

        int index = LinearSearch(numbers,key);
        if(index== -1){
            System.out.println("Index not found");
        }
        else{
            System.out.println("Index is at: "+ index);
        }
    }
}
