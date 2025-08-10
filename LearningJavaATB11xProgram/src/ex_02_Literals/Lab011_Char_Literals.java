package ex_02_Literals;

public class Lab011_Char_Literals {
	public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("Abhijit Baviskar");
        System.out.println("Abhijit"+new_line+"Baviskar");
        System.out.println("Abhijit"+tab_line+"Baviskar");
        System.out.println("Abhijit"+back_space+"Baviskar");
        System.out.println("Abhijitl is old"+carriage_return+"Baviskar");

 
	}
}	
