# Bool contiene los valores de True y False
# Los tipos numéricos, es false para el 0 (cero), true para los demás valores
valor = 0
resultado = bool(valor)
print(f' valor: {valor}, Resultado: {resultado}')

valor = 0.1
resultado = bool(valor)
print(f' valor: {valor}, Resultado: {resultado}')


# Tipo string - false '', true demás valores
valor = ''
resultado = bool(valor)
print(f' valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f' valor: {valor}, Resultado: {resultado}')

#Tipo colecciones - false para colecciones vacias
#Tipo colecciones -  true para todas la demas
#Lista
valor = []
resultado = bool(valor)
print(f' valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2, 3, 5]
resultado = bool(valor)
print(f' valor de una lista con elementos: {valor}, Resultado: {resultado}')

#Tupla
valor = ()
resultado = bool(valor)
print(f' valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f' valor de una tupla con elementos: {valor}, Resultado: {resultado}')

#Diccionario
valor = {}
resultado = bool(valor)
print(f' valor de un diccionario vacio: {valor}, Resultado: {resultado}')

valor = {"nombre": "Juan", "apellido": "Perez"}
resultado = bool(valor)
print(f' valor de un diccionario con elementos: {valor}, Resultado: {resultado}')
