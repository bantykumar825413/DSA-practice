import java.util.*;

public class Solution {

    public static void main(String[] args) {

        String pattern =
        "^((25[0-5]|2[0-4]\\d|1\\d\\d|0?\\d\\d?)\\.){3}" +
        "(25[0-5]|2[0-4]\\d|1\\d\\d|0?\\d\\d?)$";

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String ip = sc.nextLine();
            System.out.println(ip.matches(pattern));
        }

        sc.close();
    }
}
