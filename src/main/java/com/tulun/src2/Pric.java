package com.tulun.src2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author:liguozheng
 * @Date:2018/11/27
 * @time:18:42
 * @description:
 */
@SuppressWarnings("all")
public class Pric {

    public static void main(String[] args) {

        String reader = "/Users/liguozheng/Documents/Linux/nibuhao.txt";
        String wtiter = "/Users/liguozheng/Documents/Linux/ok.txt";
        String s= reader(reader);
        writer(wtiter,s);
    }

    public static void writer(String path,String s){
        FileWriter fileWriter = null;
        try {
            fileWriter  = new FileWriter(path);
            fileWriter.write(s);
      //      fileWriter.append('p');
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static String reader(String path){

        FileReader fileReader = null;
        StringBuilder s= new StringBuilder();

        try {
            fileReader = new FileReader(path);
//            char[] bety = new char[100];
//            fileReader.read(bety);
//            System.out.println(bety);
            int len;
            while ((len = fileReader.read())!=-1){
                s.append((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return s.toString();
    }
}
