package com.agilestar

/**
 * Scala下滑线用法总结<br>
 * 1._*告诉编译器把参数当做参数序列(可变参数列表)处理<br>
 * 2.在元组中，使用_index,接_1,_2等来访问其组元<br>
 * 3._用来指代集合中的当前元素,用法类似this<br>
 * 4.在模式匹配中想当与java swith case的default
 * 
 * @author Administrator
 */
object UnderlineSummary {
  
  def main(args:Array[String]){
    
    //1._*告诉编译器把参数当做参数序列(可变参数列表)处理
    println(sum(1,2,3,4,5))
    println(sum(1 to 5:_*))
    
    //2.在元组中，使用_index,接_1,_2等来访问其组元
    val tuple = ("xiacj","male","harbin")
    println("name="+tuple._1+",sex="+tuple._2+",addr="+tuple._3)
    
    //3._用来指代集合中的当前元素,用法类似this
    wordCount()
    
    //4._在模式匹配中的作用想当与java switch case中的defalt
    flatMapShow()
    
  }
  
  /**
   * 对可变长参数nums求和函数
   * 
   */
  def sum(nums : Int*)={
    var sum = 0
    for(curr <- nums){
      sum = sum + curr
    }
    sum
  }
  
  def wordCount():Unit={
    val strsMock = List("Hello world","Hello xiacj","Hello tomorrow")
    val cnt = strsMock.flatMap(_.split(" ")).map(x => (x,1))
    println(cnt)
  }
  
  
  /**
   * 模式匹配时_相当于java switch case中的default
   * 
   */
  def flatMapShow():Unit={
    
    val condi = List(1,2,3)
    
    val ret = condi.flatMap(x => x match{
      case 3 => List('a','b')
      case _ => List(x + 2);
    })
    
    println(ret)
    
  }
  
    
}