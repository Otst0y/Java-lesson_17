package lesson_17;

public class Main {

	public static void main(String[] args) {

		Integer[] array1 = { 5, 8, 9, 98, 84, 54, 55 };
		Integer[] array2 = { 5, 8, 9, 98, 84, 54, 55 };

		Collection c1 = new Collection(array1);
		Collection c2 = new Collection(array2);
		Iterator iteratorForward = c1.createForward();
		Iterator iteratorBackward = c2.createBackward();

		iteratorForward.next();

		System.out.println();

		iteratorBackward.next();
		

		/*
		 * programmerinterview.com/index.php/java-questions/inner-vs-nested-classes/
		 * 
		 * quizful.net/post/inner-classes-java
		 * 
		 */

	}

}
