package form;

import org.apache.struts.action.ActionForm;

public class HelloWordForm  extends ActionForm{


	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
