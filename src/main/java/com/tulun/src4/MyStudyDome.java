package com.tulun.src4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author:liguozheng
 * @Date:2018/12/2
 * @time:19:33
 * @description:
 */
public class MyStudyDome {

    public static void main(String[] args) {

        String path = "/Users/liguozheng/Documents/Linux/nibuhao.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write("你是不是傻\n");
            fileWriter.write("yes,you are shabi");
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
}
