package Java5Assignment;

public class spacedLogger implements Logger  {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("                                        ");
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < ((CharSequence) log).length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(((CharSequence) log).charAt(i));
		}

		System.out.println(result.toString());
		
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("                         ");
		String error1 = "ERROR";
	
		
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < ((CharSequence) error).length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(((CharSequence) error).charAt(i));
		}

		System.out.println( error1 +":" +result.toString());
	}

}
