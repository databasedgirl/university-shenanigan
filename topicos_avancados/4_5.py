# Elabore um programa python que receba um texto e escreva as palavras que não tem a vogal a. Não é repetido repetir a mesma palavra.

# Autor: Databasedgirl
# Repo: https://github.com/databasedgirl/university-shenanigan/blob/main/topicos_avancados/1.py
# Data: 29/04/2025

print("Insira um texto aqui")
inp = input('#> ').lower().replace(',','').split(' ')

dupes = []
for i in range(len(inp)):
    if(not inp[i].__contains__("a")):
        dupes.append(inp[i])


has_item = []
for i in range(len(dupes)):
    if(not has_item.__contains__(dupes[i])):
        has_item.append(dupes[i])


print("\nRESULTADO\n")
print(" ".join(has_item).capitalize())