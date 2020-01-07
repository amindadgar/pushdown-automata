import java.lang.Exception
import kotlin.system.exitProcess

fun main(){
    println("please enter input data")
    val data = readLine()!!.toCharArray()
    val stack = PDA()
    try {
        if (data[0] == '0'){
            var i =0
            print("State: Q0")
            while (data[i] == '0'){
                stack.PushtoStack('A') //if we see 0 in input we will push 'A' to our Stack
                print(" Q1")
                i++
            }
            if (data[i] == '1'){
                print(" Q2")
                i++
            }else {
                println("The input was rejected!")
                println("we're not in the final state!")
                exitProcess(-1)
            }
            if (data[i] == '1'){  // for 2 time we will see 1 in input but we won't pop anything from stack (because 1 should come two time more than 0 )
                print(" Q3")
                i++
            }else {
                println("The input was rejected!")
                println("we're not in the final state")
                exitProcess(-1)
            }
            if (data[i] == '1'){
                var stackValue :Char?=null
                    while (data[i] == '1'){
                        print(" Q4")
                        stackValue = stack.PopFromStack()
                        if (stackValue == 'z') {    // if we see 'z' in stack we will understand that 1 is two time more than 0 and we will be finished !
                            print(" Q5(Final State)")
                            exitProcess(1)
                        }else if (stackValue != 'A'){
                            println("The input was rejected!")
                            exitProcess(-1)
                        }
                        i++
                    }
                    print("\nThe input was rejected!")
                    println("we're not in the final state")
                    exitProcess(-1)
            }

        }else {
            println("\nThe input was rejected!")
            println("we're not in the final state")
        }
    }catch (ex:Exception){
        println("\nThe input was rejected!")
        println("we're not in the final state")
    }
}