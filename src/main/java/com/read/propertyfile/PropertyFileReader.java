package com.read.propertyfile;

import java.text.MessageFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class PropertyFileReader {
	
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
	public static void main (String args[]) {
		String message = rb.getString("text.message");
		String formattedMessage = MessageFormat.format(message, "Richard", "School", new Date(), "1days");

		System.out.println("Formatted Message \t" + formattedMessage );
	}

}
