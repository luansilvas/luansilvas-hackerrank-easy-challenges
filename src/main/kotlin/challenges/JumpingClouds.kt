package challenges

fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var index = 0
    var jumps = 0


    while (index < c.size) {
        if (index < c.size - 2) {
            if (c[index + 2] == 0) {
                println("pulando dois hein")
                index += 2
                jumps +=1
            } else {
                println("pulando um hein")
                index += 1
                jumps +=1
            }

        } else {
            index += 1
        }


    }

    return jumps
}