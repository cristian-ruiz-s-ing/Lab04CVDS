# Escuela Colombiana de Ingeniería

## Lab04CVDS

## Integrantes

Crhystian Camilo Molano Chacon

Cristian Camilo Ruiz Santa

## Condiciones de frontera 

### Clase 1: En OriginalScore: Debería decir que el puntaje no puede ser menor que cero

Para que nos diga que el puntaje debe ser mayor o igual a cero, los parámetros de entrada deben ser:

incorrectCount> 10, es decir, que haya ingresado más de 10 letras incorrectas

calculateScore(1, 11) 

### Clase 2: En BonusScore: Debería decir que el puntaje no puede ser menor que cero

Para que nos diga que el puntaje debe ser mayor o igual a cero, los parámetros de entrada deben ser:

correctCount*10 - incorrectCount*5 <= 0, es decir, que la suma de los puntos por las letras correctas no supera o iguala a los puntos por las letras incorrectas

calculateScore(2, 5) 

### Clase 3: En PowerScore: Debería decir el punaje no puede menor que cero

Para que nos diga que el puntaje debe ser mayor o igual a cero, los parámetros de entrada deben ser:

5**(correctCount) - incorrectCount*8 <= 0, es decir, que la suma de los puntos por las letras correctas no supera o iguala a los puntos por las letras incorrectas.

calculateScore(2, 4) 

### Clase 4: En PowerScore: Debería decir el punaje no puede mayor que 500 

Para que nos diga que el puntaje debe ser menor que 500, los parámetros de entrada deben ser:

5**(correctCount) - incorrectCount*8 >= 500, es decir, que la suma de los puntos por las letras correctas menos los puntos por las letras incorrectas superan los 500 puntos.

calculateScore(4, 2) 
 