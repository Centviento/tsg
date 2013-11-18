package rv2;

import java.util.Date;

import tsg.model.Flat;
import tsg.service.FlatLocalServiceUtil;

import com.brdm.common.MPanel;
import com.brdm.common.PortletManagement;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Window.Notification;

public class EditTab extends MPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private Button bAddOwners = new Button("�������� ����������");
	private Button bAddTenants = new Button("�������� �������");
	
	private Button bNewFlat = new Button("��������");
	private Button bSaveFlat = new Button("���������");
	private Button bDelFlat = new Button("�������");
	
	private Flat flat;
	
	public EditTab(PortletManagement ipm) {
		super(ipm);
		
	}

	@Override
	public void init() {
		editVerticalLayout = new VerticalLayout();
		this.addComponent(editVerticalLayout);
		
		 flatId = new Label();
		 house = new ComboBox();
		 numb = new TextField ("����� ��������");
		 areaCommon  = new TextField ("����� �������");
		 areaLiving = new TextField ("����� �������");
		 roomsCnt = new TextField ("��������� ������");
		 floor = new TextField ("����");
		
		ownersCnt = new Label("���������� ����������");
		tenantsCnt = new Label("���������� �������");
		bAddOwners = new Button("�������� ����������");
		bAddTenants = new Button("�������� �������");
		
		bNewFlat = new Button("��������");
		bSaveFlat = new Button("���������");
		bDelFlat = new Button("�������");
		
		areaCommon.setImmediate(true);
		numb.setImmediate(true);
		
		
		editVerticalLayout.addComponent(flatId)	;
		editVerticalLayout.addComponent(house)	;
		editVerticalLayout.addComponent(numb)	;
		editVerticalLayout.addComponent(areaCommon)	;
		editVerticalLayout.addComponent(areaLiving)	;
		editVerticalLayout.addComponent(roomsCnt)	;
		editVerticalLayout.addComponent(floor)	;
		editVerticalLayout.addComponent(roomsCnt)	;
		
		editVerticalLayout.addComponent(ownersCnt)	;
		editVerticalLayout.addComponent(bAddOwners)	;
		editVerticalLayout.addComponent(tenantsCnt)	;
		editVerticalLayout.addComponent(bAddTenants)	;
		
		editVerticalLayout.addComponent(bNewFlat)	;
		editVerticalLayout.addComponent(bSaveFlat)	;
		editVerticalLayout.addComponent(bDelFlat)	;
	
		
		
		
		FlatData dt = (FlatData) pm.getData();
		flat = dt.flat;	
		
		numb.addListener(new TextChangeListener(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void textChange(TextChangeEvent event) {
				if (event.getText() != null)
				{
					flat.setNumber(event.getText());
				}
				
			}});
		
		areaCommon.addListener(new TextChangeListener(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void textChange(TextChangeEvent event) {
				
			if (areaCommon.getValue() != null)
				{
				if (event.getText() != null)
				{
				flat.setSpaceCommon(Integer.parseInt(event.getText()));
				
				System.out.println("Area: "+event.getText());
				}
				}
				
			}});
		
		 buttonNewFlat();
		 buttonSaveFlat();

		 

	}
	
	private void buttonNewFlat()
	{
		bNewFlat.addListener(new ClickListener(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					newFlat();
				} catch (SystemException e) {
					
					e.printStackTrace();
					pm.getWin().showNotification("����� �������� ������� �� ����������", Notification.TYPE_ERROR_MESSAGE);
				}
				
			}});
	}
	
	private void buttonSaveFlat()
	{
		bSaveFlat.addListener(new ClickListener(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					saveFlat();
					pm.getWin().showNotification("������ ���������");
				} catch (SystemException e) {
					
					e.printStackTrace();
					pm.getWin().showNotification("��������� ������ �� ����������", Notification.TYPE_ERROR_MESSAGE);
				}
				
			}});
	}
	
	/*****************************************************************************/
	

	public void loadData() throws PortalException, SystemException
	{
		if (flat != null)
		{
			flatId.setValue(flat.getFlatId());
			
			//Organization hs = OrganizationLocalServiceUtil.getOrganization(flat.getHouseId());
			//house.setValue(hs.getName());
			
			numb.setValue(flat.getNumber());
			
			areaCommon.setValue(flat.getSpaceCommon());
			areaLiving.setValue(flat.getSpaceLiving());
			roomsCnt.setValue(flat.getRoomCnt());
			floor.setValue(flat.getFloor());
			
			ownersCnt.setValue(flat.getOwnersCnt());
			tenantsCnt.setValue(flat.getTenantsCnt());
			
			
		}
	}
	
	private void clearForm()
	{
		flatId.setValue(0);
		
		//Organization hs = OrganizationLocalServiceUtil.getOrganization(flat.getHouseId());
		house.setValue("");
		
		numb.setValue(0);
		
		areaCommon.setValue(0);
		areaLiving.setValue(0);
		roomsCnt.setValue(0);
		floor.setValue(0);
		
		ownersCnt.setValue(0);
		tenantsCnt.setValue(0);
		
		
	}
	
	private void newFlat() throws SystemException
	{
		//�������� ����� ��������.
		// 1.�������� ��� ����
		// 2.���������, ���� ������������ �������� ��� ������������ ���� � ������ �� ������ "���������"
		
		clearForm();
		
		flat = FlatLocalServiceUtil.createFlat();
			
	}
	
	
	private void saveFlat() throws SystemException
	{
		Date now = new Date();
		flat.setCreateDate(now);
		flat.setModifiedDate(now);
		flat.setUserId(pm.getUser().getUserId());
		flat.setCompanyId(pm.getCompany().getCompanyId());
		flat.setTsgId(pm.getGroup().getGroupId());
		
		FlatLocalServiceUtil.addFlat(flat);
		
		
	}
	
}
