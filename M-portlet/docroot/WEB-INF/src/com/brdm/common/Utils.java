package com.brdm.common;

import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.util.LocaleUtil;

/**
 * РљР»Р°СЃСЃ РїСЂРµРґРЅР°Р·РЅР°С‡РµРЅ РёСЃРєР»СЋС‡РёС‚РµР»СЊРЅРѕ РґР»СЏ РїСЂРµРґРѕСЃС‚Р°РІР»РµРЅРёСЏ СѓС‚РёР»РёС‚-СЃС‚Р°С‚РёС‡РµСЃРєРёС…
 * Р�?РµС‚РѕРґРѕРІ. РќРµ РЅР°РґРѕ СЂР°СЃС€РёСЂСЏС‚СЊ СЌС‚РѕС‚ РєР»Р°СЃСЃ РёР»Рё СЃРѕР·РґР°РІР°С‚СЊ РµРіРѕ СЌРєР·РµР�?РїР»СЏСЂС‹.
 * 
 * @author Sergey Simonenko
 */
public final class Utils {

	/**
	 * Р“РµРЅРµСЂРёСЂСѓРµС‚РµС‚ Р�?Р°СЃРєСѓ РїРѕРёСЃРєР° РґР»СЏ РѕРїРµСЂР°С‚РѕСЂР° like. РџСЂРё РїРѕРёСЃРєРµ Р±СѓРґСѓС‚
	 * РЅР°С…РѕРґРёС‚СЊСЃСЏ РІСЃРµ СЌР»РµР�?РµРЅС‚С‹, РЅР°С‡Р°Р»Рѕ РєРѕС‚РѕСЂС‹С… СЃРѕРІРїР°РґР°РµС‚ СЃ Р�?Р°СЃРєРѕР№. Р”Р»СЏ 
	 * Р�?СѓР»СЊС‚РёСЏР·С‹С‡РЅС‹С… РїРѕР»РµР№ РїРѕРёСЃРє РІРµРґС�?С‚СЃСЏ СЃСЂР°Р·Сѓ РїРѕ РІСЃРµР�? СЏР·С‹РєР°Р�?.
	 * 
	 * @param source Р’С…РѕРґСЏС‰Р°СЏ СЃС‚СЂРѕРєР°.
	 * @param multilanguage Р”РѕР»Р¶РµРЅ Р±С‹С‚СЊ true, РµСЃР»Рё РїРѕРёСЃРє РІРµРґС�?С‚СЃСЏ РїРѕ 
	 * Р�?СѓР»СЊС‚РёСЏР·С‹С‡РЅС‹Р�? РїРѕР»СЏР�?.
	 * 
	 * @return Р’РѕР·РІСЂР°С‰Р°РµС‚ Р�?Р°СЃРєСѓ РїРѕРёСЃРєР°.
	 * 
	 * @author Sergey Simonenko
	 */
	public static String getStartsWithMask(
			String source, boolean multilanguage) {
		String result = getFiltered(source);
		if (multilanguage) {
			result = "%>" + result;
		}
		result = result + "%";
		return result;
	}
	
	/**
	 * Р“РµРЅРµСЂРёСЂСѓРµС‚ Р�?Р°СЃРєСѓ РїРѕРёСЃРєР° РґР»СЏ РѕРїРµСЂР°С‚РѕСЂР° like РґР»СЏ Р�?СѓР»СЊС‚РёСЏР·С‹С‡РЅС‹С… РїРѕР»РµР№, 
	 * РєРѕС‚РѕСЂР°СЏ РїРѕР·РІРѕР»СЏРµС‚ РёСЃРєР°С‚СЊ С‚РѕС‡РЅРѕРµ СЃРѕРІРїР°РґРµРЅРёРµ СЃС‚СЂРѕРєРё РЅР° РЅРµРєРѕС‚РѕСЂРѕР�? 
	 * (РѕРґРЅРѕР�? РєРѕРЅРєСЂРµС‚РЅРѕР�?) СЏР·С‹РєРµ.
	 * 
	 * @param source Р�СЃС…РѕРґРЅР°СЏ СЃС‚СЂРѕРєР°.
	 * @return Р’РѕР·РІСЂР°С‰Р°РµС‚ Р�?Р°СЃРєСѓ РїРѕРёСЃРєР°.
	 * 
	 * @author Sergey Simonenko
	 */
	public static String getExactMask(String source) {
		String result = getFiltered(source); 
		result = "%>" + source + "<%";
		return result;
	}
	
	/**
	 * Р¤РёР»СЊС‚СЂСѓРµС‚ Р·Р°РїСЂРµС‰С�?РЅРЅС‹Рµ СЃРёР�?РІРѕР»С‹ Р�?Р°СЃРєРё РїРѕРёСЃРєР°.
	 * 
	 * @param source Р�СЃС…РѕРґРЅР°СЏ СЃС‚СЂРѕРєР°.
	 * @return Р’РѕР·РІСЂР°С‰Р°РµС‚ СЃС‚СЂРѕРєСѓ, РёР· РєРѕС‚РѕСЂРѕР№ РѕС‚Р±СЂРѕС€РµРЅС‹ Р·Р°РїСЂРµС‰С�?РЅРЅС‹Рµ СЃРёР�?РІРѕР»С‹.
	 * 
	 * @author Sergey Simonenko
	 */
	public static String getFiltered(String source) {
		String result = source.replaceAll("[%_<>]", "");
		return result;
	}
	
	/**
	 * @param nameMap РњСѓР»СЊС‚РёСЏР·С‹С‡РЅР°СЏ РєР°СЂС‚Р° СЃС‚СЂРѕРє.
	 * @return Р’РѕР·РІСЂР°С‰Р°РµС‚ СЃС‚СЂРѕРєСѓ РґР»СЏ РїСЂРµРґРїРѕС‡С‚РёС‚РµР»СЊРЅРѕР№ Р»РѕРєР°Р»Рё РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ.
	 * 
	 * @author Sergey Simonenko
	 */
	public static String getLocalized(
			Map<Locale, String> nameMap, Locale userLocale) {
		String result = null;
		if (nameMap != null) {
			if (userLocale != null) {
				result = nameMap.get(userLocale);
				if (result != null && !result.equals("")) {
					return result;
				}
			}
			Locale defaultLocale = LocaleUtil.getDefault();
			if (defaultLocale != null) {
				result = nameMap.get(defaultLocale);
				if (result != null && !result.equals("")) {
					return result;
				}	
			}
			for (String value : nameMap.values()) {
				if (!value.equals("")) {
					return value;
				}
			}
		}
		if (result == null) {
			result = "";
		}
		return result;
	}
	
	/**
	 * Р—Р°РєСЂС‹С‚С‹Р№ РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ, РїСЂРµРїСЏС‚СЃС‚РІСѓРµС‚ СЃРѕР·РґР°РЅРёСЋ СЌРєР·РµР�?РїР»СЏСЂРѕРІ РєР»Р°СЃСЃР°.
	 */
	private Utils() {}
}
