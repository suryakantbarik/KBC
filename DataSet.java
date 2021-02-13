package com.kbc;

import java.util.ArrayList;

public class DataSet {

public static ArrayList<Question> getQuestionList(){
		
		ArrayList<Question> listQuestion = new ArrayList<>();
		
		Question q1 = new Question();
		q1.setQuestion("Question 1: Who is the prime minister of India");
		q1.setOption1("A.Dr.Manmohan Singh ");
		q1.setOption2("B.LalBahadur Shastri");
		q1.setOption3("C.Dr.APJ Kalam ");
		q1.setOption4("D. Narendra Modi");
		q1.setRightanswer("d");
		
		listQuestion.add(q1);
		
		
		Question q2 = new Question();
		
		q2.setQuestion("Question 2: How many vowels in english language");
		q2.setOption1("A. 5 ");
		q2.setOption2("B. 6 ");
		q2.setOption3("C. 7 ");
		q2.setOption4("D. 4 ");
		q2.setRightanswer("a");
		
		listQuestion.add(q2);
		
		Question q3 = new Question();
		q3.setQuestion("Question 3: How many states in India");
		q3.setOption1("A. 25 ");
		q3.setOption2("B. 26 ");
		q3.setOption3("C. 27 ");
		q3.setOption4("D. 29 ");
		q3.setRightanswer("d");
		
		listQuestion.add(q3);
		
		Question q4 = new Question();
	
		q4.setQuestion("Question 4: How many contries is the world ");
		q4.setOption1("A. 102 ");
		q4.setOption2("B. 195 ");
		q4.setOption3("C. 205 ");
		q4.setOption4("D. 196 ");
		q4.setRightanswer("d");
	
		listQuestion.add(q4);

		Question q5 = new Question();
	
		q5.setQuestion("Question 5: How many contries is the world ");
		q5.setOption1("A. 102 ");
		q5.setOption2("B. 195 ");
		q5.setOption3("C. 205 ");
		q5.setOption4("D. 196 ");
		q5.setRightanswer("d");
		
		listQuestion.add(q5);
		
		Question q6 = new Question();
		
		q6.setQuestion("Question 6: How many vowels in english language");
		q6.setOption1("A. 5 ");
		q6.setOption2("B. 6 ");
		q6.setOption3("C. 7 ");
		q6.setOption4("D. 4 ");
		q6.setRightanswer("a");
		
		listQuestion.add(q6);
		
		Question q7 = new Question();
		q7.setQuestion("Question 7: How many states in India");
		q7.setOption1("A. 25 ");
		q7.setOption2("B. 26 ");
		q7.setOption3("C. 27 ");
		q7.setOption4("D. 29 ");
		q7.setRightanswer("d");
		
		listQuestion.add(q7);
		
		

		Question q8 = new Question();
	
		q8.setQuestion("Question 8: How many contries is the world ");
		q8.setOption1("A. 102");
		q8.setOption2("B. 195");
		q8.setOption3("C. 205");
		q8.setOption4("D. 196");
		q8.setRightanswer("d");
		listQuestion.add(q8);
		
		
		Question q9 = new Question();

		q9.setQuestion("Question 9: How many contries is the world ");
		q9.setOption1("A. 102 ");
		q9.setOption2("B. 195 ");
		q9.setOption3("C. 205 ");
		q9.setOption4("D. 196 ");
		q9.setRightanswer("d ");
	
		listQuestion.add(q9);

		Question q10 = new Question();
	
		q10.setQuestion("Question 10: How many contries is the world ");
		q10.setOption1("A. 102 ");
		q10.setOption2("B. 195 ");
		q10.setOption3("C. 205 ");
		q10.setOption4("D. 196 ");
		q10.setRightanswer("d");

		listQuestion.add(q10);
		
		return listQuestion;
		
	}

	

	

}
