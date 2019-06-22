package weld.api;

public class ListTimezoneDB implements TimezoneDB {
    @Override
    public String path() {
        return "/list-time-zone";
    }
}
