// player.h

#pragma once
#include <string>
#include <iostream>

class Player {
protected:
    std::string name;
    int score;

public:
    Player(const std::string& name = "");
    virtual ~Player() {}
    std::string getName() const;
    int getScore() const;
    void setName(const std::string& name);
    void incrementScore();
    void resetScore();
    virtual void printInfo() const; // ����������� �������
    virtual void specialAbility() const; // ����������� �������
    friend std::ostream& operator<<(std::ostream& os, const Player& player);
};

std::ostream& operator<<(std::ostream& os, const Player& player);