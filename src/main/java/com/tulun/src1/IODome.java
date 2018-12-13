package com.tulun.src1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author:liguozheng
 * @Date:2018/11/26
 * @time:20:21
 * @description:
 */

public class IODome {

    public static void main(String[] args) {

        File file = new File("/Users/liguozheng/Documents/Linux/test1.txt");
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
////            byte[] bytes = new byte[100];
////            fileInputStream.read(bytes);
////            System.out.println(Arrays.toString(bytes));
            int i ;
            long start = System.currentTimeMillis();
            while ((i = fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
            long end = System.currentTimeMillis();
            System.out.println();
            System.out.println();
            System.out.println(end - start);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
