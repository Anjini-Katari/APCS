//Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
	int counter = 0, lower = 0, higher = 1, len = str.length();
	String fin = "";

	while (counter <= len && higher <= len) {
		if (str == "") {
			return str;
		}
		else {
			fin += str.substring(lower, higher);
			fin += str.substring(lower, higher);
			lower += 1;
			higher += 1;
			counter += 1;
		}
	}
	return fin;
}
