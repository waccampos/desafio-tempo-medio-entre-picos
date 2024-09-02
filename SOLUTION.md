# Documentação do Projeto - Calculador de Tempo Médio entre Picos

## Visão Geral

Este projeto consiste em uma aplicação Java que calcula o tempo médio entre picos de uma lista de números aleatórios. Ele é composto por três classes principais:

1. **RandomNumberGenerator**: Gera uma lista de números aleatórios.
2. **AvarageTimeBetweenPeaksCalculator**: Calcula o tempo médio entre os picos de uma lista de números.
3. **Main**: Classe principal que executa o programa.

## Classes e Funcionalidades

### 1. Classe `RandomNumberGenerator`

A classe `RandomNumberGenerator` é responsável por gerar uma lista de números inteiros aleatórios dentro de um intervalo específico.

- **Método `generateRandomNumbers(int quantity, int min, int max)`**:
    - Gera uma lista de números aleatórios.
    - Parâmetros:
        - `quantity`: Quantidade de números a serem gerados.
        - `min`: Valor mínimo dos números gerados.
        - `max`: Valor máximo dos números gerados.
    - Retorna: Uma lista de inteiros aleatórios dentro do intervalo especificado.

### 2. Classe `Peak`

A classe `Peak` é um registro (record) que representa um pico na lista de números.

- **Campos**:
    - `value`: O valor do pico.
    - `time`: O índice na lista onde o pico ocorreu.

### 3. Classe `AvarageTimeBetweenPeaksCalculator`

A classe `AvarageTimeBetweenPeaksCalculator` é responsável por calcular o tempo médio entre picos na lista de números gerados.

- **Construtor `AvarageTimeBetweenPeaksCalculator(List<Integer> values)`**:
    - Recebe uma lista de números inteiros e identifica os picos.

- **Método `findPeaks(List<Integer> numbers)`**:
    - Encontra os picos na lista de números. Um pico é definido como um número maior ou igual a 50.
    - Retorna: Uma lista de objetos `Peak` representando os picos encontrados.

- **Método `calculateAverageTimeBetweenPeaks()`**:
    - Calcula o tempo médio entre os picos.
    - Retorna: O tempo médio entre picos como um `double`.

- **Método `formatTime(double totalSeconds)`**:
    - Converte o tempo médio de segundos para o formato `MM:SS`.
    - Retorna: Uma string formatada representando o tempo em minutos e segundos.

- **Método `toString()`**:
    - Retorna uma string que representa os valores originais, os picos encontrados e o tempo médio entre os picos.

### 4. Classe `Main`

A classe `Main` é o ponto de entrada do programa.

- **Método `main(String[] args)`**:
    - Gera uma lista de 100 números aleatórios entre 0 e 100.
    - Calcula o tempo médio entre os picos dessa lista.
    - Exibe os resultados no console.

## Execução do Projeto

Para executar este projeto:

1. Compile todas as classes.
2. Execute a classe `Main`.
3. O programa gerará uma lista de 100 números aleatórios, calculará o tempo médio entre os picos e exibirá os resultados.

## Exemplo de Saída

Ao executar o programa, a saída pode ser algo como:
Valores: [12, 67, 45, 89, 24, 50, ...] Picos: [Peak[value=67, time=1], Peak[value=89, time=3], ...] Tempo médio entre picos: 00:02
