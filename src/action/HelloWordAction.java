package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Formulaire;





public class HelloWordAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		//HelloWordForm helloWordAction=(HelloWordForm) form;
		//IndexForm indexForm;
		
		Formulaire formulaire;		
		formulaire=(Formulaire)form;
		
		System.out.println(formulaire.getLogin()+"  "+ formulaire.getPassword());

		
		//System.out.println(helloWordAction.getMessage());
		
		//System.out.println("j'ai passe hellowordaction");
		//String suite="suite";
		return mapping.findForward("suite");
		
	}
		
}
