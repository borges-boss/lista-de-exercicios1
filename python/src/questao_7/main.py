def main():
   print("Numeros entre 1000 e 2000 que quando divididos por 5 produzam resto 3")
   
   for n in range(1000,2000):
       if n % 5 == 3:
        print(n)
 

if __name__ == '__main__':
    main()