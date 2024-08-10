package Java5Assignment;

public class asteriskLogger implements Logger {

	@Override
	public void log(String log) {
	System.out.println("                                                 ");
	System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String eRror = "Error";
		System.out.println("*****************");
		System.out.println( "***" + eRror +":"+error +"***" );
		System.out.println("*****************");
		
	}

}
