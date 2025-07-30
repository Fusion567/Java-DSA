//Pivot & Partition  approach
/*Choose a Pivot Element:
  Select an element from the array as the pivot. Common strategies include:
  First element, Last element, Random element, Median of three elements*/
//Recursion
//Time Complexity: Worst Case: O(n^2),Average Case:O(nxlogn)
//Worst case occurs when pivot is always the smallest or the largest element.
public class quick_sort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
             }
            }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int [] arr, int low, int high) {
        if(low<high){
            //piv_idx = pivot_index
            int piv_idx = partition(arr, low, high);
            //Recursion
            quickSort(arr, low, piv_idx-1);
            quickSort(arr, piv_idx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
