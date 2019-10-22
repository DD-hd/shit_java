- 元注解
  - @Target 什么类型的声明
  - @Retention 什么级别保存
    - SOURCE: 只在源码保留
    - CLASS: 只保留在 class 文件理，但会被 vm 抛弃
      -RUNTIME: 保留到运行期，通过反射机制读取注解的信息
  - @Document 注解包含在 JavaDoc
  - @Inherited 允许父类继承中的注解
- 自定义注解
  ```java
  @Target(ElementType.FIELD)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Test{
      String name() default '';
      // 未指定键名则赋值给value
      String value()
  }
  ```
  - 注解不支持继承
