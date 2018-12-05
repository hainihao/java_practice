package com.tulun.src4;

import java.io.*;

/**
 * @author:liguozheng
 * @Date:2018/12/2
 * @time:19:33
 * @description:
 */
public class MyStudyDome {

    public static void main(String[] args) {

        String path = "/Users/liguozheng/Documents/Linux/nibuhao.txt";
        printDome(path);
        LineDome(path);
    }

    public static void printDome(String path){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path,true);
            fileWriter.write("wasdkasljdasl dansjndklajs dnjaskndk");
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

    public static void LineDome(String path){

        LineNumberReader lineNumberReader = null;
        try {
            lineNumberReader = new LineNumberReader(new FileReader(path));
            int lineNumber = lineNumberReader.getLineNumber();
            System.out.println(lineNumber);
            String len ;
            while ((len = lineNumberReader.readLine())!=null){
                System.out.println(len);
                int lineNumber1 = lineNumberReader.getLineNumber();
                System.out.println(lineNumber1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                lineNumberReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
