#mariel
#
# Crear un array para almacenar las tareas pendientes
tareas_pendientes = []

# Bucle para el menú de la aplicación
loop do
  puts "¡Gestión de Tareas Pendientes!"
  puts "1. Agregar tarea"
  puts "2. Ver tareas pendientes"
  puts "3. Salir"
  print "Selecciona una opción: "
  opcion = gets.chomp.to_i

  case opcion
  when 1
    print "Ingrese una nueva tarea: "
    tarea = gets.chomp
    tareas_pendientes << tarea
    puts "Tarea agregada con éxito."
  when 2
    puts "Tareas pendientes:"
    tareas_pendientes.each_with_index { |tarea, index| puts "#{index + 1}. #{tarea}" }
  when 3
    puts "Saliendo de la aplicación. ¡Hasta luego!"
    break
  else
    puts "Opción no válida. Por favor, elige una opción válida."
  end
  end