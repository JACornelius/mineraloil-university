package com.lithium.mineraloi.university;

import com.lithium.mineraloil.selenium.elements.BaseElement;

public class TimelineController {
    private TimelineView view;

    public TimelineController() {
        view = new TimelineView();
    }

    public String getUserTimelineString() {
        return view.getUserTimelineElement().getInnerText();
    }

    public void clickUserTimelineButton() {
        view.getUserTimelineButtonElement().click();
    }

    public String getHomeTimelineString() {
        return view.getHomeTimelineElement().getInnerText();
    }

    public void clickHomeTimelineButton() {
        view.getHomeTimelineButtonElement().click();
    }

    public void clickFilterButton() {
        view.getFilterButtonElement().click();
    }

    public void clickHomeTimelineTab() { view.getHomeTimelineTabElement().click();}

    public void clickUserTimelineTab() { view.getUserTimelineTabElement().click(); }

    public void clickPostTweetTab() {view.getPostTweetTabElement().click(); }

    public void typeFilterInput(String filterInput) {
        view.getFilterInputElement().type(filterInput);
    }

    public void typeTweetInput(String tweetInput) { view.getTweetInputElement().type(tweetInput); }

    public void clickPostTweetButton() {
        view.getPostTweetButtonElement().click();
    }


}