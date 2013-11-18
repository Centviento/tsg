package rv2;

import com.brdm.common.MPanel;
import com.brdm.common.PortletManagement;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vaadin.ui.TabSheet;

public class PEdit extends MPanel {
	
	private static final long serialVersionUID = -415710934565991781L;
	private TabSheet tabSheet;
	private EditTab editTab;
	private SearchTab searchTab;
	
	public PEdit(PortletManagement ipm) {
		super(ipm);
		
	}
/*****************************************************************************/
	@Override
	public void init() {
		tabSheet = new TabSheet();
		addComponent(tabSheet);
		
		editTab = new EditTab(pm);
		searchTab = new SearchTab(pm);
				
		tabSheet.addTab(searchTab, "Поиск");
		tabSheet.addTab(editTab,"Изменение");
		
		editTab.init();
		searchTab.init();
		 
	}

	@Override
	public void doView() {
		try {
				editTab.loadData();
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*****************************************************************************/
	
		
		
		
		
		
		
	
}
