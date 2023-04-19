import kotlin.math.pow
import kotlin.math.sqrt
fun main() {

    //ex7(arrayOf(1, 2, 3, 4, 5))

    var matrix1 = arrayOf(intArrayOf(1,2,3,4), intArrayOf(1,2,3,4), intArrayOf(1,2,3,4), intArrayOf(1,2,3,4))
    var matrix2 = arrayOf(intArrayOf(1,2,3,4), intArrayOf(1,2,3,4), intArrayOf(1,2,3,4), intArrayOf(1,2,3,4))
    ex8(matrix1, matrix2)
}



fun main() {

    //ex7(arrayOf(1, 2, 3, 4, 5))

    var matrix1 = arrayOf(intArrayOf(1,2), intArrayOf(3,4),intArrayOf(5,6))
    var matrix2 = arrayOf(intArrayOf(7,8), intArrayOf(9, 10), intArrayOf(11, 12))
    ex9(matrix1, matrix2)
}

fun ex9(matrix1 : Array<IntArray>, matrix2 : Array<IntArray>){
    var result = Array(matrix1.size){ IntArray(4)}
    
    for(i in 0..matrix1.size-1){
        var sumOfRow = 0
        for(y in 0..matrix1[i].size-1){
            
        }
        
    }
    for(i in 0..matrix1.size-1){
        for(y in 0..matrix1[i].size-1){
            print(result[i][y])
        }
    }
}

fun ex8(matrix1 : Array<IntArray>, matrix2 : Array<IntArray>){
    var result = Array(matrix1.size){ IntArray(4)}

    
    for(i in 0..matrix1.size-1){
        for(y in 0..matrix1[i].size-1){
            result[i][y] = matrix1[i][y] + matrix2[i][y]
       
 }
    }
    	
    for(i in 0..matrix1.size-1){
        for(y in 0..matrix1[i].size-1){
            print(result[i][y])
        }
    }
}


fun ex7(lista : Array<Int>){
    var contador = 0
    var media = 0
    for(value in lista){
        media += value
    	contador++
    }
    	
    media = media/contador
    
    var num = media - contador
    
    var smt = (num - media) ** 2
    
    smt = smt * (1/contador)
    
    smt = sqrt(smt)
    println("The standard deviation id $smt")
}

fun ex6(lista : Array<String>){
    for(element in lista)
    	print("$element,")
}

fun ex3(word : String, character :Char){
    var a = 0
    for(c in word){
        if(character.equals(c))
        	a++
    }
    
	println(a) 
    	
}

fun ex4(){
    var a = 1
    for(nums in 1..10){
        a *=nums
        println(a)
    }
}
fun ex5(date : String){
    val finalDate = LocalDate.parse(date)
    println(finalDate)
}