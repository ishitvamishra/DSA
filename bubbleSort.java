public class bubbleSort {
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){        //for number of turns
            for(int j=0;j<n-1-i;j++){  //for travering the array
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }

    public static void main(String args[]){
        int arr[]={5,4,8,2,1,3,9};
        BubbleSort(arr);
        print(arr);
    }
}
