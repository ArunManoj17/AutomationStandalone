package StepDefintion;

//import AutoTrial.ParameterDemo;

public class ExecutionMethod extends MethodInfo{

	public static void main(String[] args) throws Throwable {
		
		ExecutionMethod n = new ExecutionMethod();
		n.Once_Browser_is_opened_Hit_the_Home_page_and_click_Sign_on("http://newtours.demoaut.com/");
		n.I_enter_all_the_required_Username_and_password("KevinShyam", "KevinShyam07");
		n.The_Customer_should_be_navigated_to_Booking_page_successfully();	

	}

}
