package com.tulun.src2;

import java.io.*;
import java.util.ArrayList;
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



//        System.out.println(file.getAbsolutePath());
//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        searchFile("/Users/liguozheng/Documents/Java","java");
    //    printfile(new File("./src"),0);
    }

    public static void writer(String path,String s){
        FileWriter fileWriter = null;
        try {
            fileWriter  = new FileWriter(path);
            fileWriter.write(s);
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
        ArrayList<File> arrayList = new ArrayList();
        getFilesList(file,filter,arrayList);
        printTree(arrayList);
    }

    public static ArrayList<File> getFilesList(File file, String fileName, ArrayList<File> arrayList){

        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                if(files!=null){
                    for(File f:files){
                        getFilesList(f,fileName,arrayList);
                    }
                }
            }else if(file.isFile()){
                if(file.getName().contains(fileName)){
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static void printTree(ArrayList<File> arrayList){

        String s = "";
        for (int i = 0; i <arrayList.size() ; i++) {

            if (i==0){
                s = arrayList.get(i).getParent();
                System.out.println(arrayList.get(i).getPath());
            }else {

                String same = isSame(s, arrayList.get(i).getPath());
                s= arrayList.get(i).getParent();
                String s2 = chengPrint(same);
                String s1 = arrayList.get(i).getPath().replaceAll(same, s2);
                System.out.println(s1);
            }
        }
    }


    public static String isSame(String s1,String s2){

        String l ;
        String s;

        if (s1.length()<=s2.length()){
            s = s1;
            l = s2;
        }else {
            s = s2;
            l = s1;
        }
        StringBuilder s3 = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if (s1.charAt(i)==s2.charAt(i)){
                s3.append(s1.charAt(i));
            }
        }
        return s3.length()==0 ? null: s3.toString();
    }

    public static String chengPrint(String s){

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append('-');
        }
        return stringBuilder.toString();
    }
}
