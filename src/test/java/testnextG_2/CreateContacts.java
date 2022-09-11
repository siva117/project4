package testnextG_2;

import org.testng.annotations.Test;

public class CreateContacts {

	@Test(groups="create")
	public void createContact() {
		System.out.println("in create contact");
	}
	@Test(groups="delete")
	public void deleteContact() {
		System.out.println("in delete contact");
	}
	@Test(groups="create")
	public void addContact() {
		
		 System.out.println("in add contact");
	}
	@Test(groups="modify")
	public void checkContact() {
		System.out.println("in check contact");
	}
	
	
	
}
