package com.lithium.mineraloi.university;

import com.lithium.mineraloi.university.browser.DriverManager;
import com.lithium.mineraloil.selenium.elements.BaseElement;
import com.lithium.mineraloil.selenium.elements.Driver;
import com.lithium.mineraloil.selenium.elements.TextElement;
import org.openqa.selenium.By;

import javax.xml.soap.Text;

public class TimelineView {
    private Driver driver;

    public TimelineView() {
        driver = DriverManager.INSTANCE.getDriver();
    }

    public BaseElement getUserTimelineButtonElement() {
        return driver.createBaseElement(By.xpath("//button[@class='userTimelineButton']"));
    }

    public BaseElement getUserTimelineElement() {
        return driver.createBaseElement(By.xpath("//div[@id='userTimelinePlaceholder']"));
    }

    public BaseElement getHomeTimelineButtonElement() {
        return driver.createBaseElement(By.xpath("//button[@class='homeTimelineButton']"));
    }

    public BaseElement getHomeTimelineElement() {
        return driver.createBaseElement(By.xpath("//div[@id='homeTimelinePlaceholder']"));
    }

    public BaseElement getFilterButtonElement() {
        return driver.createBaseElement(By.xpath("//button[@class='filterButton']"));
    }

    public TextElement getFilterInputElement() {
        return driver.createTextElement(By.xpath("//input[@class='inputBox']"));
    }

    public BaseElement getHomeTimelineTabElement() {
        return driver.createBaseElement(By.xpath("//li[@label='homeTimelineTab']"));
    }

    public BaseElement getUserTimelineTabElement() {
        return driver.createBaseElement(By.xpath("//li[@label='userTimelineTab']"));
    }

    public BaseElement getPostTweetTabElement() {
        return driver.createBaseElement(By.xpath("//li[@label='postTweetTab']"));
    }

    public TextElement getTweetInputElement() {
        return driver.createTextElement(By.xpath("//textarea[@id='tweetInput']"));
    }

    public BaseElement getPostTweetButtonElement() {
        return driver.createBaseElement(By.xpath("//button[@class='postTweetButton']"));
    }
}
