package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("TEK Systems Global Services", "H S Darshini");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
