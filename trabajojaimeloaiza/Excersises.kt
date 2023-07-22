package com.example.trabajojaimeloaiza

import kotlin.math.pow

fun main() {
    var optionMain = ""
    println("Escoja una opcion: \n 1. OPERADORES \n 2. CONDICIONALES \n 3. CICLOS  ")

    optionMain = readln()

    when (optionMain) {
        "1" -> println("${operators()}")
        "2" -> println("${conditionals()}")
        "3" -> println("${cycles()}")
        else -> println("WTF?")
    }

}//end main

fun operators() {
    var optionOperator = ""
    println(
        " 1. Calcular Area del triangulo\n " +
                " 2. Ingresar dos números por teclado y sumarlos.\n " +
                " 3. Ingresar un número y visualizar el número elevado al cuadrado.\n " +
                " 4. Escribir un algoritmo que convierta de euros a dólares.\n " +
                " 5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del\n " +
                "    perímetro.\n " +
                " 6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.\n " +
                " 7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n " +
                "    el área (pi*r)^2 del círculo inscrito.\n " +
                " 8. Calcular el promedio de tres (3) números ingresados por teclado.\n " +
                " 9. Menu principal"
    )

    println("escoja una opcion: ")

    optionOperator = readln()

    when (optionOperator) {
        "1" -> println("${excercises1()}")
        "2" -> println("${excercises2()}")
        "3" -> println("${excercises3()}")
        "4" -> println("${excercises4()}")
        "5" -> println("${excercises5()}")
        "6" -> println("${excercises6()}")
        "7" -> println("${excercises7()}")
        "8" -> println("${excercises8()}")
        "9" -> println("${main()}")
        else -> println("WTF?")

    }

}

fun conditionals() {
    var optionConditionals = ""
    println(
        " 1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo\n " +
                " 2. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el\n " +
                "    menor.\n " +
                " 3. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.\n " +
                " 4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.\n " +
                " 5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero\n " +
                "    no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.\n " +
                " 6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos\n " +
                " 7. Escribir un algoritmo que determine si un año es bisiesto o no.\n " +
                " 8. Menu principal "
    )

    println("escoja una opcion: ")

    optionConditionals = readln()

    when (optionConditionals) {
        "1" -> println("${excercisesC1()}")
        "2" -> println("${excercisesC2()}")
        "3" -> println("${excercisesC3()}")
        "4" -> println("${excercisesC4()}")
        "5" -> println("${excercisesC5()}")
        "6" -> println("${excercises6C()}")
        "7" -> println("${excercises7C()}")
        "8" -> println("${main()}")
        else -> println("WTF?")
    }

}

fun cycles() {
    var optionCycles = ""
    println(
        " 1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.\n" +
                " 2. Imprimir los números impares entre 0 y 100.\n" +
                " 3. Imprimir los números pares del 1 al 100.\n" +
                " 4. Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.\n" +
                " 5. Escribir un programa que sume los cuadrados de los cien primeros números naturales,\n" +
                "    mostrando el resultado en pantalla.\n" +
                " 6. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente.\n" +
                " 7. Sumar todos los números que se digitan por teclado mientras no sea cero \n" +
                " 8. Menu principal"
    )

    println("escoja una opcion: ")

    optionCycles = readln()

    when (optionCycles) {
        "1" -> println("${excercisesCy1()}")
        "2" -> println("${excercisesCy2()}")
        "3" -> println("${excercisesCy3()}")
        "4" -> println("${excercisesCy4()}")
        "5" -> println("${excercisesCy5()}")
        "6" -> println("${excercisesCy6()}")
        "7" -> println("${excercisesCy7()}")
        "8" -> println("${main()}")
        else -> println("WTF?")
    }

}


fun excercises1() {

    println(" OPERADORES EJERCICIO 1")
    println("Ingres  la base")
    val base = readln().toInt()
    println("Ingrese la altura")
    val height = readln().toInt()
    val area = (base * height) / 2
    println("El area es: $area")
    println("${operators()}\n")

}

fun excercises2() {
    println(" OPERADORES EJERCICIO 2 ")
    println("Ingrese el primer numero")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero")
    val num2 = readln().toInt()
    val additionS = num1 + num2
    println("El resultado es: $additionS")
    println("${operators()}\n")
}

fun excercises3() {
    println(" OPERADORES EJERCICIO 3 ")
    println("Digite un numero")
    val num1 = readln().toInt()
    val exponent = 2
    val power = Math.pow(num1.toDouble(), exponent.toDouble())
    println("$power")
    println("${operators()}\n")
}

fun excercises4() {
    println(" OPERADORES EJERCICIO 4 ")
    println("Ingrese la cantidad de EUROS que quiere cambiar")
    val euro = readln().toDouble()
    val dollar = 1.12269.toDouble()
    val change = euro * dollar
    println("$change")
    println("${operators()}\n")
}

fun excercises5() {
    println(" OPERADORES EJERCICIO 5")
    println("Digite el lado de el cuadrado ")
    val side = readln().toDouble()
    val perimeter = side * 4.toDouble()
    val area = side * side.toDouble()
    println("El Area del cuadrado es: $area c y El perimetro del cuadrado es: $perimeter ")
    println("${operators()}\n")
}

fun excercises6() {
    println(" OPERADORES EJERCICIO 6")
    println("Digite el RADIO del cilindro")
    val radius = readln().toDouble()
    println("Digite la ALTURA del cilindro")
    val heigh = readln().toDouble()
    val pi = 3.14
    val area = 2 * pi * radius * (radius + heigh)
    val volume = pi * heigh * radius.toDouble().pow(2)
    println("El AREA del cilindro es: $area  \n El VOLUMEN del cilindro es: $volume ")
    println("${operators()}\n")
}

fun excercises7() {
    println(" OPERADORES EJERCICIO 7")
    println("Digitar el RADIO de la circunferencia")
    val radius = readln().toDouble()
    val pi = 3.14
    val length = 2 * pi * radius
    val area = pi * radius.toDouble().pow(2)
    println("La longitud de la circuferencia es: $length  y  El area de la circuferencia es: $area")
    println("${operators()}\n")
}

fun excercises8() {
    println(" OPERADORES LOGICOS 8")
    println(" Digitar el primer numero")
    val number1 = readln().toInt()
    println(" Digitar el segundo numero")
    val number2 = readln().toInt()
    println(" Digitar el tercer numero")
    val number3 = readln().toInt()
    val average = number1 + number2 + number3 / 3
    println("El PROMEDIO es: $average")
    println("${operators()}\n")

}
/*condicionales*/

fun excercisesC1() {
    println(" CONDICIONALES EJERCICIO 1")
    println("Digite un numero ")
    val number = readln().toInt()
    if (number < 0) {
        println("El numero digitado es negativo")
    } else {
        println("El numero digitado es positivo")
    }
    println("${conditionals()}\n")
}

fun excercisesC2() {
    println(" CONDICIONALES EJERCICIO 2")
    println("Digitar el primer numero ")
    val number1 = readln().toInt()
    println("Digitar el segundo numero ")
    val number2 = readln().toInt()
    if (number1 == number2) {
        println("Los numeros digitados son iguales")
    } else if (number1 < number2) {
        println("El $number1 es menor que $number2")
    } else if (number1 > number2) {
        println("El $number1 es mayor que $number2")
    }
    println("${conditionals()}\n")
}

fun excercisesC3() {
    println(" CONDICIONALES EJERCICIO 3")
    println("Ingrese el primer numero")
    val number1 = readln().toInt()
    println("Ingrese el segundo numero")
    val number2 = readln().toInt()
    println("Ingrese el tercer numero")
    val number3 = readln().toInt()
    if (number1 >= 0 && number2 >= 0 && number3 >= 0) {
        if ((number1 > number2) && (number2 > number3)) {
            println("$number1 es mayor y $number3 es menor")
        } else if ((number1 > number3) && (number3 > number2)) {
            println("$number1 es mayor y $number2 es menor")
        } else if ((number2 > number1) && (number1 > number3)) {
            println("$number2 es mayor y $number3 es menor")
        } else if ((number2 > number3) && (number3 > number1)) {
            println("$number2 es mayor y $number1 es menor")
        } else if ((number3 > number1) && (number2 > number1)) {
            println("$number3 es mayor y $number1 es menor")
        } else if ((number3 > number2) && (number1 > number2)) {
            println("$number3 es mayor y $number2 es menor")
        }
    } else {
        println("WTF")
    }
    println("${conditionals()}\n")
}

fun excercisesC4() {
    println(" CONDICIONALES EJERCICIO 4")
    println("Digite el primer numero")
    val num1 = readln().toInt()
    println("Digite el segundo numero")
    val num2 = readln().toInt()
    if (num1 < num2) {
        val add = num1 + num2
        println("El resultado de la suma es : $add ")
    } else {
        val subtract = num1 - num2
        println("El resultado de la resta es : $subtract ")
    }
    println("${conditionals()}\n")
}

fun excercisesC5() {
    println(" CONDICIONALES EJERCICIO 5")
    println("Digite el primer numero")
    val num1 = readln().toInt()
    println("Digite el segundo numero")
    val num2 = readln().toInt()
    if (num2 > 0) {
        val quotient = num1 / num2
        println("El cociente es: $quotient")
    } else {
        println("La division no es posible")
    }
    println("${conditionals()}\n")
}

fun excercises6C() {
    println(" CONDICIONALES EJERCICIO 6")
    println("Digite el primer numero")
    val num1 = readln().toInt()
    println("Digite el segundo numero")
    val num2 = readln().toInt()
    if (num1 < 0 || num2 < 0) {
        val addition = num1 + num2
        println("El resultado de la suma es: $addition ")
    } else {
        val multiplication = num1 * num2
        println("El resultado de la multiplicacion es:  $multiplication ")
    }
    println("${main()}\n")
}

fun excercises7C() {
    println(" CONDICIONALES EJERCICIO 7")
    println("Digite el año que quiere averiguar")
    val years = readln().toInt()

    if (years / 400 == 0) {
        println(" El año $years es bisiesto ")
    } else if (years / 4 == 0 || years / 100 == 0) {
        println(" El año $years es bisiesto ")
    } else {
        println("El año $years no es un año bisiesto")
    }
    println("${conditionals()}\n")
}

/*CICLOS*/

fun excercisesCy1() {
    println(" CICLOS EJERCICIOS 1")
    var i = 0
    while (i < 100) {
        println(i)
        i += 3
    }
    println("${cycles()}\n")
}


fun excercisesCy2() {
    println(" CICLOS EJERCICIOS 2")
    var i = 1
    while (i < 100) {
        println(i)
        i += 2
    }
    println("${cycles()}\n")
}

fun excercisesCy3() {
    println(" CICLOS EJERCICIO 3")
    var i = 0
    while (i < 100) {
        println(i)
        i += 2
    }
    println("${cycles()}\n")
}

fun excercisesCy4() {

    for (i in 1..30) {
        val square = i.toDouble().pow(2)

        println("$i = $square")
    }

}

fun excercisesCy5() {
    var answer = 0
    for (i in 1..100) {
        val square = i.toDouble().pow(2)
        val addition = square + i
        answer = addition.toInt()

    }
    println("la suma de los cuadrados es: $answer")
}

fun excercisesCy6() {
    println(" CICLOS EJERICIOS 6")

    println("Digite el numero menor")
    val numberMinor = readln().toInt()

    println("Digite el numero mayor")
    val numberGreater = readln().toInt()

    if (numberMinor > numberGreater) {
        println("WTF")
    } else {
        for (i in numberMinor..numberGreater) {
            println(i)
        }
    }
    println("${cycles()}\n")
}

fun excercisesCy7() {
    println(" CICLOS EJERICIO 7")
    println("Suma de todos los numeros mimentras no sea 0")
    println("Digite el numero")

    var addition = 0

    while (true) {
        var num1 = readln().toInt()
        if (num1 == 0) {
            break
        }
        addition += num1
    }
    println("la suma de todos los numeros es: $addition")
    println("${cycles()}\n")
}








