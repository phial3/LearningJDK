# Learning JDK

## 源码阅读

### 第一期
* `ArrayList`:
```java
RandomAccess 接口实现无用
Arrays.asList() 和 Connections.emptyList() 不能直接使用
addAll() 返回值注意点
batchRemove 实现效率低下
```

### 第二期
* `HashMap、ArrayList`等已经继承了`AbstractMap`、`AbstractList`等，为什么还要再次实现`Map`、`List`接口


