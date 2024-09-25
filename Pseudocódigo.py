# Pseudocódigo: Lista Encadeada Simples

## Estruturas

Classe No
    dado: inteiro
    proximo: No

Classe ListaEncadeada
    inicio: No

# Funções: 

# Inserir Ordenado:

Função inserirOrdenado(valor: inteiro)
    novoNo = novo No(valor)
    Se inicio é nulo ou valor < inicio.dado
        novoNo.proximo = inicio
        inicio = novoNo
    Senão
        atual = inicio
        Enquanto atual.proximo não é nulo E atual.proximo.dado < valor
            atual = atual.proximo
        novoNo.proximo = atual.proximo
        atual.proximo = novoNo

# Remover:

Função remover(valor: inteiro)
    Se inicio é nulo
        Retorna falso
    Se inicio.dado == valor
        inicio = inicio.proximo
        Retorna verdadeiro
    atual = inicio
    Enquanto atual.proximo não é nulo
        Se atual.proximo.dado == valor
            atual.proximo = atual.proximo.proximo
            Retorna verdadeiro
        atual = atual.proximo
    Retorna falso

# Buscar:

Função buscar(valor: inteiro)
    atual = inicio
    Enquanto atual não é nulo
        Se atual.dado == valor
            Retorna atual
        atual = atual.proximo
    Retorna nulo

# Imprimir:

Função imprimir()
    atual = inicio
    Enquanto atual não é nulo
        Imprimir atual.dado
        atual = atual.proximo
