# creacion del arreglo
nombres = ["Juan", "María", "Pedro", "Luisa"]

puts nombres = ["Juan", "María", "Pedro", "Luisa"]

primer_nombre = nombres[0]  # Obtiene el primer nombre (Juan)
segundo_nombre = nombres[1] # Obtiene el segundo nombre (María)

puts "Nombre del indice 0 = #{nombres[0]}"


nombres[2] = "Carlos"  # Cambia el tercer nombre a "Carlos"
puts "Nombre del indice 2 cambiado = #{nombres[2]}"

nombres = ["Juan", "María", "Pedro", "Luisa"]
cantidad = nombres.length # Retorna 4
puts "Cantidad de elementos del arreglo = #{cantidad}"

# funciones de arreglos
nombres = ["Juan", "María"]
nombres.push("Pedro")   # Agrega "Pedro" al final
nombres << "Luisa"    # Otra forma de agregar "Luisa" al final
nombres.pop           # Elimina el último elemento ("Luisa")
nombres.delete_at(0)   # Elimina el primer elemento ("Juan")

