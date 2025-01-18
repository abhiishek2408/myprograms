class SortArrayTwoPointer {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squaredNumbers = new int[n];
        
        int left = 0;
        int right = n - 1; 
        int index = n - 1;
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                squaredNumbers[index] = leftSquare;
                left++;
            } else {
                squaredNumbers[index] = rightSquare;
                right--;
            }
            index--;
        }
        
        return squaredNumbers;
    }

 
 
 
    public static void main(String[] var0) {
       int[] var1 = new int[]{2, 6, 7, 4, 5};
       System.out.println("Original Array:");

       SortArrayTwoPointer obj = new SortArrayTwoPointer();

       for (int i : obj.sortedSquares(var1)) {
        System.out.print(i+" ");
       }

      }
 
       
       
    
 
 }