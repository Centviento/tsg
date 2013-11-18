package com.brdm.common;

import java.io.IOException;
import java.util.List;

import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;

public interface SettingManagement {

	/**
	 * Возвращает значение PortletProperty, имя которого передается в параметре 
	 * @param prop
	 * @return
	 * @author IgorKuchay
	 */
	public String getPortletProperty(String prop);
	  	
	public String[] getPortletProperties(String prop);
	
	/**
	 * Устанавливает значение для указанного PortletProperty и сразу же записывает в базу
	 * @param prop
	 * Название устанавливаемого PortletProperty
	 * @param val
	 * Значение устанавливаемого PortletProperty
	 * @return
	 * @throws ReadOnlyException
	 * Бросается, если PortletProperty открыта только для чтения и не подлежит модификации
	 * @throws ValidatorException
	 * Бросается, если валидатор, повешенный на PortletProperty, не пропускает значение
	 * @throws IOException
	 * Бросается, если в базу значение записать не удалось
	 * @author Igor Kuchay
	 */
	public boolean setPortletProperty(String prop, String val) throws ReadOnlyException, ValidatorException, IOException;
	
	public boolean setPortletProperty(String prop, String[] val) throws ReadOnlyException, ValidatorException, IOException;
	
	public boolean setPortletProperty(String prop, List<String> val) throws ReadOnlyException, ValidatorException, IOException;

	
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
	
	public User getUser();
	public Group getGroup();
	public Company getCompany();
	
}
