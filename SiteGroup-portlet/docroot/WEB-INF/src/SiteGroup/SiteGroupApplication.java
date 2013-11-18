package SiteGroup;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.PortletApplicationContext2;
import com.vaadin.terminal.gwt.server.PortletApplicationContext2.PortletListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;

@SuppressWarnings("serial")
public class SiteGroupApplication extends Application implements PortletListener {
	private ThemeDisplay themeDisplay;
	private Label label2;
	private Label label3;
	public void init() {
		Window window = new Window();

		setMainWindow(window);
		 // Check that we are running as a portlet.
        if (getContext() instanceof PortletApplicationContext2) {
       	 PortletApplicationContext2 ctx =(PortletApplicationContext2) getContext();
            // Add a custom listener to handle action and
            // render requests.
            ctx.addPortletListener(this, this);
        } else {
       	 window.showNotification("Not running in portal",
                    Notification.TYPE_ERROR_MESSAGE);
        }
        
		
		Label label = new Label("Hello SiteGroup!");
		label2 = new Label("Hello SiteGroup!");
		label3 = new Label();
		window.addComponent(label);
		window.addComponent(label2);
		window.addComponent(label3);
	}

	@Override
	public void handleRenderRequest(RenderRequest request,
			RenderResponse response, Window window) {
themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		Group group = themeDisplay.getScopeGroup();
		//Group group = GroupLocalServiceUtil.getGroup(scgroup.getGroupId());
		label3.setValue("Group");
		label2.setValue(group.getName());
		Organization organization = null;
		User user2 = null;
		try {
		if (group.isOrganization()) {
			
				organization = OrganizationLocalServiceUtil.getOrganization(group.getClassPK());
				label2.setCaption(organization.getName());
				label3.setValue("Org");
			
		}
		else if (group.isUser()) {
			user2 = UserLocalServiceUtil.getUserById(group.getClassPK());
			label2.setValue(user2.getFullName());
			label3.setValue("User");
		}
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void handleActionRequest(ActionRequest request,
			ActionResponse response, Window window) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleEventRequest(EventRequest request,
			EventResponse response, Window window) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleResourceRequest(ResourceRequest request,
			ResourceResponse response, Window window) {
		// TODO Auto-generated method stub
		
	}

}