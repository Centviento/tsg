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
	private TextField numb = new TextField ("Номер квартиры");
	private TextField areaCommon  = new TextField ("Общая площадь");
	private TextField  areaLiving = new TextField ("Жилая площадь");
	private TextField  roomsCnt = new TextField ("Количесво комнат");
	private TextField  floor = new TextField ("Этаж");
	
	private Label ownersCnt = new Label("Количество владельцев");
	private Label tenantsCnt = new Label("Количество жильцов");
	private Button bAddOwners = new Button("Добавить владельцев");
	private Button bAddTenants = new Button("Добавить жильцов");
	
	private Button bNewFlat = new Button("Добавить");
	private Button bSaveFlat = new Button("Сохранить");
	private Button bDelFlat = new Button("Удалить");
	
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
		 numb = new TextField ("Номер квартиры");
		 areaCommon  = new TextField ("Общая площадь");
		 areaLiving = new TextField ("Жилая площадь");
		 roomsCnt = new TextField ("Количесво комнат");
		 floor = new TextField ("Этаж");
		
		ownersCnt = new Label("Количество владельцев");
		tenantsCnt = new Label("Количество жильцов");
		bAddOwners = new Button("Добавить владельцев");
		bAddTenants = new Button("Добавить жильцов");
		
		bNewFlat = new Button("Добавить");
		bSaveFlat = new Button("Сохранить");
		bDelFlat = new Button("Удалить");
		
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
					pm.getWin().showNotification("Новую квартиру создать не получилось", Notification.TYPE_ERROR_MESSAGE);
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
					pm.getWin().showNotification("Данные сохранены");
				} catch (SystemException e) {
					
					e.printStackTrace();
					pm.getWin().showNotification("Сохранить данные не получилось", Notification.TYPE_ERROR_MESSAGE);
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
		//Создание новой квартиры.
		// 1.Очистить все поля
		// 2.Подождать, пока пользователь заполнит все обязательные поля и нажмет на кнопку "Сохранить"
		
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
