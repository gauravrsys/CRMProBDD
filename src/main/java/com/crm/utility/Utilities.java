package com.crm.utility;

public class Utilities {
	
	public static void StaticWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
