/**
Write class Commafier, with 2 static methods as listed below. 
Each method takes a non-negative integer input and returns the number as a 
String with commas inserted appropriately.

String commafyR(int)
String commafyF(int)

Make explicit calls as shown below in your main() method to verify functionality. 
Once verified, proceed.

Comment out the method calls from the last step, then use a FOREACH loop in your 
main method to process each number passed in via command line.
**/

public class hw29Commafier {
    public static String commafyF(int n) {
        String fin = "", str = Integer.toString(n);
        int len = str.length(), remainder = len % 3;
        int beg = 0, end = remainder;
    
    /**

        System.out.println(str);
        System.out.println(remainder);
        System.out.println(len);
        System.out.println(beg);
        System.out.println(end);
    **/ 
        if (n < 1000) {
            return str;
        }
        while (end <= len) {
            fin += str.substring(beg, end);
            System.out.println(fin);
            if (end < len) {
                fin += ",";
            }
            beg = end;
            end += 3;
            
        }
        return fin;

    }

    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(commafyF(Integer.parseInt(s)));
        }
    }


}