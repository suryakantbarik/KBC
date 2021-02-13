package com.kbc;
import com.kbc.DataSet;

public  class Question {
	
		private String question ;
		private String option1;
		private String option2;
		private String option3;
		private String option4;
		
		private String useranswer;
		private String rightanswer;
		private String Winmassage;
		private String Loosemassage;
		private int rightanswerpercentage;
		
		
		
		
		//Constructor
		public Question() {
		 question=null ;
		 option1=null;
		 option2=null;
		 option3=null;
		 option4=null;
		 rightanswer=null;
		this.useranswer=null;
			
		}
		
		//Parameterized constructor
		public Question(String question,String option1,String option2,String option3,String option4, String rightanswer, String useranswer) {
			this.question=question;
			this.option1=option1;
			this.option2=option2;
			this.option3=option3;
			this.option4=option4;
			this.rightanswer=rightanswer;
			this.useranswer=useranswer;
		}
		
		
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getOption1() {
			return option1;
		}
		public void setOption1(String option1) {
			this.option1 = option1;
		}
		public String getOption2() {
			return option2;
		}
		public void setOption2(String option2) {
			this.option2 = option2;
		}
		public String getOption3() {
			return option3;
		}
		public void setOption3(String option3) {
			this.option3 = option3;
		}
		public String getOption4() {
			return option4;
		}
		public void setOption4(String option4) {
			this.option4 = option4;
		}
		public String getRightanswer() {
			return rightanswer;
		}
		public void setRightanswer(String rightanswer) {
			this.rightanswer = rightanswer;
		}
		public String getUseranswer() {
			return useranswer;
		}

		public void setUseranswer(String useranswer) {
			this.useranswer = useranswer;
		}
		public String getLoosemassage() {
			return Loosemassage;
		}

		public void setLoosemassage(String loosemassage) {
			Loosemassage = loosemassage;
		}
		public String getWinmassage() {
			return Winmassage;
		}

		public void setWinmassage(String winmassage) {
			Winmassage = winmassage;
		}

		public int getRightanswerpercentage() {
			return rightanswerpercentage;
		}

		public void setRightanswerpercentage(int rightanswerpercentage) {
			this.rightanswerpercentage = rightanswerpercentage;
		}


}

