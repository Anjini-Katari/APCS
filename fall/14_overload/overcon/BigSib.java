/** 
Joseph, Kosta, and Anjini: Featuring Duckie Po, Duckie Davie and Duckie Watson
APCS
HW14 -- Customize Your Creation
2021-10-08
*/

/**
DISCO:
 * Order only matters in some cases

QCC:
 * Still confused on what effect static has on methods...
*/

public class BigSib {

        public BigSib(String x) {
                helloMsg = x;
        }
	
	public String helloMsg;

        public String greet(String y) {
                return helloMsg + " " + y;
        }
}
