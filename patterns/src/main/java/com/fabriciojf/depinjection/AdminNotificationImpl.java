package com.fabriciojf.depinjection;

/**
 * Admin implementation of PostNotification 
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class AdminNotificationImpl 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class AdminNotificationImpl implements IPostNotification {
    
	@Override
    public String notifying() {
        return "Notifying Admins!";
    }
}