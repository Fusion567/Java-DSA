//divide & conquor approach
//Recursion
//Time Complexity: nxlog(n)
class merge_sort{

    public static void conquor(int[] arr, int si,  int mid, int ei) {
         //O(n)
        int merged[] =  new int [ei-si+1];
         
         int index1 = si;     //for first half
         int index2 = mid+1;  //for second half
         
         int k = 0;            //for merged array

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1]<=arr[index2]) {
                merged[k++] = arr[index1++] ;
            }else{
                merged[k++] = arr[index2++] ;
            }
        }

        while (index1 <= mid){
            merged[k++] = arr[index1++] ;
        }

        while (index2 <= ei){
            merged[k++] = arr[index2++] ;
        }

        for (int i = 0,j=si; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }

    }
    public static void divide(int arr[], int si, int ei){
        //Olog(n)
        if(si >= ei){
            return;
        } 

           int mid = si+(ei-si)/2;
           divide(arr, si, mid);
           divide(arr, mid+1, ei);
           conquor(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n =  arr.length;
        divide(arr, 0, n-1);
        
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}