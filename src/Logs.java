// Write a method `getUniqueIpAddresses` which accepts a path to `log.txt`
// as a parameter and returns an array of unique IP addresses.
// Write a method `getRequestRatio` which accepts a path to `log.txt`
// as a parameter and returns the ratio of GET to POST requests.
// If the specified file cannot be found the methods should return an empty
// array and 0.0 respectively (and raise no errors).

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Logs {
    public static void main(String[] args){
        System.out.println(String.join(System.lineSeparator(), getUniqueIpAddresses("src/resources/log.txt")));
        System.out.println(getRequestRatio("src/resources/log.txt"));
    }

    public static String[] getUniqueIpAddresses(String file) {
        List<String> result = new ArrayList<>();
        List<String> content = new ArrayList<>();
        Path filePath = Paths.get(file);
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            return new String[0];
        }
        HashMap<String, Integer> ips = new HashMap<>();
        for (String line: content) {
            String ip = line.substring(line.indexOf(".") - 2, line.lastIndexOf(".") + 3);
            if (ips.containsKey(ip))
                ips.put(ip, ips.get(ip) + 1);
            else
                ips.put(ip, 1);
        }
        for (String ip: ips.keySet()) {
            if (ips.get(ip) == 1)
                result.add(ip);
        }
        return result.toArray(new String[0]);
    }

    public static double getRequestRatio(String file) {
        Path filePath = Paths.get(file);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            return 0.0;
        }
        HashMap<String, Integer> requests = new HashMap<>();
        for (String line: content) {
            String req = line.substring(line.length() - 6, line.length() - 1).trim();
            if (requests.containsKey(req))
                requests.put(req, requests.get(req) + 1);
            else
                requests.put(req, 1);
        }
        return (double) requests.get("GET") / requests.get("POST");
    }
}