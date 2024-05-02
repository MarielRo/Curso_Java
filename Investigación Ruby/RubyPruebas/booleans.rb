#boolenas

valor = 0
puts valor

valor = false
puts valor

valor = true
puts valor

valor = nil
puts valor

# operadores logicos

# &&
# devuelve true si ambas expresiones que conectan son verdaderas.
# Si al menos una de las expresiones es falsa, el resultado es false
a = true
b = false

resultado = a && b
puts resultado # => false

# ||
# devuelve truesi al menos una de las expresiones que conecta es verdadera.
# Si ambas son falsas, el resultado es false
x = true
y = false

resultado = x || y
puts resultado # => true

# !
# Si una expresión es verdadera, !la convierte en falsa y viceversa
 z = true
resultado = !z
puts resultado # => false

# comparaciones
a = 5
b = 10

igual = (a == b)      # Igual a
menor_que = (a < b)   # Menor que
mayor_que = (a > b)   # Mayor que

puts igual       # => false
puts menor_que   # => true
puts mayor_que   # => false