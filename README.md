01_
INICIO

    DEFINIR dades COMO ARRAY DE 5 ENTEROS

    PARA i DESDE 0 HASTA 4 HACER
        ESCRIBIR "Introduce un numero:"
        LEER dades[i]
    FIN PARA

    PARA i DESDE 0 HASTA 4 HACER
        ESCRIBIR i, ": ", dades[i]
    FIN PARA

    ESCRIBIR "La longitud es: ", dades

FIN

02_
INICIO

    DEFINIR dades COMO ARRAY DE 6 ENTEROS

    PARA i DESDE 0 HASTA 5 HACER
        ESCRIBIR "Introduce un numero:"
        LEER dades[i]
    FIN PARA

    ESCRIBIR "Ahora los leeremos al reves:"

    PARA i DESDE 5 HASTA 0 HACER
        ESCRIBIR dades[i]
    FIN PARA

    ESCRIBIR "Ahora los leeremos otra vez en el sentido normal:"

    PARA i DESDE 0 HASTA 5 HACER
        ESCRIBIR dades[i]
    FIN PARA

FIN

10_
INICIO

    DEFINIR a[5], b[5], resultado[5] COMO ENTERO

    PARA i = 0 HASTA 4 HACER
        ESCRIBIR "Introduce un numero:"
        LEER a[i]
    FIN PARA

    PARA i = 0 HASTA 4 HACER
        ESCRIBIR "Introduce un numero para b:"
        LEER b[i]
    FIN PARA

    PARA i = 0 HASTA 4 HACER
        resultado[i] = a[i] + b[i]

        ESCRIBIR "El resultado es: ", resultado[i]
    FIN PARA

    PARA i = 0 HASTA 4 HACER
        ESCRIBIR "a: ", a[i],
                 " b: ", b[i],
                 " resultado: ", resultado[i]
    FIN PARA

FIN