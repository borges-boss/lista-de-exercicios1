def main():
   print("Digite um numero:")
   number = float(input())
   
   for n in range(101):
     print(number," x ", n, " = ", (number*n))
 

if __name__ == '__main__':
    main()