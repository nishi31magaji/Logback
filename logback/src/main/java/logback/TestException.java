package logback;

import java.io.IOException;

public class TestException {
public static void main(String[] args) {
	try {
	 foo();	
	}
	catch(IOException | NullPointerException e) {
		
	}
}

public static void foo() throws IOException {
	
}
}
