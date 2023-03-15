import scala.concurrent.duration.Duration.Inf.unit

object SurpriseTestGroupA extends App{
//find a specific character in a string and replace it with another character


  def replaceCharacter(inputstring :StringBuilder, replaceString :Char, findchar :Char) : String ={
    val lengt = inputstring.length
    /*
    val a =  string
    val   replace = t
    array char

     */
      for(a <-length)
        {
          if(inputstring(a)==replaceString) {
            inputstring.replace(inputstring,replaceString)
            inputstring
          }
        }
    
//      def replaceStringmethod(inputString :String ,replaceString :Char ,lengt :Int): Unit = {
//        if(lengt == 0) inputstring
//        else
//          replaceStringmethod()
//      }


    }
  print(replaceCharacter("hello",'p','h'))

}
