package com.kbc;

import java.util.ArrayList;
import com.kbc.DataSet;
import java.util.Scanner;

public class MainKBC {
	static String useranswer;
	static int rightanswerpercentage = 0;
	static String ynOption;

	static Question queObj = new Question();

	static ArrayList<Question> list = new ArrayList<>();

	public static void option() {
		System.out.println(Strings.WELCOME_TITLE);

		list = DataSet.getQuestionList();

		for (Question queObj : list) {

			System.out.println(queObj.getQuestion() + "\n" + queObj.getOption1() + queObj.getOption2() + "\n"
					+ queObj.getOption3() + queObj.getOption4());
			System.out.println(Strings.NOTIFICATION);

			// taking user input
			Scanner keyboard = new Scanner(System.in);
			
			useranswer = keyboard.nextLine();
			
			queObj.setUseranswer(useranswer);

			// input check with right answer
			if (useranswer.equalsIgnoreCase(queObj.getRightanswer())) {
				queObj.setWinmassage(Strings.WIN_TAG); //win massage

				System.out.println(queObj.getWinmassage());
				rightanswerpercentage++;
				
			}else {
				
				queObj.setLoosemassage(Strings.LOOSE_TAG);//loose message
				System.out.println(queObj.getLoosemassage());
			}

		} // for loop end
		queObj.setRightanswerpercentage(rightanswerpercentage * 10);
		System.out.println("Total pecentage:- " + queObj.getRightanswerpercentage() + " %");

		System.out.println("Do you want to continue yes/no");//Asking user to continue or not
		Scanner sc = new Scanner(System.in);
		ynOption = sc.nextLine();

		if (ynOption.equalsIgnoreCase("y") || ynOption.equalsIgnoreCase("yes")) {
			option();
			
		} else if (ynOption.equalsIgnoreCase("n") || ynOption.equalsIgnoreCase("no")) {
			System.out.println("Thank you");
			option();
			
		} else {
			System.out.println("Invalid Option");
			option();
		}

	}
	
	//main method
	public static void main(String[] args) {

		option();//call the option method

	}

}
