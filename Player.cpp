// player.cpp

#define _CRT_SECURE_NO_WARNINGS
#include "Player.h"

Player::Player(const std::string& name) : name(name), score(0) {}

std::string Player::getName() const { return name; }
int Player::getScore() const { return score; }
void Player::setName(const std::string& name) { this->name = name; }
void Player::incrementScore() { score++; }
void Player::resetScore() { score = 0; }
void Player::printInfo() const {
    std::cout << "Игрок: " << name << ", Счёт: " << score << std::endl;
}

void Player::specialAbility() const {
    std::cout << "У игрока нет специальных способностей." << std::endl;
}

std::ostream& operator<<(std::ostream& os, const Player& player) {
    os << "Игрок: " << player.name << ", Cчёт: " << player.score;
    return os;
}
