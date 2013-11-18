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
	private TextField numb = new TextField ("����� ��������");
	private TextField areaCommon  = new TextField ("����� �������");
	private TextField  areaLiving = new TextField ("����� �������");
	private TextField  roomsCnt = new TextField ("��������� ������");
	private TextField  floor = new TextField ("����");
	
	private Label ownersCnt = new Label("���������� ����������");
	private Label tenantsCnt = new Label("���������� �������");
	//private Button bAddOwners = new Button("�������� ����������");
	//private Button bAddTenants = new Button("�������� �������");
	
	//private Button newFlat = new Button("��������");
	//private Button saveFlat = new Button("���������");
	//private Button delFlat = new Button("�������");
	
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
		 numb = new TextField ("����� ��������");
		 areaCommon  = new TextField ("����� �������");
		 areaLiving = new TextField ("����� �������");
		 roomsCnt = new TextField ("��������� ������");
		 floor = new TextField ("����");
		
		ownersCnt = new Label("���������� ����������");
		tenantsCnt = new Label("���������� �������");
	//	bAddOwners = new Button("�������� ����������");
	//	bAddTenants = new Button("�������� �������");
		
	//	newFlat = new Button("��������");
	//	saveFlat = new Button("���������");
	//	delFlat = new Button("�������");
		
		
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
	
		
		tabSheet.addTab(editVerticalLayout, "��������");
		
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

