public class ProcessString implements StringFunctions {
    @Override
    public int len(String string) {
        return string.length();
        /*
        int k = 0;
        for (char i : string.toCharArray()) {
            k ++;
        }
        return k;
        */

    }

    @Override
    public String oddChar(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0)
                newString += string.charAt(i);
        }
        return newString;
    }

    @Override
    public String inversionString(String string) {
        String newString = "";
        for (int i = string.length() - 1; i > -1; i--)
            newString += string.charAt(i);
        return newString;
    }
}
