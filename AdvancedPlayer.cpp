// AdvancedPlayer.cpp

#include "AdvancedPlayer.h"
#include <iostream>

AdvancedPlayer::AdvancedPlayer(const std::string& name) : Player(name) {}

void AdvancedPlayer::printInfo() const {
    Player::printInfo(); // ����� ������ �������� ������
    std::cout << "����������� ����� � ������� �������������." << std::endl;
}

void AdvancedPlayer::specialAbility() const {
    std::cout << "����������� ����� ����� ��������� ����������� ��������." << std::endl;
}

AdvancedPlayer& AdvancedPlayer::operator=(const Player& other) {
    if (this != &other) {
        this->name = other.getName();
        this->score = other.getScore();
    }
    return *this;
}