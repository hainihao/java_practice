###IO_5

###io涉及的设计模式：
  ```
   装饰器模式：
        在不改变原有类的的使用和集继承上，动态扩展新的功能，创建包装对象出来也就是将原有类做装饰作用
    适配器模式：
        将不合期望的类或者接口转换成满足要的类或者接口
  ```
###流的规律：
   ```
    操作流需要明确的问题：
    1：操作时进行读还是写
       源：读数据  inPutSteam/reader
       目的：写数据  outputSteam/writer
    2：明确操作的是字节还是字符
       源： 
          字符：Reader
          字节：InputSteam
       目的：
          字符：Writer
          字节：OutputSteam
    3：数据操作在具体设备
       磁盘数据：file
       内存数据：char，array
       键盘：System.in
       网络：socket
    4：是否需要额外功能
       效率考虑：Buff...
       流转换：
   ```