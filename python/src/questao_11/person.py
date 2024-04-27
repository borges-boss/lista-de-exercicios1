class Person:

    def __init__(self, weight, age):
        self.__weight = weight  
        self.__age = age
        
    
    def get_weight(self):
        return self.__weight
    
    def get_age(self):
        return self.__age

