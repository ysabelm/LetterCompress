package com.simplon;


public class LetterCompress{
    public static String LetterCompress() {
        String str = new String();
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() == 0) return "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                stringBuffer.append(count);
            }
            stringBuffer.append(str.charAt(i));
        }
        System.out.println("LetterCompress: " + stringBuffer);
        return str;
    }
}

