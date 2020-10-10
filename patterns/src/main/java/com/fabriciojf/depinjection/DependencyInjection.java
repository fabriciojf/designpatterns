package com.fabriciojf.depinjection;

public class DependencyInjection {

    private String title;
    private IPostNotification notification;

    public DependencyInjection(String title, IPostNotification notification) {
        this.title = title;
        this.notification = notification;

        System.out.println("Dependency Created " + title);
    }

    public void show() {
        System.out.println("Showing " + title);
        notification.notifying();
    }
}
