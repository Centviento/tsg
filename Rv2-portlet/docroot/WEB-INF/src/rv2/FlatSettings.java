package rv2;

import com.brdm.common.PortletSetting;
import com.brdm.common.SettingManagement;

public class FlatSettings extends PortletSetting {
	public boolean user_flat;
	
	public FlatSettings(SettingManagement ism) {
		super(ism);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		user_flat = false;
		// TODO Auto-generated method stub

	}

}
