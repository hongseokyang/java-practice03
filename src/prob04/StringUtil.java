package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
    	StringBuffer result = new StringBuffer();
    	for (String string : str) {
			result.append(string);
		}
    	 
    	return result.toString();
    }
}

