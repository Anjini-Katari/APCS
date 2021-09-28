public class Time{
	public static void main(String[] args){
		int hour = 16;
		int minute = 44;
		int second = 44;
		
		System.out.print("Number of seconds since midnight is: ");
		System.out.println(hour * 3600 + minute * 60 + second);
		System.out.print("Number of seconds remaining in the day: ");
		System.out.println((24 - hour) * 3600 + (60 - minute) * 60 + second);
		System.out.print("Percentage of the day that passed: ");		
		System.out.println((hour * 3600 + minute * 60 + second) * 100 / 86400);
		int helper = hour * 3600 + minute * 60 + second;
		hour = 17;
		minute = 6;
		second = 38;
		System.out.print("Time Elapsed in seconds: ");
		System.out.println((hour * 3600 + minute * 60 + second) - helper);

	}
}
