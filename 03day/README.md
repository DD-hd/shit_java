- 数组

  - 数组必须初始化，才可以使用
    - 静态初始化
      - 初始化指定各个元素的值,由系统决定数组长度
        ```java
        int[] a={5,6,7,8};
        int[] b=new int[]{5,6,7,8}
        ```
    - 动态初始化
      - 只指定数组的长度，由系统为每个数组元素指定初始值
      - 默认赋值为其类型的零值
        ```java
        int[] a=new int[4];
        ```

- foreach
  ```java
  String[] books={
      "轻量级j2ee企业应用实战",
      "Struct2权威指南",
      "基于J2ee的Ajax宝典"
  }
  for(String book:books){
      System.out.println(book);
  }
  ```
- 二维数组
  ```java
  int [][]a;
  a=new int[3][];
  ```
