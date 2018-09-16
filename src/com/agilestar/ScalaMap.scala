package com.agilestar

/**
 * Map是一种可迭代的键值对<br>
 * 
 * @author Administrator
 */
object ScalaMap {
  
  def main(args:Array[String]){
    
    //1.创建map并添加键值对
    
    //创建一个空的map a 键为字符类型，值为 整型
    var a : Map[Char,Int] = Map()
    //对map增加key->value,使用 + 号
    a = a + ('A' -> 0)
    a = a + ('B' -> 1)
    a = a + ('C' -> 2)
    a = a + ('D' -> 3)
    println(a)
    
    //创建map并给定初始键值对
    var b :Map[String,String] = Map("name" -> "xiacj","sex" -> "male")
    println(b)
    
    //2.map的基本操作
    //2.1返回map的所有键
    var keys = b.keys
    println(keys)
    
    //2.2返回map的所有值
    var vals = b.values
    println(vals)
    
    //2.3判断map是否为空
    var empty = b.isEmpty
    println(empty)
    
    
    //3.map合并  ++ 运算符号,会合并key
    var p1 = Map("name" -> "xiacj","sex" -> "male");
    var p2 = Map("name" -> "zhangsan","sex" -> "female");
    var p3 = p1 ++ p2;
    println("p1 ++ p2="+p3);   
    var p4 = p2 ++ p1
    println("p2 ++ p1="+p3);  
    
    var p5 = p1.++(p2);
    println("p1.++(p2)="+p5);
    var p6 = p2.++(p1);
    println("p2.++(p1)="+p6);
    
    //4.迭代输出map的key value
    p1.keys.foreach(key =>{
      print("key="+key+",")
      print("value="+p1(key))
      println()
    })
    
    //5.查看map中是否存在指定的key
    println(p1.contains("name"))
    
  }
 
}