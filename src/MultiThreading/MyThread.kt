package MultiThreading

fun main(args: Array<String>) {

    var t1 = MyThread("Thread 1")
    t1.start()

    var t2 = MyThread("Thread 2")
    t2.start()

    var t3 = MyThread("Thread 3")
    t3.start()
    t3.join()//stop on this line until t3 is done then continue
    println("Thread operation complete!")
}

class MyThread(): Thread() {

    var threadName:String =""

    constructor(threadName:String):this(){
        this.threadName = threadName
        println("${this.threadName} has started")
    }

    override fun run() {
        var count = 0
        while (count < 10) {
            println("$threadName Count: $count")
            count++

            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }
}