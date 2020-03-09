package Lecture12;

public class Url {
    public static void main(String[] args) {
        String userString = "http://someservername/abcd/dfdf.htm?dfdf=dfdf";

        int firstSlashIndex = userString.indexOf("//");
        String serverName = userString.substring(firstSlashIndex + 2);

        if (serverName.indexOf("/") > 0) {
            serverName = serverName.substring(0, serverName.indexOf("/"));
        }

        System.out.println("Server name: " + serverName);
    }
}
