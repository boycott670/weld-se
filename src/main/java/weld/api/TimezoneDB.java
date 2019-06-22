package weld.api;

public interface TimezoneDB {
    default String host() {
        return "http://api.timezonedb.com/v2.1/";
    }

    default String token () {
        return "31HJW14G0QZK";
    }

    String path();
}
