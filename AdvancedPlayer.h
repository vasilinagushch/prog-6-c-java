// AdvancedPlayer.h производный класс

#pragma once
#include "Player.h"

class AdvancedPlayer : public Player {
public:
    AdvancedPlayer(const std::string& name = "");
    void printInfo() const override; // Перегрузка метода базового класса
    void specialAbility() const override; // Перегрузка виртуальной функции
    AdvancedPlayer& operator=(const Player& other); // Перегрузка оператора присваивания
};
