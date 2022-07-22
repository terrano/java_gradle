package com.gradle;

class GradleTutorial {
	public static void main(String[] args) {

		int i = 10;
		String str="Vasa!";
		if (args.length > 0) {
    			try {
        			i = Integer.parseInt(args[0]);
    			} 
			catch (NumberFormatException e) {
        			System.out.println("Argument " + args[0] + " should have been an integer. Will be 10.");
    			}
		}

		if (args.length > 1) {
			str = args[1];
		}

		while (i>0) {
			i--;
			System.out.printf("%s ", str);
			System.out.printf(" Fuck you! %d \n", i);
		}
	}
}
