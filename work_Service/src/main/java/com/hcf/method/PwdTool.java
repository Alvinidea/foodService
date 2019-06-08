package com.hcf.method;


import java.nio.charset.Charset;

public class PwdTool {

    private static final String keys= "FECOI()*&<MNCXZPKL";
    private static final Charset charset = Charset.forName("UTF-8");
    private static byte[] keyBytes = keys.getBytes(charset);
    private static byte[] operateCode(byte[] b)
    {
        for (int i = 0, size = b.length; i < size; i++) {
            for (byte key : keyBytes) {
                b[i] = (byte) (b[i] ^ key);
            }
        }
        return b;
    }
    //密码加密
    public static String encode(String enc) {
        byte[] b = enc.getBytes(charset);
        operateCode(b);
        return new String(b);
    }
    //密码解密
    public static String decode(String dec) {
        byte[] e = dec.getBytes(charset);
        operateCode(e);
        return new String(e);
    }

}
