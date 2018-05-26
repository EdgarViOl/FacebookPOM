package com.facebook.test;

import org.junit.Test;

public class FacebookTestCasePOM extends FacebookTestBasePOM {
	@Test
	
	public void searchFriendTestCase() {
		login.logIn("robert.glez.clase.selenium@gmail.com", "Test_1234");
		search.searchFriend("Jesus Omar Navarro");
	}

}
