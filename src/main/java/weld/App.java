package weld;

import weld.api.ListTimezoneDB;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            container.getBeanManager().fireEvent(new ListTimezoneDB());
        }
    }
}
