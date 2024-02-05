public class lastOcc {

    public static int lastoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccurance(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println(lastoccurance(arr, key, 0));

    }

}
