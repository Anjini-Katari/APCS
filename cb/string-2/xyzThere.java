public class xyzThere {
//Return true if the given string contains an appearance of "xyz" where the xyz 
//is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not

    public static boolean xyzThere(String str) {
        int lower = 1, higher = 4, len = str.length();
        String var = "xyz";
        
        if (len < 3) {
            return false;
          }

        if (str.substring(0, 3).equals(var)) {
            return true;
        }

        while (higher <= len) {
            String subStr = str.substring(lower, higher);
            System.out.println(subStr);
            if (subStr.equals(var)) { //
                String pd = str.substring((lower - 1), lower);
                System.out.println(pd);
                if (pd.equals(".")) {
                    return false;
                }
                else {
                    return true;
                }
            }
            higher += 1;
            lower += 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
		System.out.println(xyzThere("abc.xyz"));
    	System.out.println(xyzThere("xyz.abc"));

    }
}