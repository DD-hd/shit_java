## 包装类

- 自动装箱和自动拆箱

```java
    // 自动装箱
    Integer inObj = 5;
    // 自动装箱
    Object boolObj = true;
    // 自动拆箱
    int it = intObj;
```

- 所有包装类
  - 包装类 parseXxx(String s) --> 变成相应基本类型
  - 基本类型通过 String.valueOf --> 变成字符串类型

## 处理对象

- toString 是 Object 类里的一个实例方法 -- "自我描述"
- 输出引用类型将调用 toString 方法
- `==`和 equals 的区别
  - equals 有 Object 提供，但 Object.equal 与`==`的作用是相同的，希望采用自定义的相等标准，可重写 equals
