public class SecondLargest {

    public static void main(String args[]){
        SecondLargest sl = new SecondLargest();
        sl.secondLargest(new int[]{2,8,4,7,6});
    }

    public void secondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;//-1
                largest = arr[i];//2
            } else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);

       }
    }
}
