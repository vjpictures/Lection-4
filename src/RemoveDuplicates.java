import java.util.Arrays;
public class RemoveDuplicates {
    private static void removeDuplicates(int[] arrayWithDuplicates) {
        System.out.println("Original Array:");

        for (int arrayWithDuplicate : arrayWithDuplicates) {
            System.out.print(arrayWithDuplicate + " ");
        }
        int noOfUniqueElements = arrayWithDuplicates.length;

        for (int i = 0; i < noOfUniqueElements; i++) {
            for (int j = i+1; j < noOfUniqueElements; j++) {

                if(arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
        System.out.println();
        System.out.println("Array after removing duplicates:");
        for (int arrayWithoutDuplicate : arrayWithoutDuplicates) {
            System.out.print(arrayWithoutDuplicate + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        removeDuplicates(new int[] {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5});
    }
}

