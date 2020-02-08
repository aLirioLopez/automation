package com.antonio.resources;

import java.util.Random;

public class EmailGenerator {

    public String getEmail() {
        String ablechars = "abcdefghijklmopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder mail = new StringBuilder();
        Random rnd = new Random();
        while (mail.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * ablechars.length());
            mail.append(ablechars.charAt(index));
        }
        String final_mail = mail.toString();
        final_mail = final_mail.concat("@mailinator.com");
        return final_mail;
    }
}
