package com.library.utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInput {
	
	    private static Scanner scanner = new Scanner(System.in);

	    public static String getStringInput(String prompt) {
	        System.out.print(prompt + ": ");
	        return scanner.next();
	    }

	    public static int getIntInput(String prompt) {
	        System.out.print(prompt + ": ");
	        return scanner.nextInt();
	    }
	    
	    
	    public static Date getDateInput(String prompt) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        Date date = null;

	        while (date == null) {
	            System.out.print(prompt + ": ");
	            String input = scanner.nextLine();
	            try {
	                date = dateFormat.parse(input);
	            } catch (Exception e) {
	                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
	            }
	        }

	        return date;
	    }
	}


