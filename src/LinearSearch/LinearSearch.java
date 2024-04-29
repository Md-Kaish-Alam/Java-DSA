package LinearSearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static boolean linearSearchInString(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }

    public static boolean linearSearchInRange(int[] arr, int target, int startIndex, int endIndex) {

        for (int i = startIndex; i <= endIndex; i++) {
            if (target == arr[i]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // linear search in Integer Array
        int[] data = {3, 10, 2, 40, 20};
        int keyToFind = 40;
        int result = linearSearch(data, keyToFind);
        if(result == -1) {
            System.out.println(keyToFind + " is not found in the array.");
        } else {
            System.out.println(keyToFind + " is found at index: " + result);
        }

        // linear search in String or charArray
        String name = "Hello World";
        char target = 'e';

        System.out.println(linearSearchInString(name, target));

        // linear search in range
        int[] arr = {10, 40, 36, 67, 89, 62, 54, 90, 78, 56};
        int startIndex = 2, endIndex = 7;

        System.out.println(linearSearchInRange(arr, 54, startIndex, endIndex));
    }
}
