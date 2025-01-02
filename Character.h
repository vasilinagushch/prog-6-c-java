// Character.h aбстрактный класс

#pragma once
#include <string>

class Character {
protected:
    std::string name;

public:
    Character(const std::string& name) : name(name) {}
    virtual ~Character() = default;
    virtual void printInfo() const = 0; // Чисто виртуальная функция
};