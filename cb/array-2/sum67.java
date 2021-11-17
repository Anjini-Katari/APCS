/*

Return the sum of the numbers in the array, except ignore sections 
of numbers starting with a 6 and extending to the next 7 (every 6 
will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
*/
public class sum67 {
    public static int sum67(int[] nums) {
        int alength = nums.length;
        int result = 0; 
        int sixpos = 0; 
        int sevenpos = 0; 
        for (int i = 0; i < alength; i++) {
          if (nums[i] != 6) {
            result += nums[i];
          }
          else {
            sixpos = i; 
            for (int h = sixpos; h < alength; h++) {
              if (nums[h] == 7) {
                sevenpos = h; 
              }
            }
            i = sevenpos; 
          }
        }
        return result;
      }      

    public static void main(String[] args) {
        //int[] array = {1, 2, 2};
        int[] array = {1, 6, 7, 7};
        System.out.println(sum67(array));
    }
}