
from typing import List

def findGreaterNumber(numbers:List[float]):
    greaterNumber = 0
    for number in numbers:
        if greaterNumber < number:
            greaterNumber = number

    return greaterNumber




def main():
    print("Digite 5 numeros")
    numbers = []
    while len(numbers) < 5:
        numbers.append(float(input()))
    
    print("O maior numero é: ",findGreaterNumber(numbers))

if __name__ == '__main__':
    main()