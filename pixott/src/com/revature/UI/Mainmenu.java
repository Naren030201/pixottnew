package com.revature.UI;
import java.util.*;

import com.revature.Usermenu.userMenu;
import com.revature.app.App;
public class Mainmenu {
public static void display() {
	System.out.println("========================================================================================");
	System.out.printf("%50s \n", "Pix OTT");
	System.out.println("========================================================================================");
	System.out.printf("%50s \n","Main Menu");
	System.out.println("========================================================================================");
	System.out.println("1] Signup");
	System.out.println("2] Login");
	System.out.println("3] Exit");
	System.out.println("Select an number:");
	int option =App.scanner.nextInt();
	if(option==1) {
		Signup.display();
	}else if(option==2) {
		Login.display();
	}else if(option==3) {
		System.out.println("========================================================================================");
		System.out.printf("%70s \n","Thanks for coming hope you come back and binge again");
		System.out.println("========================================================================================");
	}
	
}
}
