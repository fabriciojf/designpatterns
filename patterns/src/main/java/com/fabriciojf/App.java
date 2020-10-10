package com.fabriciojf;

import com.fabriciojf.depinjection.DependencyInjection;
import com.fabriciojf.depinjection.PostNotificationImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DependencyInjection injection = new DependencyInjection("New Dependency", new PostNotificationImpl());
        injection.show();
    }
}
