public class Task1 {


    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"  ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] myArray =new  int[5];
        myArray[0]=5;
        myArray[1]=4;
        myArray[2]=7;
        myArray[3]=8;
        myArray[4]=6;
        myArray[2]=1;
        printArray(myArray);
    }
    public static void main(String[] args) {
        Task1 t=new Task1();
        t.arrayDemo();
    }
}
