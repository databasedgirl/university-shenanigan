'''
Entregar os dois algoritmos abaixo resolvidos em Python. Cada um correto vale 0,5 ponto. Para fazer os algoritmos observe que um número é múltiplo de 3 se:

numero % 3 == 0

ou seja, se o resto da divisão por 3 é igual a zero.


1) Faça um programa que conte quantos números não são múltiplos de 3 no intervalo de 1 a 100.

2) Faça um programa que some o valor total dos números que não são múltiplos de 3 no intervalo de 1 a 100.

'''

lst = []
for i in range(1,101): # Deve ser 101 ou o resultado de print(i) terá o final 99 ao invés de 100
    if(not i % 3 == 0):
        lst.append(i)

    
print(f'Contagem: {len(lst)}\nSoma: {sum(lst)}') 

# 1) Faça um programa que conte quantos números não são múltiplos de 3 no intervalo de 1 a 100. 
# 2) Faça um programa que some o valor total dos números que não são múltiplos de 3 no intervalo de 1 a 100.