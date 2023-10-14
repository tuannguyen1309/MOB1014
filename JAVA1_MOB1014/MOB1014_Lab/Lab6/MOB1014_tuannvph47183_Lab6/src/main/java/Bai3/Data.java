package Bai3;

public class Data {
    public static boolean isEmail(String str) {
        String emailPattern = "\\w+@\\w+(\\.\\w+){1,2}";
        return str != null && str.matches(emailPattern);
    }

    public static boolean isPhone(String str) {
        String phonePattern = "0\\d{9}";
        return str != null && str.matches(phonePattern);
    }

    public static boolean isCMND(String str) {
        String cmndPattern = "\\d{10}";
        return str != null && str.matches(cmndPattern);
    }
}
