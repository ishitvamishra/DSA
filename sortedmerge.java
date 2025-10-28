// public class sortedmerge{
//     public static void merge(int numbers1[], int numbers2[]){
//         for(int i=0;i<numbers2.length;i++){
//             for(int j=0;j<numbers1.length;j++){
//                 if(numbers2[i]>=numbers1[j]){
//                     for(int k=numbers1.length-1;k>j+1;k--){
//                         numbers1[k]=numbers1[k-1];
//                     }
//                     numbers1[j+1]=numbers2[i];
//                 }
//             }
            
//         }
//         for(int i=0;i<numbers1.length;i++){
//             System.out.println(numbers1[i]);
//         }
        
//     }
//     public static void main(String args[]){
//         int numbers1[]={1,2,3,4,5};
//         int numbers2[]={2,7,8,9,10};
//         merge(numbers1,numbers2);
//     }
// }