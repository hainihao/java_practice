###LineNumberReader:
```
  跟踪行号的缓冲字符输入流。此类定义了方法 setLineNumber(int) 和 getLineNumber()，它们可分别用于设置和获取当前行号。
  默认情况下，行编号从 0 开始。该行号随数据读取在每个行结束符处递增，并且可以通过调用 setLineNumber(int) 更改行号。
  但要注意的是，setLineNumber(int) 不会实际更改流中的当前位置；它只更改将由 getLineNumber() 返回的值。
  可认为行在遇到以下符号之一时结束：换行符（'\n'）、回车符（'\r'）、回车后紧跟换行符。
  ```
  
  ####继承方式：
  ```
   extends BufferedReader
  ```
  ####构造方法：
  ```
  1.使用默认输入缓冲区的大小创建新的行编号 reader。
  public LineNumberReader(Reader in)
  
  2.创建新的行编号 reader，将字符读入给定大小的缓冲区。
  public LineNumberReader(Reader in,int sz)
  ```
  ####常用方法：
  ```
  1.设置行号：
  public void setLineNumber(int lineNumber) {
          this.lineNumber = lineNumber;
      }
  
  2.得到行号
  public int getLineNumber() {
          return lineNumber;
      }
  
  ```
  ####用法（以getLineNumber()为例）：
  ```
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
  ```
      
      