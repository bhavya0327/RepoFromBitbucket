//package com.bhavya.custom.dateGenerator;
//
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
////import java.time.LocalDate;
//import java.util.Random;
//
//import com.kms.katalon.core.annotation.Keyword;
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI;
//
//public class generateDateOfBirth {
//	@Keyword
//	public static String generateRandomDate() {
//		Random random = new Random();
//
//		// Generate a random year between 1900 and 2100
//		int year = random.nextInt(201) + 1900;
//
//		// Generate a random month between 1 and 12
//		int month = random.nextInt(12) + 1;
//
//		// Generate a random day based on the generated year and month
//		int maxDay = LocalDate.of(year, month, 1).lengthOfMonth();
//		int day = random.nextInt(maxDay) + 1;
//
//		// Format the date as "dd/mm/yyyy"
//		return String.format("%02d/%02d/%04d", day, month, year);
//	}
//}








//	public static String generate() {
//		String date = generatePreviousDate();
//		//		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_visit_date'), date);
//		//		println(date);
//		return date
//	}
//
//	private static String generatePreviousDate() {
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//		// Introduce a small delay to ensure different timestamps
//		try {
//			Thread.sleep(1000);  // 1000 milliseconds = 1 second
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		LocalDate currentDate = LocalDate.now();
//		LocalDate date = currentDate.minusYears(getRandomInRange(30, 60));
//
//		// Ensure the generated date is in the past
//		if (date.isAfter(currentDate)) {
//			date = currentDate.minusYears(getRandomInRange(30, 60));
//		}
//
//		return date.format(dateFormat);
//	}
//
//	private static int getRandomInRange(int start, int end) {
//		Random r = new Random();
//		return start + r.nextInt(end - start + 1);
//	}
//}






//package com.bhavya.custom.dateGenerator;
//
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//import com.kms.katalon.core.annotation.Keyword;
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI;
//
//public class generateDateOfBirth {
//	@Keyword
//	public static String generate() {
//		String date = generatePreviousDate();
//		//		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_visit_date'), date);
//		//		println(date);
//		return date
//	}
//
//	private static String generatePreviousDate() {
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//		LocalDate currentDate = LocalDate.now();
//		LocalDate date = currentDate.minusYears(getRandomInRange(30, 60));
//
//		// Ensure the generated date is in the past
//		if (date.isAfter(currentDate)) {
//			date = currentDate.minusYears(getRandomInRange(30, 60));
//		}
//
//		return date.format(dateFormat);
//	}
//
//	private static int getRandomInRange(int start, int end) {
//		Random r = new Random();
//		return start + r.nextInt(end - start + 1);
//	}
//}






package com.bhavya.custom.dateGenerator;

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI;

public class generateDateOfBirth {
	@Keyword
	public static String generate() {
		LocalDate currentDate = LocalDate.now();
		String date = generatePreviousDate(currentDate);

		//		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_visit_date'), date);
		//		println(date);
		return date;
	}

	private static String generatePreviousDate(LocalDate currentDate) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = currentDate.minusYears(getRandomInRange(30, 60));
		return date.format(dateFormat);
	}

	private static int getRandomInRange(int start, int end) {
		Random r = new Random();
		return start + r.nextInt(end - start + 1);
	}
}




//package com.bhavya.custom.dateGenerator
//
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//
//public class generateDateOfBirth {
//	@Keyword
//
//
//
//	public static void genErate() {
//
//
//
//
//
//		String date = generatePreviousDate();
//
//		//		System.out.println(date);
//
//		//		return date;
//
//		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_visit_date'), date)
//
//		println(date)
//
//
//
//		//		WebUI.setText(findTestObject('Object Repository/Page_Employee Profile-PaymentEvolution/input_Date of Birth_DOB_1'),date)
//	}
//
//	private static String generatePreviousDate() {
//
//
//
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//		LocalDate date = LocalDate.now().minusYears(getRandomInRange(30,60));
//
//		return date.format(dateFormat);
//	}
//
//
//
//	private static int getRandomInRange(int start, int end){
//
//		Random r = new Random();
//
//		return start + r.nextInt(end - start + 1);
//	}
//}
//
