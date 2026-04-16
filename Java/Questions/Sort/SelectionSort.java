
public class SelectionSort {
    public static void main(String[] args) {
        
        int arr[] = {3,0,-1,5,9,-3,2,1};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minInd = i;
            for(int j=i; j<n; j++){
                if(arr[minInd] > arr[j]){
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" "); 
        }
    }

}