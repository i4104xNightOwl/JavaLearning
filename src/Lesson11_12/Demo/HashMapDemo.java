package Lesson11_12.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");

        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Ho Chi Minh City");
        System.out.println("List of cities in hashMapCity: ");

        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNg: " + hashMapCity.get("QNg"));
        System.out.println("NT: " + hashMapCity.get("NT"));

        if (hashMapCity.containsValue("Ho Chi Minh City")) {
            System.out.println("There is Ho Chi Minh City in hashMapCity");
        }
    }
}
