 object HelloWorld {
   
    
   def main(args: Array[String]) {
      val list = List("abab","cdcb","absg","ddfg")
      val selectedList = list.foldLeft(List(""))((l,w) =>l.flatMap(s=> w.toCharArray.map(s :+ _))) 
      selectedList.foreach(println)
   }
}
