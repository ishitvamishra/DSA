public class ArraysCC{
    public static void update(int marks[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={99,98,99};
        int nonchangable=5;
        update(marks,nonchangable);// Since arrays are pass by reference thats why they get updated through calling functions as well
        System.out.println(nonchangable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}