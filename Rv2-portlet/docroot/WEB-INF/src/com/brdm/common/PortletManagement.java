/**
 * 
 */
package com.brdm.common;

import java.io.File;
import javax.portlet.PortletMode;

import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.vaadin.terminal.FileResource;
import com.vaadin.ui.Window;

/**
 * @author Ливси
 *
 */
public interface PortletManagement {
	
	public void firePortletEvent(String name, String value);
	public Object getSessionAttributes(String name);
	public void setSessionAttributes(String name, Object value);
	public void setPortletMode(PortletMode portletMode);
	public String getBasePath();
	public FileResource getFileResource(String path);
	public FileResource getFileResource(File file);
	public Window getWin();
	public User getUser();
	public Group getGroup();
	public Company getCompany(); 
	public Layout getLayout();
	
	/**
	 * Позволяет узнать, есть ли права у данного пользователся к некоторому
	 * действию для данного портлета.
	 * 
	 * @param actionKey Строковое представление действия. Например, стандартным
	 * действием может быть VIEW или CONFIGURATION.
	 * @return Возвращает true, если права есть, иначе возвращает false.
	 * 
	 * @author Sergey Simonenko
	 */
	public boolean hasPermission(String actionKey);
	
	/**
	 * Отправляет событие по двум интерфейсам сразу: по MessageBus и LiferayIPC
	 * @param destination - значение из  DestinationsList
	 * @param name - название сообщения
	 * @param val - значение сообщения
	 * @author Igor Kuchay
	 */
	public void sendMessage( String destination, String name, String val);
	
	/**
	 * 
	 * @param propname
	 * @return
	 * @deprecated
	 * Оставлена только длля совместимости со старыми портлетами
	 * 
	 */
	
	public String getPortletProperty(String propname);
	
	/**
	 * Взять данные приложения
	 * @return
	 * Объект данных приложения. Нужно явно привести к используемому типу.
	 */
	public Object getData();
	
	/**
	 * Взять настройки приложения
	 * @return
	 * Объект настроек приложения. Нужно явно привести к используемому типу.
	 */
	public Object getSettings();

	
}
