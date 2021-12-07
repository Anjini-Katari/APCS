/***
 * Clyde "Thluffy" Sinclair
 * APCS
 * HW31 --
 * 2021-11-04r
 * time spent: _hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class sidePig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
    public static boolean hasA( String w, String letter ) {
        String chr= "a";
        int higher = 1, lower = 0, counter = 0;
        if (w != null && letter.length() == 1) {
            while (counter <= w.length()) {
                if (chr.equals(w.substring(0, 1))) {
                    return true;
                }
                else {
                    higher =+ 1;
                    lower += 1;
                }
            }
            return false;
        }
        return true;
    }//end hasA()

    public static void main( String[] args ) {
        System.out.println(hasA("cat", "a"));
        System.out.println(hasA("cat", "o"));
    }//end main()

}//end class Pig