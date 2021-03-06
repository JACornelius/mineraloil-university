package com.lithium.mineraloil.university;

import com.lithium.mineraloi.university.TimelineController;
import com.lithium.mineraloi.university.browser.BaseUITest;
import javafx.animation.Timeline;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimelineTest extends BaseUITest {

    @DisplayName("successful get userTimeline by clicking the button")
    @Test
    void SuccessfulGetUserTimelineButtonTest() {
        TimelineController controller = new TimelineController();
        controller.clickUserTimelineTab();
        controller.clickUserTimelineButton();
        Assertions.assertThat(controller.getUserTimelineString()).isNotEmpty();
    }

    @DisplayName("successful get homeTimeline by clicking the button")
    @Test
    void SuccessfulGetHomeTimelineButtonTest() {
        TimelineController controller = new TimelineController();
        controller.clickHomeTimelineTab();
        controller.clickHomeTimelineButton();
        Assertions.assertThat(controller.getHomeTimelineString()).isNotEmpty();
    }

    @DisplayName("successful filter by clicking the button")
    @Test
    void SuccessfulFilterButtonTest() {
        TimelineController controller = new TimelineController();
        controller.clickHomeTimelineButton();
        String homeTimeline = controller.getHomeTimelineString();
        String homeTimelineSplit[] = homeTimeline.split("\n");
        String latestTweet = homeTimelineSplit[3];
        controller.typeFilterInput(latestTweet);
        controller.clickFilterButton();
        String filteredHomeTimeline = controller.getHomeTimelineString();
        String filteredHomeTimelineSplit[] = filteredHomeTimeline.split("\n");
        Assertions.assertThat(latestTweet == filteredHomeTimelineSplit[3]);
    }

    @DisplayName("unsuccesful filter by clicking the button")
    @Test
    void UnsuccessfulFilterButtonTest() {
        TimelineController controller = new TimelineController();
        controller.clickHomeTimelineButton();
        controller.typeFilterInput("324723974927492");
        controller.clickFilterButton();
        String result = controller.getHomeTimelineString();
        Assertions.assertThat(result == "No tweets available, post a tweet!");
    }

    @DisplayName("successful post tweet and is updated in home timeline")
    @Test
    void SuccessfulPostTweetToHomeTLTest() {
        TimelineController controller = new TimelineController();
        controller.clickPostTweetTab();
        controller.typeTweetInput("testing tweet input");
        controller.clickPostTweetButton();
        controller.clickHomeTimelineTab();
        controller.clickHomeTimelineButton();
        String recentHomeTimeline = controller.getHomeTimelineString();
        String recentHomeTimelineSplit[] =  recentHomeTimeline.split("\n");
        Assertions.assertThat("testing tweet input" == recentHomeTimelineSplit[3]);
    }

    @DisplayName("successful post tweet and is updated in user timeline")
    @Test
    void SuccessfulPostTweetToUserTLTest() {
        TimelineController controller = new TimelineController();
        controller.clickPostTweetTab();
        controller.typeTweetInput("testing tweet input");
        controller.clickPostTweetButton();
        controller.clickUserTimelineTab();
        controller.clickUserTimelineButton();
        String recentUserTimeline = controller.getUserTimelineString();
        String recentUserTimelineSplit[] =  recentUserTimeline.split("\n");
        Assertions.assertThat("testing tweet input" == recentUserTimelineSplit[3]);
    }

}