package com.platts.oil.analytics.irr.uat.pages.components;

import com.platts.oil.analytics.irr.uat.pages.PlattsPageObject;

/**
 * Created by jonathan_cone on 6/22/2016.
 */
public class Navigation extends PlattsPageObject {

    private static final String ALL_PLAYS_NAV_BUTTON_ITEM_ID = "allPlaysBtn";
    public static final String ALL_PLAYS_NAV_BUTTON_JS =
            getButtonFromItemIdJs("button", ALL_PLAYS_NAV_BUTTON_ITEM_ID);
    private static final String PLAY_DETAILS_NAV_BUTTON_ITEM_ID = "singlePlayBtn";
    public static final String PLAY_DETAILS_NAV_BUTTON_JS =
            getButtonFromItemIdJs("button", PLAY_DETAILS_NAV_BUTTON_ITEM_ID);
    private static final String MARKET_INSIGHT_NAV_BUTTON_ITEM_ID = "marketInsightBtn";
    public static final String MARKET_INSIGHT_NAV_BUTTON_JS =
            getButtonFromItemIdJs("button", MARKET_INSIGHT_NAV_BUTTON_ITEM_ID);

}
