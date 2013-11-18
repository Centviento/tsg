package rv2;

import com.brdm.common.MPanel;
import com.brdm.common.PortletManagement;
import com.vaadin.ui.Label;

public class PHelp extends MPanel {

	private static final long serialVersionUID = -959187722237257046L;

	public PHelp(PortletManagement ipm) {
		super(ipm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.addComponent(this.help);
		this.help.setValue(HELP_TEXT);
		this.help.setWidth(HELP_WIDTH);
		this.help.setHeight(HELP_HEIGHT);
		this.help.setContentMode(Label.CONTENT_XHTML);
	}

	@Override
	public void doView() {
		// TODO Auto-generated method stub

	}
	private final Label help = new Label();
	private final static String HELP_WIDTH = "100%";
	private final static String HELP_HEIGHT = "100%";
	private final static String HELP_TEXT = 
			"<h2>Управление Vin кодами</h2> " +

			"<p>С помощью этого портлета Вы можете найти, создать, редактировать существующие " +
			" VIN коды, а так же их удалить. Еще можете редактировать параметры и опции " +
			" VIN кода.</p> " +

			"<h2>Поиск</h2> " +

			"<p>Для поиска VIN кода нужно ввести маску поиска в соответствующее поле. " +
			"Подходит так же частичное совпадение, но не мение 3 символов, и не больше 17,  " +
			"так как VIN код состоит из 17 символов.</p> " +

			"<h2>Добавление</h2> " +

			"<p>Доавление VIN кодов происходит на вкладке Детально, при этом НЕ должен  " +
			"быть выбран VIN код в таблице поиска. После того как заполнили все поля нажать  " +
			"на кнопку Добавить VIN.</p> " +

			"<h2>Редактирование</h2> " +

			"<p>Для редактирования VIN кода, нужно выбрать редактируемый VIN код из  " +
			"таблицы результатов поиска, и перейти на вкладку Детально, после изменений  " +
			"нажать на кнопку Сохранить изменения.</p> " +
			"<p>Для редактирования опций, нужно перейти на вкладку Опции, после изменений  " +
			"нажать на кнопку Сохранить изменения.</p> " +

			"<h2>Удаление</h2> " +

			"<p>Для того, чтобы удалить VIN код, необходимо выбрать удаляемый VIN код " +
			"из таблицы результатов поиска и нажать кнопку удаления, которая стает  " +
			"видимой когда выбран один из VIN кодов.</p>";
	
}
