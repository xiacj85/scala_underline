package com.agilestar

/**
 * scala => 符号使用总结<br>
 * 
 * 1.函数的传名调用<br>
 * 
 * @author Administrator
 * 
 */
object EqGt {
  
  def main(args:Array[String]){
  
    //1.函数的传名调用
    
    //call by value 传值调用
    delayed(time)
    /**
     	 输出结果输入下：
     	 
     	   获取时间，单位为纳秒
                        在delayed方法内
                        参数:22576698350378
       
                       传值调用为先计算表达式的值，在进入调用函数内部                 
     */
      
    //call by name 传名调用
    delayedByName(time)
    /**
     	 输出结果输入下：
     	 
     	在delayed方法内
			获取时间，单位为纳秒
			参数:22938208189279
       
                       传名调用为进入函数内部后才调用表达式的值               
     */
    
    def f (x : Int,y : Int) ={
      x + y
    }
    
    val x = (x :Int,y:Int) =>  x + y
    
    println(x(1,2)); 
         
  }
  
  /**
   * 获取纳秒时间
   */
  def time()={
    println("获取时间，单位为纳秒")
    System.nanoTime()
  }
  
  def delayed(t : Long){
    println("在delayed方法内")
    println("参数:"+t)
  }
  
  def delayedByName(t: =>Long){
      println("在delayed方法内")
      println("参数:"+t)
  }
  
  
  
}