/* Page 1
 * 
 * Language fundamentals
	1 Identifiers
	2 Reserved words
	3 Data Types
	4 Literals
	5 Arrays
	6 Types of variables
	7 variable -Array methods
	8 Main methods
	9 Command line arguments
	10 Java coding standards
*/

/* 1 - Identifiers:
	A name in java program is called identifier, which can be used for the identification purpose. 
	It can be Method, variable name, class name or label name

	eg: LanguageFundamentals, main, string,args,x are identifiers in the below code

Rules & regulations:
	1. The only allowed characters in java identifiers are : a to z, A to Z, 0 to 9, $, _ 
	   we will get compile time error if we are using any other characters eg: total#
	2. Identifiers can not starts with numeric numbers  eg :123total - not allowed but total123 allowed
	3. Java identifiers are case sensitive eg : number, Number,NUMBER are different and allowed
	4. No length limit for java identifiers but it is not recommended 
	5. Reserved words/Keywords are not allowed eg: int if = 20 , is not allowed
	6. All predefined class name and interface name are allowed to used as identifiers but not recommended 
	   because it reduces readability and create confusion 
 

*/
public class LanguageFundamentals {
	
		public static void main(String[] args) {
			int x = 10;
	//      int if = 10; not allowed, CE
			int String = 888; //String is a class -- 
			System.out.println(String);
			int Runnable = 999; //Runnable is a interface
			System.out.println(Runnable);
			int total_number;
	   //	int total#;
	   //   int 123total;
			int ca$h;
			int _$_$_$_;
	   //	int all@hands;
			int Java2share;
			int Interger;
			int Int;
	   //	int int;
			//int a=null;
		}
		
	
}
	
/*	
 * 2 - Reserved Keywords (53))
 
	 in java some words are reserved to represent to meaningful functionality,such types of words 
	 are called reserved words
	 
	 Keywords - 50 ( reserved word associated with functionality)
	 Reserved literals - 3 (true,false,null) 
	
								Reserved Keywords (53)
								/						\
					Keywords - 50                         Reserved literals - 3 
				/				\								- true
	used keywords(48)        unused keywords(2)					- false
								- goto							- null
								- const
	
	keywords for Data types:8
		- byte, short,int, long, float, double, boolean, char
	
	Keywords for flow control:11
		-if, else, do, while, switch, case, default, for, break, continue, return
		
	Keywords for modifiers:11
		- public, private, protected,static, final,abstract, synchronized, native, transient, volatile, strictfp(1.2v)
	
	Keywords for exception handling: 6
		- try, catch,finally,throw,throws,assert(1.4)
	
	Keywords for class: 6
		- class,extends, interface, implements, package, import
		
	Keywords for objects: 4
		-new, instanceof,super,this
	
	 - void
	 - enum (1.5) use enum to define a grouped constants eg: month, beer
	 
	 conclusions:
	 - all 53 reserved words contains only alphabetic
	 - all are used small letters
	 - No delete because Garbage collector is used for destruction
	 
 
 3 - Data types:
 
	Java is not considered as a pure object oriented programming language because several oops 
	concepts are not supported eg : operator overloading , multiple inheritance are not supported
	more over we are depending on primitive data type which are non objects
	   
					Primitive data types (8)
	   				/					\
			  numeric					non numeric
			 /		\
	  integral       floating point			- char
	   - byte			- float				- boolean
	   - short			- double
	   - int
	   - long
	   
	  notes : 
	  except boolean and char, remaining are considered as signed data types because it represents both +, - numbers
	   
   byte : 8 bits : -128 to 127 
	   0 mean positive, and it will represent directly in the memory
	   1 mean negative and  it will be represented in form of 2 compliment
	   
	   byte b = 128 or 10.5 // error : CE:possiable loss of precision found int , required byte
	   byte b = true or string // error : incompatible types
	   
	   Best choice of using byte: if you want to handle data in terms of streams either from the file or network
	   eg : FileOutputstreams
   
   short: most rarely used data types in java (2 bytes - 16 bits)
   		- -32768 to 32767 
   		
   	int : most commonly used data types 
   		- 4 bytes : 32 bits 
   		int x = 2147483648 // CE- Integer number is too large
   		int x = 2147483648l //CE:possiable loss of precision found long , required int
   		
   	long: used for large numbers( eg: .length method return long values)
   		- 8 bytes : 64 bits
   		
	float : upto 5-6 decimal places of accuracy
		- single precision
		- 4 bytes
		- range -3.4e28 to 3.4e38
	double: upto 14-15 decimal places of accuracy
   		- double precision
   		- 8 bytes
		- range -1.7e28 to 1.7e38
   		
   	boolean : 
   		-size is not applicable in java , it is VM dependent	
   		-range is not applicable but allowed values are true or false
   		- default value is false 
   		boolean b = True; //CE cannot find symbol.
   		
   	char: 2 bytes - 16 bits java is Unicode based 	but C & C++ are ASCII code based
   		- default value is 0 which represent space
   		
   Note: We cannot use null on primitive data types will give CE incompatible types	
   
4 - Literals:
	1. Integral literals :

			int x = 10;
			
			int - data type or keyword
			x   - name of variable or identifier
			10  - constant value or Literal 
	
		1 - decimal literal (base 10)   eg : int x =10;
		2 - octal form (base 8)		    eg : int x = 010;
		3 - hexadecimal form (base 16)  eg : int x = 0X10 or 0x10; // java is not case sensitive 
		
			int x = 0786 //CE integer number is too large
			int x = 0Xbeer // CE
		
		
	2. Floating point literals:
	
		by default every floating point literal are double type, hence we can not assign directly to 
		float variable but we can specify as float type by suffixed with F
		
		float f = 123.456; // CE : P L P
		float f = 123.456F;
		double d = 123.456 or 	123.456D;
		double d = 0123.456 //Valid because all floating point is considered as double
		double d = 0X123.456; // CE malformed floating point literals
		
		double d = 0786 // invalid there is no decimal so it is an octal number and 8 is not allowed
		double d = 0Xface // valid because by default it double
		
		 we can assign integral literals directly to floating point variables and that integral literal 
		 can be specified in decimal or octal or hexadecimal forms
		 
		 
	 3.boolean literals: true or false
	 	boolean b = true; //valid
	 	boolean b = 0; //CE incompatible types
	 	boolean b = True // CE cannot find symbol
	 	boolean b = "true" // incompatible types found string
	 	
	 4. char literals :
	 	char ch = 'a'; //valid
	 	char ch = a;  // CE cannot find the symbol variable a
	 	char ch = "a"  // invalid - incompatible types found java.lang.String expected char
	 	char ch = 'ab' // invalid - CE1 unclosed char literals, 
	 								CE2 unclosed char literals, 
	 								CE3 -not a java statement.
	 	
	 	we can represent char literal as
	 		- unicode representation
	 		- escape characters
	 	
	 	 char ch = '\u0061'; // ==> a
	 	 every escape character is valid char literal 
	 	\n - new line
	 	\t - horizontal tab
	 	\r - carriage return
	 	\b - back space
	 	\f - form feed
	 	\' - single quote   
	 	\" - double quote
	 	\\ - back slash
	 	
	 	System.Out.print(" This is \' symbol")
	 	System.Out.print(" This is \" symbol")
	 	System.Out.print(" This is \\ symbol")
	 	
	 5 String literals
	 	- any sequence of character within  "" are treated as string literal
	 	- 
	 	
 	1.7 versions enhancement w.r.t literals
	 	
	 	1. binary literals: 
	 		integral data types can be represent even as binary forms (0,1)
	 		eg : int x = 0B1111; ==> 15
	 	2. usage of _ symbol in between numeric literals to improve the readability of codes
	 	 	double d = 1_23_456.7_8_9
	 	 	
	 	 	byte (1)--> short(2)
	 	 				 		\
	 	 						int(4) --> long(8) --> float(4) -->double(8)
								/
						char(2)
					
			float f = 10 l // long can assign to float because memory representation is dif for long and float		
			char & short are 2 bytes but not able to assign each other because of sign and unsign		
					
							 * 
*/
 

