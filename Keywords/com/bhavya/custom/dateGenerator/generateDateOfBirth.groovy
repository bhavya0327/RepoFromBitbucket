package com.bhavya.custom.dateGenerator

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateDateOfBirth {
	@Keyword
	public static String methodResult() {
		String date = generateRandomDate();
		//		System.out.println(date);
		return date
	}

	private static String generateRandomDate() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MMyyyy");

		int randomYear = getRandomInRange(30, 60);
		int randomMonth = getRandomInRange(1, 12);
		int randomDay = getRandomInRange(1, 28); // You can adjust this based on your requirements

		LocalDate date = LocalDate.of(LocalDate.now().getYear() - randomYear, randomMonth, randomDay);
		return date.format(dateFormat);
	}

	private static int getRandomInRange(int start, int end) {
		Random r = new Random();
		return start + r.nextInt(end - start + 1);
	}
}
