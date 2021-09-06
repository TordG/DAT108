package Jenkov_Lambda;

import java.util.Comparator;

//Fra danskens lambda-video

public class LambdaExamples {

	public static void main(String[] args) {
		Comparator<String> stringComparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		
		int comparison = stringComparator.compare("hello", "world");
		System.out.println(comparison);
		
		
		
		//Lambda expression
		Comparator<String> stringComparatorLambda = 
				(String o1, String o2) -> { return o1.compareTo(o2); };
				
				
		//Simplified lambda expression		
		Comparator<String> stringComparatorSimpleLambda = (o1, o2) -> o1.compareTo(o2);
				
		int lambdaComparison = stringComparatorLambda.compare("hello", "world");
		System.out.println(lambdaComparison);
		
		
		//Lambda-eksempel UTEN parameter, bare tom parentes!
//		LAMBDA_MyFunction myFunction = () -> {System.out.println("Hello World"); };
//		
//		myFunction.apply();
		
		
		//Lambda-eksempel med ETT parameter, trenger ikke parentes, bare et ord!
//		LAMBDA_MyFunction myFunction2 = text -> System.out.println(text);
//		
//		myFunction2.apply("Hello Function Body!");
		
		//Lambda-eksempel med TO parameter!
		LAMBDA_MyFunction myFunction3 = (text1, text2) -> {System.out.println(text1 +" + "+text2);
		return text1 +" + " + text2;  
			};
				
		String returnValue = myFunction3.apply("Hello Function Body!", "Test");
		//System.out.println(returnValue);
		
		
		//Lagrer lambda-objektet i ny variabel
		LAMBDA_MyFunction myFunction4 = myFunction3;
		myFunction4.apply("Text 1", "Text 2");
		
	}

}




















