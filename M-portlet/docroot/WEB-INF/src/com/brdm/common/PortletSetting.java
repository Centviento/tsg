package com.brdm.common;

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
	 */
	public abstract void load();
	
	/**
	 * В этой функции происходит сохранение всех настроек портлета
	 */
	public void store() {
		this.setChanged(false);
	}
	

}
