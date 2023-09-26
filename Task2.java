public class Task2 {

    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] RemoveEven(int arr[]){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;

            }
        }
        int[] result=new int[oddCount];
        int indx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[indx]=arr[i];
                indx++;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,10,6,3};
        printArray(arr);
        int[] result=RemoveEven(arr);
        printArray(result);

    }

}
