import java.util.*

class PDA {
    companion object {
        lateinit var myStack :Stack<Char>
    }
    init {
        myStack = Stack()
        myStack.add('z')
    }
    fun PushtoStack(data:Char){
        myStack.push(data)
    }
    fun PopFromStack():Char{
        return myStack.pop()
    }
}