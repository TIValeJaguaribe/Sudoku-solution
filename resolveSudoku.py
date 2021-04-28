subBloco = [[],[],[],[],[],[],[],[],[]]

for l in range(9):
    for c in range(9):
        n = int(input(f"Digite o valor [{l}][{c}] "))
        if n >= 0 and n < 10:
            if l <= 2:
                if c >= 0 and c <= 2:
                    subBloco[0].append(n)
                if c >= 3 and c <= 5:
                    subBloco[1].append(n)
                if c >= 6:
                    subBloco[2].append(n)
            elif l > 2 and l <= 5:
                if c >= 0 and c <= 2:
                    subBloco[3].append(n)
                if c >= 3 and c <= 5:
                    subBloco[4].append(n)
                if c >= 6:
                    subBloco[5].append(n)
            if l > 5 and l <= 8:
                if c >= 0 and c <= 2:
                    subBloco[6].append(n)
                if c >= 3 and c <= 5:
                    subBloco[7].append(n)
                if c >= 6:
                    subBloco[8].append(n)
for i in range(len(subBloco)):
    print(subBloco[i])


# ============  Parte 02 =============
celula = []
while True:
    if 0 not in subBloco:
        break
    else:
        for cont in range(9): 
            for i in range(1,9):
                if i in subBloco[cont]:
                    print(f'{i} faz parte do Sub-bloco {cont}')
                else:
                    for l in range(9):
                        for c in range(9):
                            if i not in subBloco[c]:
                                print(f'{i} NãO está na linha')
                                if i not in subBloco[l]:
                                    print(f'{i} não está na coluna')
                                    break