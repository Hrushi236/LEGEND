class Example3 
{
	public static void main(String[] args) 
	{
		System.out.println("Program start");
		
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;


		byteVariable = 25;
		shortVariable = 50;
		intVariable = 150;
		longVariable = 2530l; 
		floatVariable = 25.36f;
		doubleVariable = 36.56d;
		charVariable = 'A';
		booleanVariable = true;

		//print all the varibale value inthe console
		//System.out.println("byteVariable");//byteVariable
		//System.out.println(byteVariable);//25
					//or
		System.out.println("byteVariable = "+byteVariable);
		System.out.println("shortVariable = "+shortVariable);
		System.out.println("intVariable = "+intVariable);
		System.out.println("longVariable = "+longVariable);
		System.out.println("floatVariable = "+floatVariable);
		System.out.println("doubleVariable = "+doubleVariable);
		System.out.println("charVariable = "+charVariable);
		System.out.println("booleanVariable = "+booleanVariable);
		System.out.println("Program ends");
	}
}
//note--->// to get combine result i.e variable type name = the val of that variable we have to do concatination operation (eg-System.out.println("byteVariable = "+byteVariable))

/*
 + ----> LHS + RHS  ===> both are number dn it will perform addition operation
 		  25 + 35   = 60

 + ----> LHS + RHS  ===> if anyone from LHS or RHS are non numeric 
						 dn it will perform concatination peration
      "Hello" + 65  = Hello65
	   String + number = Stringnumber

	   205 + "Hi"   = 205Hi
		number + String =numberString

	   "Bye "+20 + 20 + 60 = Bye 202060
							Bye 20 + 20 =Bye 2020
						   (String)+ number= StringNumber

							Bye 2020 + 60= Bye 202060
							(String) + number = StringNumber

	60 + 10 + 25 + "Good" + 70 +10= 95Good7010
*/