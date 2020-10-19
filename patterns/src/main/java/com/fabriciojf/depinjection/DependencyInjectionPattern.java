package com.fabriciojf.depinjection;

/**
 * Example of Dependency Injection
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class DependencyInjectionPattern 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class DependencyInjectionPattern {

    private IPostNotification notification;

    /**
     * Injection of IPostNotification
     * @param notification
     */
    public DependencyInjectionPattern(IPostNotification notification) {
        this.notification = notification;
    }

    public String getNotify() {
        return notification.notifying();
    }   
    
}
