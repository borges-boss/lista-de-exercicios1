def isPrimeNumber(number:int):
    if(number <= 1):
        return False
    
    for i in range(2,number):
        if number % i == 0:
             return False
 
        return True


def main():
   print("Digite um numero:")
   number = int(input())
   print("O numero","é primo" if isPrimeNumber(number) else "não é primo")

if __name__ == '__main__':
    main()