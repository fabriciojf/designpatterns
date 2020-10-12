package com.fabriciojf;

import com.fabriciojf.depinjection.DependencyInjectionUsage;
import com.fabriciojf.depinjection.PostNotificationImpl;
import com.fabriciojf.factory.LanguageEnum;
import com.fabriciojf.factory.LanguageFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String newLine = System.lineSeparator();
    	String doubleLine = newLine + newLine;
    	
    	StringBuilder output = new StringBuilder();  
    	DependencyInjectionUsage injection = new DependencyInjectionUsage("New Dependency", new PostNotificationImpl());
    	
    	output.append("-> Design Patterns")
    		.append(newLine)    		
    		.append("Dependency Injection Example")    		
    		.append(newLine)
    		
    		.append(injection.getNotify())        
    		.append(doubleLine)
    		
    		.append("-> Factory Example")    		
    		.append(newLine)
    		
    		.append("English greetings: ")
    		.append(LanguageFactory.greetings(LanguageEnum.ENGLISH))
    		.append(newLine)
    		
    		.append("Portuguese greetings : ")
    		.append(LanguageFactory.greetings(LanguageEnum.PORTUGUESE))
    		.append(newLine)
    		
    		.append("Spanish greetings: ")
    		.append(LanguageFactory.greetings(LanguageEnum.SPANISH))
    		.append(newLine);
    	
    		System.out.println(output.toString());
    }   
    
}
