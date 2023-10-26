#Manejamos valores infinitos positivo y negativo

infinito_positivo = float('inf') #esta cadena representa el valor de infinito positivo
print(f'infinito positivo:{infinito_positivo}')
print(f'¿Es infinito?: {math.isinf(infinito_positivo)}') #uso del modulo math

#infinito negativo
infinito_negativo = float('-inf')
print(f'infinito negativo:{infinito_negativo}')
print(f'¿Es infinito?:{math.isinf(infinito_negativo)}')

#Modulo math (.inf)
infinito_positivo = math.inf
print(f'infinito positivo:{infinito_positivo}')
print(f'¿Es infinito?: {math.isinf(infinito_positivo)}')

#math negativo
infinito_negativo = math.inf
print(f'infinito negativo:{infinito_negativo}')
print(f'¿Es infinito?:{math.isinf(infinito_negativo)}')

#modulo decimal
infinito_positivo = Decimal('Infinity')
print(f'infinito positivo:{infinito_positivo}')
print(f'¿Es infinito?: {math.isinf(infinito_positivo)}')

#mudulo decimal negativo
infinito_negativo =  Decimal('-Infinity')
print(f'infinito negativo:{infinito_negativo}')
print(f'¿Es infinito?:{math.isinf(infinito_negativo)}')