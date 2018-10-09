package form;


import org.apache.struts.action.ActionForm;

public class IndexForm extends ActionForm{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	private String login;
	private String password;

	

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
