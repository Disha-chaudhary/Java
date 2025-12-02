public class movezerostoend {
    public static void moverzeros(int arr[]) {
        int nonzeropos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonzeropos] = arr[i];
                nonzeropos++;
            }
        }
        while (nonzeropos < arr.length) {
            arr[nonzeropos] = 0;
            nonzeropos++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 4, 3, 0, 5, 0, 1};
        moverzeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}