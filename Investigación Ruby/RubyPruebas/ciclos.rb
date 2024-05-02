contador = 0

while contador < 5
  puts "El contador es #{contador}"
  contador = contador + 1 # contador+=1
end


nombres = ["Mariel","Claudio", "Jose"]

for nombre in nombres
  puts "Hola, #{nombre}!"
end

# Este código imprimirá los números del 1 al 5 utilizando un rango y un bucle each.
# Cada valor del rango se asigna a la variable numeroen cada iteración.
(1..5).each do |numero|
  puts "Número: #{numero}"
end


#solicita al usuario un número positivo y
# #continúa solicitándolo hasta que se ingrese un número válido

loop do
  print "Ingresa un número positivo: "
  numero = gets.chomp.to_i

  if numero > 0
    puts "¡#{numero} es un número positivo!"
    break  # Sale del bucle
  else
    puts "Eso no es un número positivo. Intenta de nuevo."
  end
  end