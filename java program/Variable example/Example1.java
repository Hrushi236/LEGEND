class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program start");
		
		byte byteVariable;    //---> Example of declare a variable
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;


		byteVariable = 25;//-10 | -89 | 15 //----> Example of initlizing a variable
		shortVariable = 50;//-10 | -89
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25 //--> it is not mendatory to write l in longvariable type 
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f //--> it is mandatory to write f after decimal val in floatVariable type 
		doubleVariable = 36.56d;//25 | -69 |54.54|0.256 //-->it is not mendatory to write d after decimal val in doublevariable type
		charVariable = 'A';//'a' | 'Z' //--> it is mandatory to write Character in single cote only in charvariable type
		booleanVariable = true;//true | false
		

		System.out.println("program end");
	}
}

//note-->

// syntax to declare a variable: datatype variablename;
//Syntax to initlize a variable: variablename = value;
/*
		 datatype------> tells us what type of value this variable is going to hold
			byte, short, int, long --> positive or negative number
			float, double          --> decimal numbers
			char                   --> character/alphabet 
			boolean                --> true/false
		*/
