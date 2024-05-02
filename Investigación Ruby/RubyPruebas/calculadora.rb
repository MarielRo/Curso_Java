def sumar(a, b)
  return a + b
end

def restar(a, b)
  return a - b
end

def multiplicar(a, b)
  return a * b
end

def dividir(a, b)
  if b != 0
    return a / b
  else
    return "No se puede dividir por cero."
  end
end

loop do
  puts "Calculadora en Ruby"
  print "Ingresa el primer número: "
  num1 = gets.chomp.to_f

  print "Ingresa el operador (+, -, *, /): "
  operador = gets.chomp

  print "Ingresa el segundo número: "
  num2 = gets.chomp.to_f

  case operador
  when '+'
    resultado = sumar(num1, num2)
  when '-'
    resultado = restar(num1, num2)
  when '*'
    resultado = multiplicar(num1, num2)
  when '/'
    resultado = dividir(num1, num2)
  else
    resultado = "Operador no válido."
  end

  puts "Resultado: #{resultado}"

  print "¿Deseas realizar otra operación? (S/N): "
  continuar = gets.chomp.downcase
  break if continuar != 's'
  end