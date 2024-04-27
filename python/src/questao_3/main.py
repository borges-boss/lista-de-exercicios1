from typing import List


def countEvenNumbers(numbers:List[int]):
    count = 0
    for number in numbers:
        if number % 2 == 0:
            count+=1
    return count



def main():
    print("Digite 10 numeros inteiros: ")
    numbers = []
    while len(numbers) < 10:
        numbers.append(int(input()))
    
    print("Quantida de numeros pares:",countEvenNumbers(numbers))




if __name__ == '__main__':
    main()