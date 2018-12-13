package com.tulun.src3;

/**
 * @author:liguozheng
 * @Date:2018/11/28
 * @time:18:56
 * @description:
 */

import java.io.*;
import java.util.*;

/**
 * 缓存
 */
@SuppressWarnings("all")
public class IODome2 {

    public static void main(String[] args) {

        String path1 = "/Users/liguozheng/Documents/Linux/ok.txt";
        String path2 = "/Users/liguozheng/Documents/Linux/nibuhao.txt";

        findSame(path1,path2);
        find(BufferReader("/Users/liguozheng/Documents/Linux/test.txt"));

        String path = "/Users/liguozheng/Documents/Linux/test1.txt";

        bufferInputStream(path);


    }

    public static void bufferInputStream(String path){

        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            //标记当前位置
            //bufferedInputStream.mark(14);
            //重置标记位置
            //bufferedInputStream.reset();
            //判断是否支持标记
            //bufferedInputStream.markSupported();

            //读
            int len;
            long start = System.currentTimeMillis();
            while ((len = bufferedInputStream.read())!=-1){
                System.out.print((char)len);
            }

            System.out.println();
            System.out.println();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void bufferOutPut(String path){

        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));
            bufferedOutputStream.write(23);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> BufferReader(String path){

        ArrayList<String> arrayList = new ArrayList();
        FileReader fileReader = null;
        BufferedReader bufferedOutputStream = null;

        try {
            fileReader = new FileReader(path);
            bufferedOutputStream = new BufferedReader(fileReader);
           String s;
            while ((s = bufferedOutputStream.readLine())!=null){
                arrayList.add(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static void findSame(String path1,String path2){

        ArrayList<String> arrayList1 = BufferReader(path1);
        ArrayList<String> arrayList2 = BufferReader(path2);
        HashSet<String> arrayList = new HashSet<>();

        for (String s1 : arrayList1){

            if (arrayList2.contains(s1)){
                arrayList.add(s1);
            }
        }

        System.out.println(arrayList);
    }

    public static void find(ArrayList<String> arrayList){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (String s : arrayList){
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {

                if (Character.isDigit(s.charAt(i))){
                    temp = temp*10+((int)s.charAt(i))-48;
                }else {
                    if (!Character.isDigit(s.charAt(i-1))){
                        break;
                    }
                    if (!hashMap.containsKey(temp)){
                        hashMap.put(temp,1);
                    }else {
                        hashMap.put(temp, hashMap.get(temp)+1);
                    }
                    temp = 0;
                }
            }
        }

        Comparator<Map.Entry<Integer,Integer>> comparator = (o1,o2)->o2.getValue()-o1.getValue();
        ArrayList<Map.Entry<Integer,Integer>> arrayList1 = new ArrayList();
        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){
            arrayList1.add(iterator.next());
        }

        Collections.sort(arrayList1,comparator);
        for (Map.Entry<Integer,Integer> map : arrayList1){
            System.out.println(map.getKey()+" :" +map.getValue());
        }
    }


}
