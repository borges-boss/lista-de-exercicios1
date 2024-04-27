from  person import Person
from typing import List

def findPeopleWithMoreThanNinetyKg(people:List[Person]):
    count = 0
    for p in people:
        if p.get_weight() > 90:
            count+=1
    
    return count


def calculateAgeAverage(people:List[Person]):
    sum = 0
    for p in people:
        sum+=p.get_age()
    
    return (sum/len(people))



def main():
    people = []

    while len(people) < 7:
        age = int(input("Digite a sua idade:"))
        weight = float(input("Digite o seu peso:"))
        people.append(Person(weight,age))
        print("\n")
        print("----------------------")
        print("Informações salvas!")
        print("----------------------")
        print("\n")
        print("Proximo!")
        print("")
    
    print("Quantida de pessoas com mais de 90Kg: ",findPeopleWithMoreThanNinetyKg(people))
    print("A media de idades é: ",calculateAgeAverage(people))




if __name__ == '__main__':
    main()