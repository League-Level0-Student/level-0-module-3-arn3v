
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 21st";
		String dadsBirthday = "April 28th";
		String myBirthday = "September 27th";
		String sisBirthday = "September 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
String response = JOptionPane.showInputDialog(null, "Which birthday do you wanna know?");
System.out.println(response);
	if(response == "mom") {
		System.out.println(momsBirthday);
	}
	
	if(response == "dad") {
		System.out.println(dadsBirthday);
	}
	
	if(response == "sis") {
		System.out.println(sisBirthday);
		
	if(response == "you") {
			System.out.println(myBirthday);
		}
	}
	} 
}
