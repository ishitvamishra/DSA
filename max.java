public class max {

    public static void maximum(int arr[],int k){
        int x=arr.length-k+1;
        int y=0;

        for(int i=0;i< x;i++){
            int max=Integer.MIN_VALUE;
            for(int j=y;j<k;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
            y++;
            k++;
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        maximum(arr,k);
    }
}
