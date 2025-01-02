// main.cpp

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <memory>
#include "Player.h"
#include "AdvancedPlayer.h"
#include "Game.h"
#include "Storage.h"
#include "locale.h"

int main() {

    setlocale(LC_ALL, "Rus");

    std::shared_ptr<Player> player1 = std::make_shared<Player>("Masha");
    std::shared_ptr<Player> player2 = std::make_shared<AdvancedPlayer>("Sasha");

    std::cout << *player1 << std::endl;
    std::cout << *player2 << std::endl;

    player1->specialAbility();
    player2->specialAbility();

    Storage<std::shared_ptr<Player>> storage;
    storage.addItem(player1);
    storage.addItem(player2);

    storage.printItems();

    return 0;
}