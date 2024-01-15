import java.util.Arrays;
public class Merge {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int [a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;

        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8, 10 };

        int[] bottomLine = merge(a, b);
        System.out.println("Merged Ordered Array:");
        System.out.println(Arrays.toString(bottomLine));
    }
}
