package rv2;

import java.util.List;

import tsg.model.Flat;
import tsg.service.FlatLocalServiceUtil;

import com.brdm.common.PortletSetting;
import com.brdm.common.SettingManagement;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class FlatData extends PortletSetting {
	
	public Flat flat;
	public long flatId;
	
	public boolean user_flat;
	
	
	public FlatData(SettingManagement ism) {
		super(ism);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load()  {
		
		
		String dft =  sm.getPortletProperty("DYSPLAY_FLAT"); // USER, SITE, SPEC
		if (dft.equals(""))	dft = "USER";
		
		if (dft.equals("SPEC"))
		{ // Используем явно указанную квартиру
			String sft =  sm.getPortletProperty("SELECTED_FLAT");
			if (!sft.equals(""))
			{
				try {
					flat = FlatLocalServiceUtil.getFlat(Long.parseLong(sft));
				} catch (NumberFormatException | PortalException
						| SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}else dft = "USER";
			
		}
		
		if (dft.equals("USER"))
		{
			// Ищем квартиру, которая принадлежит пользователю или в которой он живет
			// Если их больше, чем одна - берем первую попавшуюся. 
			// Если нужно отобразить какую-то определенную - используем SPEC
			try {
				List<Flat> flats = FlatLocalServiceUtil.getFlatByOwner(sm.getUser().getUserId());
				flat = flats.get(0);
				
			} catch (PortalException | SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
