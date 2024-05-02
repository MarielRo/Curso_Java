#mariel

# string
# variables de escape
=begin
\\: Representa un carácter de barra invertida ("") en la cadena de texto.
\": Representa una coma doble ("") en la cadena de texto.
\': Representa una coma simple (') en la cadena de texto.
\n: Representa un carácter de nueva línea. Provoca un salto de línea en el texto.
\t: Representa un carácter de tabulación.
\r: Representa un retorno de carro, que puede ser útil en sistemas donde se utiliza para regresar al principio de una línea.
\b: Representa un carácter de retroceso, que se utiliza para mover el cursor hacia atrás una posición.
\f: Representa un carácter de avance de página (avance de formulario).
\v: Representa un carácter de tabulación vertical.
\s: Representa un espacio en blanco.
=end
# espacios en blanco

puts "Hola" + "Mundo"
puts "Hola\s" + "Mundo"
puts "Hola " * 3
puts "Una cadena con un carácter de nueva línea:\nSegunda línea"
puts "Una cadena con una comilla doble: \"Texto entre comillas\""
puts 'Una cadena con una comilla simple: \'Texto entre comillas\''
puts "Una cadena con un tabulador:\tTexto después del tabulador"
puts "Una cadena con un carácter de retroceso: texto\bborrado"

cadena = "Mariel"
puts "El largo de la cadena es de: #{cadena.length}"
puts "Cadena en reversa:  #{cadena.reverse}"
puts "Cadena en mayúscula:  #{cadena.upcase}"
puts "Cadena en mimuscula:  #{cadena.downcase}"
puts "Cadena cambiada de mayusculas a minuculas y viceversa:  #{cadena.swapcase}"
puts "`Primer letra en mayúscula:  #{cadena.capitalize}"
puts "Mostrar parte de la cadena:  #{cadena.slice(0,4)}"