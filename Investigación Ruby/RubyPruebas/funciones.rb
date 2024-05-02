# methods
# variables globales
numero = 5
num = 30

def saludar
  num = 10 # variables locales
  puts "Hola"
end

# ejec methods
print "Ejecutar método saludar "
saludar

# metodo con parametros
def suma(a, b)
  result = a + b
  return result
end

# Ejecutar método
num1 = 5
num2 = 3

result = suma(num1, num2)
puts "La suma de #{num1} y #{num2} es:  #{result}"

