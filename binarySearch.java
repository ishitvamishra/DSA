public class binarySearch {
    public static int BinarySearch(int numbers[],int key){
        int start=0 , end= numbers.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(numbers[mid]== key){
                return mid;
            }
            if (numbers[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,3,4,5,6,7,10,11,18,26};
        int key=16;

        int index=BinarySearch(numbers,key);
        System.out.println("Index is at: "+index);

    }
}
