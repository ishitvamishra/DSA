public class linearSearch2 {
    public static int ls2(String cities[], String key){

        for(int i=0;i<cities.length;i++){
            if(cities[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String cities[]={"Kolkata","Nagpur","Lucknow","Kanpur"};
        String key="Kanpur";

        int index=ls2(cities,key);
        if(index== -1){
            System.out.println("Index not found");
        }
        else{
            System.out.println("Index is at: "+index);
        }
    }
}
