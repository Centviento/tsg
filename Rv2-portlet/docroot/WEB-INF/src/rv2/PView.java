 package rv2;


import tsg.model.Flat;


import com.brdm.common.MPanel;
import com.brdm.common.PortletManagement;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;


import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;



@SuppressWarnings("serial")
public class PView extends MPanel {
	private VerticalLayout searchVerticalLayout;
	
	private VerticalLayout editVerticalLayout;
	private Label flatId = new Label();
	private ComboBox house = new ComboBox();
	private TextField numb = new TextField ("Номер квартиры");
	private TextField areaCommon  = new TextField ("Общая площадь");
	private TextField  areaLiving = new TextField ("Жилая площадь");
	private TextField  roomsCnt = new TextField ("Количесво комнат");
	private TextField  floor = new TextField ("Этаж");
	
	private Label ownersCnt = new Label("Количество владельцев");
	private Label tenantsCnt = new Label("Количество жильцов");
	//private Button bAddOwners = new Button("Добавить владельцев");
	//private Button bAddTenants = new Button("Добавить жильцов");
	
	//private Button newFlat = new Button("Добавить");
	//private Button saveFlat = new Button("Сохранить");
	//private Button delFlat = new Button("Удалить");
	
	private TabSheet tabSheet;
		
	private Flat flat;
	
	public PView(PortletManagement ipm) {
		super(ipm);
	}

	@Override
	public void init() {
		
		tabSheet = new TabSheet();
		addComponent(tabSheet);
		
		editVerticalLayout = new VerticalLayout();
		
		 flatId = new Label();
		 house = new ComboBox();
		 numb = new TextField ("Номер квартиры");
		 areaCommon  = new TextField ("Общая площадь");
		 areaLiving = new TextField ("Жилая площадь");
		 roomsCnt = new TextField ("Количесво комнат");
		 floor = new TextField ("Этаж");
		
		ownersCnt = new Label("Количество владельцев");
		tenantsCnt = new Label("Количество жильцов");
	//	bAddOwners = new Button("Добавить владельцев");
	//	bAddTenants = new Button("Добавить жильцов");
		
	//	newFlat = new Button("Добавить");
	//	saveFlat = new Button("Сохранить");
	//	delFlat = new Button("Удалить");
		
		
		editVerticalLayout.addComponent(flatId)	;
		editVerticalLayout.addComponent(house)	;
		editVerticalLayout.addComponent(numb)	;
		editVerticalLayout.addComponent(areaCommon)	;
		editVerticalLayout.addComponent(areaLiving)	;
		editVerticalLayout.addComponent(roomsCnt)	;
		editVerticalLayout.addComponent(floor)	;
		editVerticalLayout.addComponent(roomsCnt)	;
		
		editVerticalLayout.addComponent(ownersCnt)	;
	//	editVerticalLayout.addComponent(bAddOwners)	;
		editVerticalLayout.addComponent(tenantsCnt)	;
	//	editVerticalLayout.addComponent(bAddTenants)	;
		
	//	editVerticalLayout.addComponent(newFlat)	;
	//	editVerticalLayout.addComponent(saveFlat)	;
	//	editVerticalLayout.addComponent(delFlat)	;
	
		
		tabSheet.addTab(editVerticalLayout, "Изменить");
		
		FlatData dt = (FlatData) pm.getData();
		flat = dt.flat;	
	}
	
		

private void loadData() throws PortalException, SystemException
{
	
	
	if (flat != null)
	{
		flatId.setValue(flat.getFlatId());
		
		Organization hs = OrganizationLocalServiceUtil.getOrganization(flat.getHouseId());
		house.setValue(hs.getName());
		
		numb.setValue(flat.getNumber());
		
		areaCommon.setValue(flat.getSpaceCommon());
		areaLiving.setValue(flat.getSpaceLiving());
		roomsCnt.setValue(flat.getRoomCnt());
		floor.setValue(flat.getFloor());
		
		ownersCnt.setValue(flat.getOwnersCnt());
		tenantsCnt.setValue(flat.getTenantsCnt());
		
		
	}
}
	
	
		
	@Override
	public void doView() {
		try {
				loadData();
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

