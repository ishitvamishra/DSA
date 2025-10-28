public class selectionSort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;  //assuming current element at i is minimum
            for(int j=i+1;j<arr.length;j++){    //starting comparing from (i+1)th element
                if(arr[minPos]>arr[j]){         //checking if any other element smaller than current one is present then minPos becomes the position where that element is located                    minPos=j;
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }

    public static void main(String args[]){
        int arr[]={5,4,8,2,1,3,9};
        SelectionSort(arr);
        print(arr);
    }
}

