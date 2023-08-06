package Assignment;

import java.util.concurrent.atomic.AtomicBoolean;

import org.testng.annotations.Test;

public class Register {

	DataAddition dataAdd = new DataAddition();
	@Test
	public void testCase1() {
		FormFilling obj1 = new FormFilling();
		obj1.setfname("Tom");
		obj1.setlname("Jerry");
		obj1.setphone(1234567890);
		obj1.setaddress("Pune");
		obj1.setemail("tom.jerry@gmail.com");
		obj1.setgender("Male");
		obj1.sethobbies("Cricket");
		obj1.setskills("Java");
		obj1.setcountry("India");
		dataAdd.createUser(obj1);
	}

}
