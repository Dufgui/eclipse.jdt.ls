package org.sample;

/**
 * This is Bar
 */
public class Bar {

    public static void main(String[] args) {
    	String foo = 
    			"""
    			Raw
    			String
    			Literal
    			FTW
    			""";
    	System.out.println(foo);
    	
        var qty = switch (args ==null?0:args.length) {
        	case 0 -> "Zero";
        	case 1 -> "One";
        	default -> "Many";
        };
        System.out.print(qty + " args");
    }
}
