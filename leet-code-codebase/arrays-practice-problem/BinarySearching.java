import java.util.Arrays;

public class BinarySearching{
    public static void main(String[] args) {
        int arr[]={2,5,1,6,9,0,17};
        int target=9;
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("not found");
    }
}
