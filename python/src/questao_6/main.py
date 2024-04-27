from typing import List



def findEvenNumbers(numbers:List[float]):
    return list(filter(lambda n: n % 2 == 0,numbers))

def findOddNumbers(numbers:List[float]):
    return list(filter(lambda n: n % 2 != 0,numbers))

def findNumbersDivisibleByThree(numbers:List[float]):
    return list(filter(lambda n: n % 3 == 0,numbers))


def main():
    print("Digite 10 numeros")
    numbers = []
    while len(numbers) < 10:
        numbers.append(float(input()))

    evenNumbers = findEvenNumbers(numbers)
    oddNumbers = findOddNumbers(numbers)
    divisableByThree = findNumbersDivisibleByThree(numbers)

    print("Soma dos numeros pares: ", sum(n for n in evenNumbers))
    print("Soma dos numeros impares: ", sum(n for n in oddNumbers))
    print("Soma dos numeros divisiveis por 3: ", sum(n for n in divisableByThree))

if __name__ == '__main__':
    main()