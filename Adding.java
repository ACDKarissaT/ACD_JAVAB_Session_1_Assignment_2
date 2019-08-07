package adding;

/*
 *  Takes two command-line arguments (default 2 and 5) and adds them without using
 *  + operator, other wise gives error prompt. 
 */
public class Adding {
	public static void main(String[] args) {
		int a = 2, b = 5;
		if (args.length == 2) { 
			try {
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
			} catch (NumberFormatException e){
				System.out.println ("Make sure arguments are numbers.");
				return;
			}
		}
		System.out.println((0-a-b) * (-1));
	}
}
