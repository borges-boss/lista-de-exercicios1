class Person:

    def __init__(self, weight, age, height):
        self.__weight = weight  
        self.__age = age
        self.__height = height
        
    
    def get_weight(self):
        return self.__weight
    
    def get_age(self):
        return self.__age
    
    def get_height(self):
        return self.__height

