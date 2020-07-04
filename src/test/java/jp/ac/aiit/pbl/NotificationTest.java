package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NotificationTest {
    
    @Test
    public void canGetNotification0() {
        assertThat(Notification.Notification0, is(Notification.getNotificationContent(0)));
    }
    @Test
    public void canGetNotification101() {
        assertThat(Notification.Notification101, is(Notification.getNotificationContent(101)));
    }
    @Test
    public void canGetNotification102() {
        assertThat(Notification.Notification102, is(Notification.getNotificationContent(0)));
    }
    @Test
    public void canGetNotification103() {
        assertThat(Notification.Notification103, is(Notification.getNotificationContent(101)));
    }
    @Test
    public void canGetNotification104() {
        assertThat(Notification.Notification104, is(Notification.getNotificationContent(104)));
    }
    @Test
    public void canGetNotification105() {
        assertThat(Notification.Notification105, is(Notification.getNotificationContent(105)));
    }
    @Test
    public void canGetNotification107() {
        assertThat(Notification.Notification107, is(Notification.getNotificationContent(107)));
    }
    @Test
    public void canGetNotification109() {
        assertThat(Notification.Notification109, is(Notification.getNotificationContent(109)));
    }
    @Test
    public void canGetNotification110() {
        assertThat(Notification.Notification110, is(Notification.getNotificationContent(110)));
    }
}