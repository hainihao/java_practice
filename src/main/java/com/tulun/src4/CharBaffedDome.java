package com.tulun.src4;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * @author:liguozheng
 * @Date:2018/12/1
 * @time:11:13
 * @description:
 */

public class CharBaffedDome {

    public static void main(String[] args) throws CharacterCodingException {
        String path = "/Users/liguozheng/Documents/Linux/test.txt";
       // inPut(path);
        CharsetDome();
    }

    public static void inPut(String path){

        File file = new File(path);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path));
           // InputStreamReader inputStreamReader1 = new InputStreamReader(inputStreamReader);
            Charset charset = Charset.defaultCharset();
            SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();
            Iterator<Charset> iterator = stringCharsetSortedMap.values().iterator();
            while (iterator.hasNext()){
                Charset next = iterator.next();
                System.out.println(next);
            }
            System.out.println();
            System.out.println(stringCharsetSortedMap.size());
            System.out.println();
            System.out.println(charset);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void CharsetDome() throws CharacterCodingException {

        String s = "utf-8";
        Charset charset = Charset.forName(s);
        CharsetEncoder charsetEncoder = charset.newEncoder();
        CharsetDecoder charsetDecoder = charset.newDecoder();
        CharBuffer nihaoa = CharBuffer.wrap("挖到一枚afsfafsa");
        ByteBuffer encode = charsetEncoder.encode(nihaoa);
        System.out.println(encode);

        CharBuffer decode =  charsetDecoder.decode(encode);
        String string = decode.toString();
        System.out.println(string);
    }
}
