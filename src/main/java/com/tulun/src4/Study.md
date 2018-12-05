###fileWrite:
```
   用来写入字符文件的便捷类。此类的构造方法假定默认字符编码和默认字节缓冲区大小都是可接受的。要自己指定这些值，可以先在 FileOutputStream 
   上构造一个 OutputStreamWriter。文件是否可用或是否可以被创建取决于底层平台。特别是某些平台一次只允许一个 FileWriter（或其他文件写入对象）
   打开文件进行写入。在这种情况下，如果所涉及的文件已经打开，则此类中的构造方法将失败。FileWriter 用于写入字符流。要写入原始字节流，
   请考虑使用 FileOutputStream。
```

####继承方式：
```
public class FileWriter extends OutputStreamWriter
```
####构造方法：
```
1.传入一个路径
public FileWriter(String fileName) throws IOException {
    super(new FileOutputStream(fileName));
}

2.根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
public FileWriter(String fileName, boolean append) throws IOException {
    super(new FileOutputStream(fileName, append));
}

3.根据给定的文件名构造一个 FileWriter 对象。
public FileWriter(File file) throws IOException {
    super(new FileOutputStream(file));
}

4.根据给定的 File 对象构造一个 FileWriter 对象。
public FileWriter(File file, boolean append) throws IOException {
    super(new FileOutputStream(file, append));
}

5.构造与某个文件描述符相关联的 FileWriter 对象。
public FileWriter(FileDescriptor fd) {
    super(new FileOutputStream(fd));
}
```

####使用方法
```
public static void printDome(String path){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
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
```
