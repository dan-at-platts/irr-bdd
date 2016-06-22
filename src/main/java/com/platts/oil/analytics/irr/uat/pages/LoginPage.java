package com.platts.oil.analytics.irr.uat.pages;

import com.platts.oil.analytics.irr.uat.model.AppPages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by jonathan_cone on 6/21/2016.
 */
@DefaultUrl("http://nj09mhf5996.mhf.mhc:7001/irr")
public class LoginPage extends PageObject {

    public static final String EMAIL_TEXTFIELD_REFERENCE = "userid";
    public static final String EMAIL_TEXTFIELD_XTYPE = "textfield";
    public static final String EMAIL_TEXTFIELD_JS = getComponentJs(EMAIL_TEXTFIELD_XTYPE, EMAIL_TEXTFIELD_REFERENCE);
    public static final String PASSWORD_TEXTFIELD_REFERENCE = "password";
    public static final String PASSWORD_TEXTFIELD_XTYPE = "textfield";
    public static final String PASSWORD_TEXTFIELD_JS = getComponentJs(PASSWORD_TEXTFIELD_XTYPE, PASSWORD_TEXTFIELD_REFERENCE);
    public static final String LOGIN_BUTTON_REFERENCE = "loginButton";
    public static final String LOGIN_BUTTON_XTYPE = "button";
    public static final String LOGIN_BUTTON_JS = getComponentJs(LOGIN_BUTTON_XTYPE, LOGIN_BUTTON_REFERENCE);
    public static final String MULTIPLAY_PAGE_XTYPE = "multiPlaysView";
    public static final String SINGLEPLAY_PAGE_XTYPE = "playDetailsView";

    public static String getComponentJs(String xtype, String reference) {
        return "return Ext.ComponentQuery.query('"+xtype+"[reference="+reference+"]')[0].id";
    }

}
