public class PhoneNumber {
    private static boolean isNumb(String string) {
        final String numbers = "0123456789";
        for (int i = 0; i < string.length(); i++) {
            if (numbers.indexOf(string.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    public static String convertNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("-", "");

        if (phoneNumber.startsWith("+")) {
            // Формат +<cod><10 numb>
            if (phoneNumber.length() == 12 && isNumb(phoneNumber.substring(1))) {
                String countryCode = phoneNumber.substring(1, 2);
                String numberPart = phoneNumber.substring(2);
                return "+" + countryCode + "-" + numberPart.substring(0, 3) + "-" + numberPart.substring(3, 6) + "-"
                        + numberPart.substring(6);
            }
            // "+104289652211"
            else if (phoneNumber.length() == 13) {
                String countryCode = phoneNumber.substring(1, 3);
                String numberPart = phoneNumber.substring(3);
                return "+" + countryCode + "-" + numberPart.substring(0, 3) + "-" + numberPart.substring(3, 6) + "-" + numberPart.substring(6);
            }
        } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11 && isNumb(phoneNumber.substring(1))) {
            // <8><10 numb>
            String numberPart = phoneNumber.substring(1);
            return "+7-" + numberPart.substring(0, 3) + "-" + numberPart.substring(3, 6) + "-" + numberPart.substring(6);
        }

        return phoneNumber;
    }
}