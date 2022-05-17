import java.util.Arrays;

public class Loopier {
    public static int LinSearch(int[] a, int target) {
        int len = a.length;
        for (int i = 0; i < len; i += 1) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int LinSearchR(int[] a, int target) {
        int len = a.length;
        for (int i = 0; i < len; i += 1) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\n");
        
        System.out.println("target is: " + target + "\nlength is: " + len);
        if (len >= 0) {
            if (a[len - 1] == target) {
                return len;
            }
            else {
                return LinSearchR((Arrays.copyOf(a, len - 1)), target);
            }
        }
            return -1;
    }
    
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 66, 5, 6, 7, 3};
      
        System.out.println("Iterative:");

        System.out.println("Should be 3: " + LinSearch(array, 4));
        System.out.println("Should be -1: " + LinSearch(array, 9));
        System.out.println("Should be 2: " + LinSearch(array, 3));

        System.out.println("Recursive:");

        //System.out.println("Should be -1: " + LinSearchR(array, 9));
        System.out.println("Should be 9: " + LinSearchR(array, 3));
        /*
        for (int i = 0; i < array.length; i += 1) {
            System.out.print(array[i] + ", ");
        }
        */
        System.out.println(LinSearchR(array, 66));
    }
}
