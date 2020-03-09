package Lecture12;

public class Url {
    public static void main(String[] args) {
        String userString = "http://someservername/abcd/dfdf.htm?dfdf=dfdf";

        int firstSlashIndex = userString.indexOf("//");
        String serverAddress = userString.substring(firstSlashIndex + 2);

        if (serverAddress.indexOf("/")>0){
            serverAddress = serverAddress.substring(0,serverAddress.indexOf("/"));
        }

        System.out.println("Server address: " + serverAddress);
    }
}
