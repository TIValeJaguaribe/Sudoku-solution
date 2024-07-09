# Sudoku-solution
 Solucao do quebra-cabeça _sudoku_

A Solução está dividida em três partes:
- [x] 1. Preencher na direção Linha/Coluna todos as células do sudoku com problema; Será preenchido os 81 espaços do sudoku 9x9, onde os espaços em branco, colocaremos o 0(zero);
- [x] 2. O programa foi dividido em 09 blocos, que chamei de sub-blocos;
   1. Precisa verificar se o número em analise está no primeiro sub-bloco. Se estiver, deve passar para o próximo número. Caso não...
   2.  Precisa verificar se na posição que está, sua linha não tenha o número. Se estiver, deve passar para o próximo número. Caso não...
   3.  Precisa verificar se na posição que está, sua coluna não tenha o número. Se estiver, deve passar para o próximo número. Caso não...
   4.  Esse númnero precisa entrar em uma lista que podemos chama-lá de célula. O programa terá no maximo 81 células com todas as possibilidades naquela posição pelos números.
- [x] 3. O programa deve varrer todas as posições e verificar se na lista célula possui apenas um número. Caso só exista um número dentro da lista, esse valor deve ocupar aquela posição que antes era 0(zero).

![800px-Sudoku-by-L2G-20050714 svg](https://user-images.githubusercontent.com/22750117/116302643-d287e400-a777-11eb-85a6-565b58016f10.png)
![800px-Sudoku-by-L2G-20050714_solution svg](https://user-images.githubusercontent.com/22750117/116302691-df0c3c80-a777-11eb-8f05-25590d1fc34f.png)
