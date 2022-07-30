public class EmailValidator {
	
	private static final String EMAIL_REGEX ="^[A-Za-z0-9+_.-]+@(.+)$";;

	private static Pattern pattern;

	
	private Matcher matcher;

	public EmailValidator() {
		
		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
	}

	
	public boolean validateEmail(String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
