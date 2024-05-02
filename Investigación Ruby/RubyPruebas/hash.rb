# Crear un hash vacío
mi_hash = {}

# Agregar elementos al hash
mi_hash["nombre"] = "Juan"
mi_hash["edad"] = 30
mi_hash["ciudad"] = "Madrid"

# Acceder a los valores mediante las claves
puts "Nombre: " + mi_hash["nombre"]
puts "Edad: " + mi_hash["edad"].to_s  # Es importante convertir la edad a cadena (string)
puts "Ciudad: " + mi_hash["ciudad"]

# Modificar un valor existente
mi_hash["edad"] = 31

# Eliminar un par clave-valor
mi_hash.delete("ciudad")

# Verificar si una clave existe en el hash
if mi_hash.key?("nombre")
  puts "La clave 'nombre' existe en el hash."
end

# Iterar a través de las claves y valores del hash
mi_hash.each do |clave, valor|
  puts "Clave: #{clave}, Valor: #{valor}"
end