public class RecursionDemo {

  public int sum(int[] ary, int index) {
        
        if (index == ary.length) {
            return 0;
        } else {
            return ary[index] + sum(ary, index + 1);
        }
    }
    
    // returns the index value of the target being searced for in ary
    // recursive implementation
    public int recBinarySearch(int[] ary, int target, int begin, int end) {
        
        if (begin > end) {          // alternate base case; target not found
            return -1;
        }
        
        int mid = (begin + end) / 2;
        
        if (target == ary[mid]) {
            return mid;                 // base case
        } 
        
        if (target < ary[mid]) {
            return recBinarySearch(ary, target, begin, mid - 1);
        }
        
        if (target > ary[mid]) {
            return recBinarySearch(ary, target, mid + 1, end);
        }
        
        return -1;              // alternate base case; should be unreachable
    }
    
    public void mergeSort(int[] current, int length) {
        
        if (length < 2) {           // base case - ary of size 1 or 0
            return;
        }
        
        int mid = length / 2;       // find the midpoint of the array for the split
        
        // create and build temp arrays for left & right side of list
        int[] left = new int[mid];  
        int[] right = new int[length - mid]; 
        
        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }
        
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }
        
        mergeSort(left, mid);       // recursive call on left side of array
        mergeSort(right, length - mid);   // recursive call on right side of array
        
        merge(current, left, right);    // call to helper method to reassemble
                                        // array in sorted order
    }

    // merge left and right arrays by comparing the first element of both arrays
    // and the smaller element is placed into the next available position in
    // current. When left and right become empty, the remaining elements of the
    // other are added to current.
    public void merge(int[] current, int[] left, int[] right) {
        
        int leftSize = left.length;
        int rightSize = right.length;
        
        int leftIndex = 0, rightIndex = 0, currentIndex = 0;
        
        while (leftIndex < leftSize & rightIndex < rightSize) {  // both lists have elements 
            if (left[leftIndex] <= right[rightIndex]) {          // comparing first element of each
                current[currentIndex] = left[leftIndex];         // left is smaller and added to current
                leftIndex++;
            } else {
                current[currentIndex] = right[rightIndex];      // right is smaller and added to curren
                rightIndex++;
            }
            currentIndex++;
        }
        
        while (leftIndex < leftSize) {       // adding remaining left elements, if any
            current[currentIndex] = left[leftIndex];
            leftIndex++;
            currentIndex++;
        }
        
        while (rightIndex < rightSize) {       // adding remaining right elements, if any
            current[currentIndex] = right[rightIndex];
            rightIndex++;
            currentIndex++;
        }
        
    }

    public void printAry(int[] ary) {
        System.out.print("Array: {");
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + ", ");
        }
        System.out.println("}");
    }
    
}
