package com.qa.helloworld;

public class Exams {
	
	public static void main(String[] args) {
		examTot();
		examPer();
	}
	
	public static void examTot() {
		int physics = 123;
		int chemistry = 112;
		int biology = 143;
		int total = physics + chemistry + biology;
		System.out.println("Total Mark: " + total);
	}

	public static void examPer() {
		int physics = 142;
		int chemistry = 12;
		int biology = 132;
		int physicsper = physics * 100 / 150;
		int chemper = chemistry * 100 / 150;
		int bioper = biology * 100 / 150;
		int percentage = (physics + chemistry + biology) * 100 / 450;

		if (percentage >= 60 & physicsper >= 60 & chemper >= 60 & bioper >= 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Pass) Passed every exam, well done!");

		} else if (physicsper >= 60 & chemper >= 60 & bioper < 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: "  + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Fail) Failed one of your exams");

		} else if (physicsper >= 60 & chemper < 60 & bioper >= 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.print("(Fail) Failed one of your exams");

		} else if (physicsper < 60 & chemper >= 60 & bioper >= 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Fail) Failed one of your exams");

		} else if (physicsper >= 60 & chemper < 60 & bioper < 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Fail) Failed two of your exams");

		} else if (physicsper < 60 & chemper >= 60 & bioper < 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Fail) Failed two of your exams");

		} else if (physicsper < 60 & chemper < 60 & bioper >= 60) {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper);
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Fail) Failed two of your exams");

		} else {
			System.out.println("Physics Percentage: " + physicsper + "%");
			System.out.println("Chemistry Percentage: " + chemper + "%");
			System.out.println("Biology Percentage: " + bioper + "%");
			System.out.println("Overall Percentage: " + percentage + "%");
			System.out.println("(Fail) Failed all of your exams");

		}
	}
}