public class RecursionDemoTester {
    public static void main(String[] args) {
                
        int[] nums = {25, 42, 31, 64, 80, 92, 13, 103, 75, 9, 51, 87};
        
        RecursionDemo rec = new RecursionDemo();
        
        System.out.print("Initial ");
        rec.printAry(nums);
        System.out.println("");
        
        int total = rec.sum(nums, 0);
        System.out.println("total: " + total);
        System.out.println("");
        
        
        rec.mergeSort(nums, nums.length);
        System.out.print("Sorted ");
        rec.printAry(nums);
        System.out.println("");
        
        System.out.println("Search for 80 - index:  " + rec.recBinarySearch(nums, 80, 0, nums.length - 1));
        System.out.println("Search for 3 - index:  " + rec.recBinarySearch(nums, 3, 0, nums.length - 1));
    }
}
