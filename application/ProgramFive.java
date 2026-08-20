package application;

import java.util.Scanner;

import entites.People;

public class ProgramFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		People PeopleOne;
		
		PeopleOne = new People();
		
		
		System.out.println("What your name:  ");
		PeopleOne.name = sc.nextLine();
		
		System.out.println("How old are you: ");
		PeopleOne.years = sc.nextInt();
		
		
		String ApresentarPeopleOne = PeopleOne.present();
		int PresentYearsOld = PeopleOne.happyBirthday();
		
		System.out.printf("%s%nHappy Birthday, %s!! You completed %d years", ApresentarPeopleOne, PeopleOne.name, PresentYearsOld);
		
		
	}
}
