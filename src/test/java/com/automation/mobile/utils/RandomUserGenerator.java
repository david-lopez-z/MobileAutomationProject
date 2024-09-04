package com.automation.mobile.utils;
import java.util.UUID;

public class RandomUserGenerator {

    public static String generateRandomEmail() {
        String uniqueID = UUID.randomUUID().toString();
        String email = "testuser+" + uniqueID + "@example.com";
        return email;
    }

    public static String generateRandomPassword() {
        String uniqueID = UUID.randomUUID().toString();
        String password = uniqueID.substring(0, 8);
        return password;
    }
}
