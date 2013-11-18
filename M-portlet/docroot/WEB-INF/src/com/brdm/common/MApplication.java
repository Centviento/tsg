package com.brdm.common;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletMode;
import javax.portlet.PortletModeException;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletSession;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ValidatorException;
import javax.xml.namespace.QName;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;

import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vaadin.Application;

import com.vaadin.terminal.FileResource;
import com.vaadin.terminal.gwt.server.PortletApplicationContext2;
import com.vaadin.terminal.gwt.server.PortletApplicationContext2.PortletListener;
import com.vaadin.terminal.gwt.server.PortletRequestListener;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;
   
public abstract class MApplication extends Application implements PortletListener, PortletManagement, SettingManagement, PortletRequestListener {
	private static final long serialVersionUID = 6866295068095813473L;
	protected Window windowMain;
	protected User user = null;
	protected PortletMode currentMode;
	protected Group group = null;
	protected ThemeDisplay themeDisplay; 
	protected PortletPreferences ppc;
	
	//protected UnitMessageBus mb;
	//protected LiferayIPC liferayIPC; 
	
	protected PortletSetting portletSetting;
	protected PortletSetting portletData;
	
/********************************************************************************************************/	
	public MApplication() {
		
	}
/*-----------------------------------------------------------------------------------------------------*/
	@Override
	public void init() {
		 windowMain = new Window("Vaadin Portlet Application");
	        setMainWindow(windowMain);
	        
	                
	         // Check that we are running as a portlet.
	         if (getContext() instanceof PortletApplicationContext2) {
	        	 PortletApplicationContext2 ctx =(PortletApplicationContext2) getContext();
	             // Add a custom listener to handle action and
	             // render requests.
	             ctx.addPortletListener(this, this);
	         } else {
	        	 windowMain.showNotification("Not running in portal",
	                     Notification.TYPE_ERROR_MESSAGE);
	         }
	         
	         ppc = null;
	         
	         portletSetting = null;
	         portletData = null;
	         
	      //   liferayIPC = new LiferayIPC();
	      //   windowMain.addComponent(liferayIPC);
	     				
	     	// mb = new UnitMessageBus();
	         
	        
	}
/*-----------------------------------------------------------------------------------------------------*/
	public void firePortletEvent(String name, String value)
	{
			
		PortletApplicationContext2 ctx =(PortletApplicationContext2) getContext();
  		
		ctx.sendPortletEvent(windowMain, new QName(
         "http://autoportal.com/test", name),value); 
	}
/*-----------------------------------------------------------------------------------------------------*/
	public Object getSessionAttributes(String name)
	{
		PortletApplicationContext2 ctx =(PortletApplicationContext2) getContext();
		PortletSession session = ctx.getPortletSession();
  		return session.getAttribute(name, PortletSession.APPLICATION_SCOPE);
  		
	}
	
	public void setSessionAttributes(String name, Object data)
	{
		PortletApplicationContext2 ctx =(PortletApplicationContext2) getContext();
		PortletSession session = ctx.getPortletSession();
  		session.setAttribute(name,data, PortletSession.APPLICATION_SCOPE);
  		
	}
/*-----------------------------------------------------------------------------------------------------*/
	public FileResource getFileResource(String filename)
	{
		String path = null;
		path= getContext().getBaseDirectory().getPath();
		path+= "/"+filename;
		FileResource fl = new FileResource (new File (path), this);
		return fl;
	}
/*-----------------------------------------------------------------------------------------------------*/	
	public FileResource getFileResource(File file){
		FileResource fl = new FileResource (file, this);
		return fl;
	}
/*-----------------------------------------------------------------------------------------------------*/
	public String getBasePath()
	{
		String path = null;
		path= getContext().getBaseDirectory().getPath();
	
		return path;
	}
	
/*-----------------------------------------------------------------------------------------------------*/	
	public String getPortletProperty(String prop) {
		return ppc.getValue(prop, "");
	}
	
	public String[] getPortletProperties(String prop) {
		return ppc.getValues(prop, new String[]{});
	}
	

	public boolean setPortletProperty(String prop, String val) throws ReadOnlyException, ValidatorException, IOException
	{
		ppc.setValue(prop, val);
		ppc.store();
		return true;
	}
	
	public boolean setPortletProperty(String prop, String[] val) throws ReadOnlyException, ValidatorException, IOException
	{
		ppc.setValues(prop, val);
		ppc.store();
		return true;
	}
	
	public boolean setPortletProperty(String prop, List<String> val) throws ReadOnlyException, ValidatorException, IOException
	{
		ppc.setValues(prop,  (String[]) val.toArray(new String[0]));
		ppc.store();
		return true;
	}
/*-----------------------------------------------------------------------------------------------------*/	
	public Window getWin()
	{
		return windowMain;
	}
/*-----------------------------------------------------------------------------------------------------*/
	public User getUser()
	{
		return user;
	}
/*-----------------------------------------------------------------------------------------------------*/
	public Group getGroup()
	{
		return group;
	}
	
	public Company getCompany()
	{
		
		return themeDisplay.getCompany();
		 
	}
	
	public Layout getLayout()
	{
		return themeDisplay.getLayout();
	}
	
	
/*-----------------------------------------------------------------------------------------------------*/
	
/*-----------------------------------------------------------------------------------------------------*/
	public void sendMessage(String destination, String name, String val)
	{
		//создаем сообщение для отправки
		/*	Message myMessage = new Message();
		myMessage.put("UserId", this.getUser().getUserId());
		myMessage.put("Name", name);
		myMessage.put("value", val);
		
		//отправляем сообщение
		//mb.SendMessage(destination, myMessage);
		
	//	liferayIPC.sendEvent(name, val);*/
	} 
/*-----------------------------------------------------------------------------------------------------*/
	
	
	/**
	 * @author Sergey Simonenko
	 */
	public boolean hasPermission(String actionKey) {
		boolean result = false;
		try {	
			PermissionChecker checker = 
					this.themeDisplay.getPermissionChecker();
			String id = this.themeDisplay.getPortletDisplay().getId();
			long plid = this.themeDisplay.getPlid();
			PortletPermissionUtil.check(checker, plid, id, actionKey);
			result = true;
		} catch (PrincipalException e) {
			// У пользователя нет прав. Ничего не делаем. Просто проглатываем
			// исключение.
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
/*-----------------------------------------------------------------------------------------------------*/	
	public Object getData()
	{
		return portletData;
	}
	/*-----------------------------------------------------------------------------------------------------*/	
	public Object getSettings()
	{
		return portletSetting;
	}
	
	/*-----------------------------------------------------------------------------------------------------*/	
	public void setPortletMode(PortletMode portletMode)
	{
		 // Check that we are running as a portlet.
        if (getContext() instanceof PortletApplicationContext2) {
       	 PortletApplicationContext2 ctx =(PortletApplicationContext2) getContext();
            // Add a custom listener to handle action and
            // render requests.
           try {
			ctx.setPortletMode(windowMain, portletMode);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (PortletModeException e) {
			e.printStackTrace();
		}
        } else {
       	 windowMain.showNotification("Not running in portal",
                    Notification.TYPE_ERROR_MESSAGE);
        }	
        
        
	}
/********************************************************************************************************/
	@Override
	public void handleRenderRequest(RenderRequest request,
			RenderResponse response, Window window) {

		if (ppc == null) {
			ppc = request.getPreferences();
			
			if(portletData != null) {
				portletData.load();
			}
			
			if(portletSetting != null) {
				portletSetting.load();
			}
		}
		
		if(portletData != null && portletData.isChanged()) {
			portletData.store();
		}
		if(portletSetting != null && portletSetting.isChanged()) {
			portletSetting.store();
		}
	}
/*-----------------------------------------------------------------------------------------------------*/	
	@Override
	public void handleActionRequest(ActionRequest request,
			ActionResponse response, Window window) {
		
	}
/*-----------------------------------------------------------------------------------------------------*/
	@Override
	public void handleResourceRequest(ResourceRequest request,
			ResourceResponse response, Window window) {
		
		
	}
	
	@Override
	public void onRequestStart(PortletRequest request, PortletResponse response) {
		this.themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		group = themeDisplay.getScopeGroup();
		
		try {
			user = UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
//				
//		try {
//			List<Group> ls = GroupLocalServiceUtil.getUserGroups(user.getUserId());
//			if (ls != null && ls.size() > 0)
//				group = ls.get(0);
//		} catch (PortalException e) {
//			e.printStackTrace();
//		} catch (SystemException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public void onRequestEnd(PortletRequest request, PortletResponse response) {
		
		
	}
/********************************************************************************************************/	
}