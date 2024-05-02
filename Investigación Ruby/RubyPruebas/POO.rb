#POO
class Persona
  attr_reader :nombre, :edad # Creates instance variables and corresponding methods that return the value of each instance variable

  def initialize(nombre, edad)
    @nombre = nombre
    @edad = edad
  end

  def presentarse
    puts "Hola, soy #{@nombre} y tengo #{@edad} años."
  end

end

#instancia persona
persona1 = Persona.new("Mariel", 23)
puts persona1.nombre  # Debería imprimir "Mariel"
puts persona1.edad   # Debería imprimir 23

persona1 = Persona.new("Mariel", 23)
persona1.presentarse  # Llamar al método presentarse

# herencia
class Estudiante < Persona #estudiante hereda de la clase persona
  def trabajar
    puts "Soy un estudiante y estoy aprendiendo."
  end
end

Estudiante1 = Estudiante.new("Claudio", 30)
Estudiante1.presentarse
Estudiante1.trabajar

#Polimorfismo
def saludar(persona)
  persona.presentarse #llama al metodo presentarse
end

persona2 = Persona.new("Jose", 30)
estudiante2 = Estudiante.new("Gabi", 35)

saludar(persona2)
saludar(estudiante2)