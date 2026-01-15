public class RotateArray {
    public static void rotate(int arr[],int k){
        k=k% arr.length;
        revrese(arr,0,k-1);
        revrese(arr,k, arr.length-1);
        revrese(arr,0,arr.length-1);
    }
    public static void revrese(int arr[],int i,int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        int k=2;
      rotate(arr,k);
      for(int x:arr){
          System.out.print(x+" ");
      }
    }
}
