# dar formato a un String

nombre = 'Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años' % (nombre, edad)
print(mensaje_con_formato)





nombre = "Juan"
edad = 19
sueldo = 3000
# mensaje_con_formato = 'Nombre {} Edad {} Sueldo {} {:.2f}'.format(nombre, edad, sueldo)

# mensaje = 'Nombre {0} Edad {1} Sueldo{2:.2f}'.format(nombre, edad, sueldo)
# print(mensaje)

# mensaje = 'Sueldo{2:.2f} Edad {1} Nombre {0}'.format(nombre, edad, sueldo)
# print(mensaje)

# mensaje = 'Nombre {n} Edad {e} Sueldo {s:.2f}'.format(n=nombre, e=edad, s=sueldo)
# print(mensaje)

diccionario = {'nombre': 'Ivan', 'edad': 28, 'sueldo': 8000.00}
mensaje = 'Nombre {dic[nombre]} Edad {dic[edad]} Sueldo {dic[sueldo]:.2f}'.format(dic = diccionario)
print(mensaje)