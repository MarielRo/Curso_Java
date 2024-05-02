#mariel

# Inicializamos una lista vacía para almacenar las tareas.
tareas = []

# Definimos un método para mostrar el menú.
def mostrar_menu
  puts "\n--- Lista de Tareas ---"
  puts "1. Agregar tarea"
  puts "2. Marcar tarea como completada"
  puts "3. Ver lista de tareas"
  puts "4. Salir"
  print "Elige una opción: "
end

# Definimos un método para agregar una tarea a la lista.
def agregar_tarea(lista)
  print "Ingresa la nueva tarea: "
  tarea = gets.chomp
  lista << { tarea: tarea, completada: false }
  puts "Tarea agregada: #{tarea}"
end

# Definimos un método para marcar una tarea como completada.
def marcar_completada(lista)
  puts "Lista de tareas pendientes:"
  lista.each_with_index do |tarea, index|
    puts "#{index + 1}. #{tarea[:tarea]} (Completada: #{tarea[:completada] ? 'Sí' : 'No'})"
  end
  print "Ingrese el número de tarea a marcar como completada: "
  tarea_idx = gets.chomp.to_i - 1
  if tarea_idx >= 0 && tarea_idx < lista.length
    lista[tarea_idx][:completada] = true
    puts "Tarea marcada como completada: #{lista[tarea_idx][:tarea]}"
  else
    puts "Índice de tarea inválido."
  end
end

# Ciclo principal del programa.
loop do
  mostrar_menu
  opcion = gets.chomp.to_i

  case opcion
  when 1
    agregar_tarea(tareas)
  when 2
    marcar_completada(tareas)
  when 3
    puts "\n--- Lista de Tareas Pendientes ---"
    tareas.each_with_index do |tarea, index|
      puts "#{index + 1}. #{tarea[:tarea]} (Completada: #{tarea[:completada] ? 'Sí' : 'No'})"
    end
  when 4
    puts "¡Hasta luego!"
    break
  else
    puts "Opción inválida. Por favor, elige una opción válida."
  end
end