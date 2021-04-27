from random import randint
bloco = [[],[],[],[],[],[],[],[],[]]

for l in range(9):
    for c in range(9):
        #while True:
            n = randint(1, 9) #int(input(f"Digite o valor [{l}][{c}] "))
            if n >= 0 and n <10:
         #       print(f'Estamos na {l}{c} e o numero é {n}')
          #      break
           # else:
               if n >= 0 and n < 10:
                    if l <= 2:
                        if c >= 0 and c <= 2:
                            bloco[0].append(n)
                        if c >= 3 and c <= 5:
                            bloco[1].append(n)
                        if c >= 6:
                            bloco[2].append(n)
                    if l > 2 and l <= 5:
                        if c >= 0 and c <= 2:
                            bloco[3].append(n)
                        if c >= 3 and c <= 5:
                            bloco[4].append(n)
                        if c >= 6:
                            bloco[5].append(n)
                    if l > 5 and l <= 8:
                        if c >= 0 and c <= 2:
                            bloco[6].append(n)
                        if c >= 3 and c <= 5:
                            bloco[7].append(n)
                        if c >= 6:
                            bloco[8].append(n)
for i in range(len(bloco)):
    print(bloco[i])


# ============  Parte 02 =============

celula = []
#while True:
#    if 0 not in bloco:
#        break
#    else:

for cont in range(9): 
    for i in range(1,9):
        if i in bloco[cont]:
            print(f'{i} faz parte do Bloco {cont}')
        else:
            for l in range(9):
                for c in range(9):
                    if i not in bloco[c]:
                        print(f'{i} NãO está na linha')
                        if i not in bloco[l]:
                            print(f'{i} não está na coluna')
                            break
                        