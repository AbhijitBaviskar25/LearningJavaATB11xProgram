package ex_04_Type_Casting;

public class Lab026_Type_Casting {
	  public static void main(String[] args) {
	        byte b = 10;
	        int a = b; // Valid syntax -> smaller data into the bigger data type
	        // Valid - > Implicit Casting- Automatically
	        // Implicit - Casting - Widening
	        int a1 = (int)b; // Explicit Casting - Widening( doesn't require)

	        long phone_no = 9876543210l;
	        //short s = phone_no; // implicit ?
	        short s = (short) phone_no; // Explicit Casting - Narrowing
	        System.out.println(s);
	    }

}
