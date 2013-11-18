package com.brdm.common;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public abstract class PortletSetting {
	
	protected SettingManagement sm;
	protected boolean changed;
	
	public PortletSetting(SettingManagement ism) {
		
		this.sm = ism;
		
	}
	
	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean update) {
		this.changed = update;
	}	
	
	/**
	 * В этой функции происходит инициализация всех настроек портлета
	 * @throws SystemException 
	 * @throws PortalException 
	 */
	public abstract void load() ;
	
	/**
	 * В этой функции происходит сохранение всех настроек портлета
	 */
	public void store() {
		this.setChanged(false);
	}
	

}
