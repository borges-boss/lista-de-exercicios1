from typing import List

def sumAll(numbers:List[int]):
    result = 0
    for number in numbers:
        result += number
    
    return result


def main():
    print("Digite 10 numeros inteiros: ")
    numbers = []
    while len(numbers) < 10:
        numbers.append(int(input()))
    
    print(sumAll(numbers))




if __name__ == '__main__':
    main()