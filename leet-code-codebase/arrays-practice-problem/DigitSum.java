public class DigitSum {
    public static void main(String[] args) {
        int arr[]={1234,5673,9855,9183};
        int sum=0;
        for(int i=0;i< arr.length;i++) {
            int num = arr[i];
            while (num > 0) {

                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println(sum);
    }
}
