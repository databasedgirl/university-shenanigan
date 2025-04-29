''' 
Entregar os dois algoritmos abaixo resolvidos em Python. Cada um correto vale 0,5 ponto.


1) Faça uma função python que receba uma string e escreva a posição das vogais. Por exemplo, se a função receber Feevale a função deverá escrever: 1 2 4 6

2) Faça uma função python que receba duas strings e escreva as letras que ambas tem em comum. Por exemplo: Feevale e Universidade resultará em: e a v 

'''

# Autor: Databasedgirl
# Repo: https://github.com/databasedgirl/university-shenanigan/blob/main/topicos_avancados
# Data: 29/04/2025


def procura_vogais(v): # 1) Faça uma função python que receba uma string e escreva a posição das vogais. Por exemplo, se a função receber Feevale a função deverá escrever: 1 2 4 6
    vogais = set(["a","e","i","o","u"])
    indexes = []
    lst = list(v)
    for idx,val in enumerate(lst):
        if(vogais.__contains__(val)):
            indexes.append(idx)
    
    return indexes

def encontra_comuns(v, v2): # 2) Faça uma função python que receba duas strings e escreva as letras que ambas tem em comum. Por exemplo: Feevale e Universidade resultará em: e a v 
    return ' '.join(sorted(set(v.lower()) & set(v2.lower())))


print("Insira um texto")
inp = input("#> ")

print("Insira outro texto")
inp2 = input("#> ")



print(f'Index do primeiro input: {procura_vogais(inp)}\nIndex do segundo input {procura_vogais(inp2)}')
print(f'Letras em comum: {encontra_comuns(inp,inp2)}')
