package weld.listeners;

import weld.api.ListTimezoneDB;

import javax.enterprise.event.Observes;

public class ListTimezoneDBListener {
    public void perform (@Observes ListTimezoneDB listTimezoneDB) {
        System.out.println(String.format("%s%s?key=%s", listTimezoneDB.host(), listTimezoneDB.path(), listTimezoneDB.token()));
    }
}
