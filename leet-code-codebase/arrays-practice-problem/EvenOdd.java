import java.util.Arrays;

public class EvenOdd{
    public static void main(String[] args) {
        int arr[]={2,8,-1,7,-3,-6};
        int pos=0,neg=1;
        int res[]=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0){
                res[pos]=arr[i];
                pos+=2;
            }else{
                res[neg]=arr[i];
                neg+=2;
            }

        }
        System.out.println(Arrays.toString(res));
    }
}
