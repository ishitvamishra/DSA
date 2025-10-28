public class reverse {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        ReverseArray r= new ReverseArray();
        r.reverse(arr);
    }
}

class ReverseArray{

    void reverse(int arr[]){
        System.out.print("Original array: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.print("Reveresed Array: ");
        for(int i=5;i>0;i--){
            System.out.print(arr[i-1]+" ");
        }
    }
}
