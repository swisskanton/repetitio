import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        ArrayMethods am = new ArrayMethods();

        System.out.println(Arrays.toString(am.add(new int[] {1,2,0,4,5}, 3)).equals("[1, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(am.add(new int[] {1,0,0,4,5}, 3)).equals("[1, 3, 0, 4, 5]"));
        System.out.println(Arrays.toString(am.add(new int[] {}, 3)).equals("[3]"));
        System.out.println(Arrays.toString(am.add(new int[] {1,2,3,4,5}, 6)).equals("[1, 2, 3, 4, 5, 6]"));
        System.out.println(Arrays.toString(am.addByIndex(new int[] {1,2,3,4,5}, 0, 6)).equals("[6, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(am.addByIndex(new int[] {1,2,3,4,5}, 2, 6)).equals("[1, 2, 6, 4, 5]"));
        System.out.println(Arrays.toString(am.addByIndex(new int[] {1,2,3,4,5}, 6, 6)).equals("[1, 2, 3, 4, 5, 6]"));
        System.out.println(Arrays.toString(am.remove(new int[] {1,2,3,2,1}, 5)).equals("[1, 2, 3, 2, 1]"));
        System.out.println(Arrays.toString(am.remove(new int[] {1,2,3,2,1}, 2)).equals("[1, 3, 2, 1]"));
        System.out.println(Arrays.toString(am.remove(new int[] {1,2,3,2,1}, 3)).equals("[1, 2, 2, 1]"));
        System.out.println(Arrays.toString(am.removeByIndex(new int[] {1,2,3,4,5}, 5)).equals("[1, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(am.removeByIndex(new int[] {1,2,3,4,5}, 3)).equals("[1, 2, 3, 5]"));
        System.out.println(Arrays.toString(am.removeByIndex(new int[] {1,2,3,4,5,6,7,8}, 3)).equals("[1, 2, 3, 5, 6, 7, 8]"));
        System.out.println(Arrays.toString(am.removeByIndex(new int[] {1,2,3,4,5,6,7,8}, 7)).equals("[1, 2, 3, 4, 5, 6, 7]"));
        System.out.println(Arrays.toString(am.removeByIndex(new int[] {}, 5)).equals("[]"));
    }

    public int[] add(int[] arr, int num) {
        boolean isAdded = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = num;
                isAdded = true;
                break;
            }
        }
        if (!isAdded) {
            int[] result = Arrays.copyOf(arr, arr.length + 1);
            result[arr.length] = num;
            arr = result;
        }
        return arr;
    }

    public int[] addByIndex(int[] arr, int index, int num) {
        if (arr.length > index) {
            arr[index] = num;
        } else {
            arr = this.add(arr, num);
        }
        return arr;
    }

    public int[] remove(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arr = this.removeByIndex(arr, i);
                break;
            }
        }
        return arr;
    }

    public int[] removeByIndex(int[] arr, int index) {
        if (arr.length > index) {
            int[] result = new int[arr.length - 1];
            System.arraycopy(arr, 0, result, 0, index);
            System.arraycopy(arr, index+1, result, index, result.length - index);
            arr = result;
        }
        return arr;
    }
}
