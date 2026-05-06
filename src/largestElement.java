public class largestElement {
    public static void main(String[] args){
        findLargest(new int[]{2,8,10,7,6});

    }

    public static void findLargest(int arr[]){
        int largest = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
