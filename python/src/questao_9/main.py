def factorial(number:int):
   if(number <= 1):
    return 1
   
   return number * factorial(number - 1) 
   


def main():
   print("Digite um numero:")
   number = int(input())
   print("O fatorial de ",number, "é: ",factorial(number))
 

if __name__ == '__main__':
    main()