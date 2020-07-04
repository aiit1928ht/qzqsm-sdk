package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NotificationsOnDisasterPreventionTest {
    
    @Test
    public void canGetNotification0() {
        assertThat(NotificationsOnDisasterPrevention.Notification0, is(NotificationsOnDisasterPrevention.getNotificationContent(0)));
    }
    @Test
    public void canGetNotification101() {
        assertThat(NotificationsOnDisasterPrevention.Notification101, is(NotificationsOnDisasterPrevention.getNotificationContent(101)));
    }
    @Test
    public void canGetNotification102() {
        assertThat(NotificationsOnDisasterPrevention.Notification102, is(NotificationsOnDisasterPrevention.getNotificationContent(0)));
    }
    @Test
    public void canGetNotification103() {
        assertThat(NotificationsOnDisasterPrevention.Notification103, is(NotificationsOnDisasterPrevention.getNotificationContent(101)));
    }
    @Test
    public void canGetNotification104() {
        assertThat(NotificationsOnDisasterPrevention.Notification104, is(NotificationsOnDisasterPrevention.getNotificationContent(104)));
    }
    @Test
    public void canGetNotification105() {
        assertThat(NotificationsOnDisasterPrevention.Notification105, is(NotificationsOnDisasterPrevention.getNotificationContent(105)));
    }
    @Test
    public void canGetNotification107() {
        assertThat(NotificationsOnDisasterPrevention.Notification107, is(NotificationsOnDisasterPrevention.getNotificationContent(107)));
    }
    @Test
    public void canGetNotification109() {
        assertThat(NotificationsOnDisasterPrevention.Notification109, is(NotificationsOnDisasterPrevention.getNotificationContent(109)));
    }
    @Test
    public void canGetNotification110() {
        assertThat(NotificationsOnDisasterPrevention.Notification110, is(NotificationsOnDisasterPrevention.getNotificationContent(110)));
    }
}