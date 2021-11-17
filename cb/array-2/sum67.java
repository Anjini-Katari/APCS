public class sum67 {
    public static int sum67(int[] nums) {
        int alength = nums.length;
        int result = 0; 
        int sixpos = 0; 
        int sevenpos = 0; 
        for (int i = 0; i < alength; i++) {
          if (nums[i] != 6) {
            System.out.println("val of i: " + i);
            result += nums[i];
            System.out.println("val of result: " + result);
          }
          else {
            sixpos = i; 
            for (int h = sixpos; h < alength && sevenpos != h; h++) {
              if (nums[h] == 7) {
                sevenpos = h;
                System.out.println("val of h: " + h);
                System.out.println("val of sevenpos: " + sevenpos); 
              } 
            }
            i = sevenpos; 
          }
        }
        System.out.println("val of i: " + i);
        return result;
      }

    public static void main(String[] args) {
        //int[] array = {1, 2, 2};
        int[] array = {1, 6, 7, 7};
        System.out.println(sum67(array));
    }
}