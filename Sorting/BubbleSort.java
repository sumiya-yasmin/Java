public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
