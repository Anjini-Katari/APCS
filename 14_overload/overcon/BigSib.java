public class BigSib {
	//String helloMsg;

        public BigSib(String x) {
                helloMsg = x;
        }
	
	public String helloMsg;

        public String greet(String y) {
                return helloMsg + " " + y;
        }
}
