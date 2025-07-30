//time complexity = O(n)
public class sorted {
    public static boolean sort(int arr[], int index){
        
        if (index == (arr.length-1)) {
            return true;
        }

        if (arr[index] >= arr[index+1]) {
            //array is unsorted
            return false;
        }
        return sort(arr, index+1);
    }
    public static void main(String[] args){
        int arr[] = {4,2,3};
        System.out.println(sort(arr, 0));
    }
}
