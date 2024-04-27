from person import Person
from typing import List

def findOlderThanFifty(people:List[Person]):
    count = 0
    for p in people:
        if p.get_age() > 50:
            count+=1

    return count


def heightAverageBetweenTenAndTwenty(people:List[Person]):
    filteredList = list(filter(lambda p: 10 <= p.get_age() <= 20, people))
    sum = 0
    for p in filteredList:
        sum+=p.get_height()
        
    return sum / len(filteredList) if filteredList else 0

def lessThanFortyKg(people:List[Person]):
    return (len(list(filter(lambda p: p.get_weight() < 40 ,people))) * 100) / len(people)



def main():
    people = []

    while len(people) < 25:
        age = int(input("Digite a sua idade:"))
        weight = float(input("Digite o seu peso:"))
        height = float(input("Digite a sua altura:"))
        people.append(Person(weight,age,height))
        print("\n")
        print("----------------------")
        print("Informações salvas!")
        print("----------------------")
        print("\n")
        print("Proximo!")
        print("")
    
    print("Quantidade de pessoas com idade superior a 50 anos: ",findOlderThanFifty(people))
    print("Média das alturas das pessoas com idade entre 10 e 20 anos: ",heightAverageBetweenTenAndTwenty(people))
    print("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas: ",lessThanFortyKg(people))


if __name__ == '__main__':
    main()