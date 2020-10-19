package com.fabriciojf.depinjection;

/**
 * User implementation of PostNotification
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class UserNotificationImpl 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class UserNotificationImpl implements IPostNotification {
    
	@Override	
    public String notifying() {
        return "Notifying Users!";
    }
}