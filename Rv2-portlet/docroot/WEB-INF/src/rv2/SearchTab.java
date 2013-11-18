package rv2;

import tsg.model.Flat;

import com.brdm.common.MPanel;
import com.brdm.common.PortletManagement;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.BlurListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

public class SearchTab extends MPanel {

	private ComboBox cbTsgId;
	private ComboBox cbHouseId;
	private TextField tfNumb;
	private ComboBox cbOwner;
	private ComboBox cbTenant;
	//TODO Остальные параметры вынести и прятать под Disclosure
	private TextField tfAreaCommonFrom;
	private TextField tfAreaCommonTo;
	// TODO Добавить остальные поля
	
	private Button bSearch;
	private Table tsearchRes;
	
	private Flat flat;
	
	public SearchTab(PortletManagement ipm) {
		super(ipm);
	}

	@Override
	public void init() {
		
		FlatData flatData = (FlatData)pm.getData();
		flat = flatData.flat;
		
		cbTsgId = new ComboBox("ТСЖ");
		cbTsgId.setImmediate(true);
		cbTsgId.setRequired(true);
		
		cbHouseId = new ComboBox("Дом");
		cbHouseId.setImmediate(true);
		
		tfNumb = new TextField();
		cbOwner = new ComboBox("Владелец");

		bSearch = new Button("Поиск");
		tsearchRes = new Table ("Квартиры");
		
		
		
		tfNumb.setImmediate(true);
		cbOwner.setImmediate(true);
		
		bSearch.setImmediate(true);
		tsearchRes.setImmediate(true);
		
		this.addComponent(cbTsgId);
		this.addComponent(cbHouseId);
		this.addComponent(tfNumb);
		this.addComponent(cbOwner);
		this.addComponent(bSearch);
		this.addComponent(tsearchRes);
		
		
		if (pm.hasPermission("DO_ON_TSG_LEVEL"))
		{
			cbTsgId.setVisible(true);
		}
		else cbTsgId.setVisible(false);
	
		bSearch.addListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// Отправить данные в поиск, получить и отобразить результат
				long tsgId;
				long houseId;
				//Если ТСЖ не выбран, но берем ид того, на сайте которого находится портлет. 
				// Выборку реализовать через DynamicQuery
				if (cbTsgId.getValue() != null)
					tsgId = Long.parseLong(cbTsgId.getValue().toString());
				else tsgId = pm.getGroup().getGroupId();
				
				if (cbHouseId.getValue()!= null) 
					houseId = Long.parseLong(cbHouseId.getValue().toString());
				else houseId = 0;
				
				//TODO выборку по диапазону параметров реализовать позже
				
				FlatData fdata = (FlatData) pm.getData(); 
				fdata.flat = flat;
				fdata.setChanged(true);
			}
		});
	}
	
	private void loadData()
	{
		// house - если дом только один, то постваить его значение в выбранные и сделать cbHouse ReadOnly
	}

}
