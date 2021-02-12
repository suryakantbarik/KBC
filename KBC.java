package com.kbc;

import java.util.Scanner;

public class KBC {
	//String quetions;
	//String answer;
	String option;
	int userinput = 1;
	int rightwrongcheck=0;
	boolean exit = false;

	public KBC() {

	}

//	public String getQuetions() {
//		return quetions;
//	}
//
//	public void setQuetions(String quetions) {
//		this.quetions = quetions;
//	}
//
//	public String getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}

	public String getOption() {
		return option;
	}

	public void setOption(String in) {
		this.option = in;
		Scanner sc = new Scanner(System.in);
		do {
			String option;
			switch (userinput) {
			case 1:
				System.out.println("Question 1: Who is the prime minister of India");
				System.out.println("A. Dr.Manmohan Singh   B.LalBahadur Shastri");
				System.out.println("C. Dr.APJ Kalam  D. Narendra Modi");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("d")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;
				

				break;

			case 2:
				System.out.println("Question 2: How many vowels in english language");
				System.out.println("A. 3 B. 5");
				System.out.println("C. 7 D. 8");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("b")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}

				userinput++;
				
				break;

			case 3:
				System.out.println("Questions 3: In which group of places the Kumbha Mela is held every twelve years?");
				System.out.println("A.Prayagraj  B. Allahbad");
				System.out.println("C. Ujjain D. Haridwar");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("a")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;
				

				break;

			case 4:
				System.out.println("Question 4: How many state in India");
				System.out.println("A. 28 B. 29");
				System.out.println("C. 30 D. 27");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("b")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;
				

				break;

			case 5:
				System.out.println("Question 5: Who is the Nation bird of India");
				System.out.println("A. Peacock B. Sparrow");
				System.out.println("C. Eagle D. Crow");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("a")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;
				

				break;

			case 6:
				System.out.println("Question 6: Bahubali festival related to which religion");
				System.out.println("A. Hinduism B. Islam");
				System.out.println("C. Buddhism D. Jainism");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("d")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;
				

				break;

			case 7:
				System.out.println("Question 7: September 27 is celebrated every year as");
				System.out.println("A. Teachers Day B. National Integration Day");
				System.out.println("C. World Tourism Day D. International Literacy Day");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("c")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;

				break;

			case 8:
				System.out.println("Question 8: In the C language, the constant is defined ");
				System.out.println("A.Before main  B. After Main");
				System.out.println("C. Anywhere but starting on new line D. Non of these ");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("b")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;

				break;

			case 9:
				System.out.println("Question 9: What is the 16-bit compiler allowable range for integer constants?");
				System.out.println("A. -3.4e38 to 3.4e38 B. -32767 to 32768");
				System.out.println("C. -32668 to 32667   D. -32768 to 32767");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("c")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;

				break;

			case 10:
				System.out.println("Question 10: What is a lint?");
				System.out.println("A. C compiler B. Interactive Debugger");
				System.out.println("C. Analyzing tool  D. C Interpreter");
				System.out.println("\nPlease Enter an Option.");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("c")) {
					System.out.println("You Won");
					rightwrongcheck++;
				} else {
					System.out.println("You Loose");
				}
				userinput++;
				System.out.println("Total result: "+rightwrongcheck*10+"%");

				break;
			}
		} while (exit != true);
		

		
	}

}
