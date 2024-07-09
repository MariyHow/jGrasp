public class BubbleSort {
    
    public static void main(String[] args) {
        
        String[] names = {"Zack", "Billy", "Autumn", "James", "Imani", "Judy", "Peter"};
        
        System.out.println("Original array:");
        printArray(names);
        
        bubbleSort(names);
        
        System.out.println("Sorted array:");
        printArray(names);
        
    }
    
    public static void bubbleSort(String[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}