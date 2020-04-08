package lectures.basics

/**
 * Everything in scala is an Expression
 */
object Expressions extends App {

  // scala uses if as expression instead of structure

  // first example
  val result1: Int = if (true) 5 else 3
  println(result1) // 5

  // Unit type === void in other languages
  var a = 0
  val result2: Unit = (a = 10)
  println(result2) // ()

  // code block - the value is always the last line of code
  val codeBlock = {
    val a = 10
    if (a > 10) "adult" else "child" // this result will be the value of codeBlock
  }

  println(codeBlock)

}
