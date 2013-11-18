package com.brdm.common;

import com.vaadin.ui.VerticalLayout;

public abstract class MPanel extends VerticalLayout {
	
	private static final long serialVersionUID = -4108962585698264122L;

	protected PortletManagement pm;
	
	protected boolean viewIsSet;
	
	public MPanel(PortletManagement ipm) {
		pm = ipm;
		viewIsSet = false;
	}
	
	public abstract void init();
	
	public  void doView() throws Exception
	{
		viewIsSet = true;
	}
	
	public void refresh()
	{
		viewIsSet= false;
	}
}
