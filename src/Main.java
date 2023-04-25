public class Main {
    public static void main(String[] args) {
        int arr[]={45,23,43,31,21};
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int maxVal=arr[0];
        for (int j : arr) {
            if (j > maxVal) {
                maxVal = j;
            }
        }
        return maxVal;

    }
}