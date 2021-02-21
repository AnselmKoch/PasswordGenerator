package me.marselm.password;

import java.util.concurrent.ThreadLocalRandom;

public class Password {

    public String password = "";
    public String characters = "qwertzuiopasdfghjklyxcvbnm1234567890!§$%&/()=?{[]}´`*~+'#;,:.--<>^°|";
    public int length = 32;
    public char randomChar;

    public Password() {
        while(password.length() < length) {
            while (!password.contains(Character.toString(randomChar = characters.charAt(ThreadLocalRandom.current().nextInt(0, characters.length()))))) {
                password += randomChar;
            }
        }
        System.out.println(password);
    }

}
