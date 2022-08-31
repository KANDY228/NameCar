package Constructor.Main;

public class MyClass {
	char myCharOne;
	Integer myValue;
	int firstCharInString=0;
	
	public MyClass() {}
	
	public MyClass(int i_arg) {
		myValue = i_arg;
	}
	public MyClass(int i_arg,char c_arg) {
		myCharOne = c_arg;
		myValue = i_arg;		
	}
	
	public  MyClass(String s_arg) {
		myCharOne =s_arg.charAt(firstCharInString);
		
	}
	
	public char getCharOne() {
		return myCharOne;
	}
	public char setCharOne() {
		 return myCharOne;
	}
	
	public Integer getmyValue() {
		return myValue;
	}
	public Integer setmyValue() {
		return myValue;
	}

}
