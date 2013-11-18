package rv2;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.brdm.common.MApplication;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class Rv2Application extends MApplication {

	private PView viewContent;
  	private PEdit editContent;
  	private PHelp helpContent;
	
	public void init() {
		super.init();

		portletData = new FlatData(this);
		portletSetting = new FlatSettings(this);
		
		
        viewContent = new PView(this);
        editContent = new PEdit(this);
        helpContent = new PHelp(this);
        
        viewContent.init();
        editContent.init();
        helpContent.init();

	}

	@Override
	public void handleEventRequest(EventRequest request,
			EventResponse response, Window window) {

	}

	@Override
	public void handleRenderRequest(RenderRequest request,
			RenderResponse response, Window window) {
		
		if (request.getPortletMode() == PortletMode.EDIT) {
	         editContent.doView();
	         window.setContent(editContent);
	    } 
		else if (request.getPortletMode() == PortletMode.VIEW) {
	         viewContent.doView();
	         window.setContent(viewContent);
		} 
		else if (request.getPortletMode() == PortletMode.HELP) {
	         helpContent.doView();
	         window.setContent(helpContent);
	     }
	}	

}