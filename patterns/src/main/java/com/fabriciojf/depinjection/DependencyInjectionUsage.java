package com.fabriciojf.depinjection;

public class DependencyInjectionUsage {

    private String title;
    private IPostNotification notification;

    public DependencyInjectionUsage(String title, IPostNotification notification) {
        this.title = title;
        this.notification = notification;
    }

    public String getNotify() {
        return(title + ": " + notification.notifying());
    }
}
