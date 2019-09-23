- 基本语法

  ```java
  public testError() throws MyExcetion{
      // 声明可能抛出的错误
      throw new MyExcetion("ggg");
      try{
          throw new Exception("123");
      }catch(Exception e){
          //捕获到错误
      }finally{
          //无论抛错与否都执行
      }
  }
  ```
