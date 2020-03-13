package Lecture12;

public class Url {
    public static void main(String[] args) {
        String userString = "http://someservername/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println("Server name: " + getServerName(userString));
    }

    public static String getServerName(String userString) {
        int firstIndex = userString.indexOf("://") + 3;
        int lastIndex = userString.indexOf("/", firstIndex);

        if (lastIndex != -1) {
            return userString.substring(firstIndex, lastIndex);
        }

        return userString.substring(firstIndex);
    }
}
