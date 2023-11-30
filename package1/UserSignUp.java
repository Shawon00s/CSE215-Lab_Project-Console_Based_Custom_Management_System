package package1;

class UserSignUp extends Customs{
	static final int PASSWORD_LENGTH=8;
	final int NUMBER_OF_UPPER_CASE=1;
	final int NUMBER_OF_LOWER_CASE=2;
	final int NUMBER_OF_DIGIT=2;
	
	String password;
	int upperCaseCount=0;
	int lowerCaseCount=0;
	int digitCount=0;

	UserSignUp(){}

	UserSignUp(String name,String password){
		super(name);
		this.password=password;
	}

	String Checker(){
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		if(password.length()>=PASSWORD_LENGTH && upperCaseCount>=NUMBER_OF_UPPER_CASE && lowerCaseCount>=NUMBER_OF_LOWER_CASE && digitCount>=NUMBER_OF_DIGIT) {
			return super.name+", Signed Up Successfully!!!";
		}
		else {
			return "Invalid Password\n1.Set password with more than 7 charecters\n2.At least keep one(1) upper case\n3.At least keep two(2) lower case\n4.At least keep two(2) digit";
		}
	}
}