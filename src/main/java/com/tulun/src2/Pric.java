package com.tulun.src2;

import java.io.*;
import java.util.Arrays;

/**
 * @author:liguozheng
 * @Date:2018/11/27
 * @time:18:42
 * @description:
 */
@SuppressWarnings("all")
public class Pric {

    public static void main(String[] args) throws Exception{

        String reader = "/Users/liguozheng/Documents/Linux/nibuhao.txt";
        String wtiter = "/Users/liguozheng/Documents/Linux/ok.txt";
//        String s= reader(reader);
//        writer(wtiter,s);

        File file = new File("./src");

        System.out.println(file.exists());  //判断该路径是否正确

        System.out.println(file.isFile());  //判断该路径是否为文件

        System.out.println(file.isDirectory());   //判断该路径是否为目录

        System.out.println(file.isHidden());      //判断该路径是否为隐藏文件

//        file.deleteOnExit();    //在程序退出时删除
//
     //   file.delete();             //删除文件
//        file.mkdir();
//
//        file.getName();

        File[] files = file.listFiles();
        String[] list = file.list();

        System.out.println(Arrays.toString(list));


        System.out.println(file.length());
        for (File f : files){
            System.out.println(f.getName());
        }

//        System.out.println(file.getAbsolutePath());
//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        searchFile("/Users/liguozheng/Documents/Java","java");
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

    public static void searchFile(String path,String filter) throws Exception{

        File file = new File(path);

        if (!file.exists()){
            throw new Exception("该路径输入错误 ! ! !");
        }

        if (file.listFiles()==null){
            return;
        }
        getFilesList(file,filter);
    }

    public static void getFilesList(File file, String fileName){
        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                if(files!=null){
                    for(File f:files){
                        getFilesList(f,fileName);
                    }
                }
            }else if(file.isFile()){
                if(file.getName().contains(fileName)){
                    System.out.println(file.getPath());
                }
            }
        }
    }
}
