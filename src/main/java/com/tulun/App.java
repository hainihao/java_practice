package com.tulun;


import java.io.File;
import java.util.ArrayList;

import static com.tulun.src2.Pric.isSame;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        String a = "aabbccc";
        String b = "";
        String same = isSame(a,b);

        System.out.println(same);
    }

    public static void printTree(ArrayList<File> arrayList){

        String s = "";
        for (File file : arrayList){
            if (!file.getParent().equals(s)){

                String same = isSame(s, file.getPath());

                if (same==null){
                    System.out.println(file.getPath());
                    s = file.getParent();
                }else {
                    StringBuilder b =new StringBuilder();
                    for (int i = 0;i<s.length();i++){
                        b.append(' ');
                    }
                    b.append('/');
                    String s1 = file.getPath().replaceAll(same, b.toString());
                    System.out.println(s1);
                    s = file.getParent();
                }
            }else {
                StringBuilder b =new StringBuilder();
                for (int i = 0;i<s.length();i++){
                    b.append(' ');
                }
                String s1 = file.getPath().replaceAll(s, b.toString());
                System.out.println(s1);
            }
        }

    }


}

