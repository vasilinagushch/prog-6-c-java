// AdvancedPlayer.h ����������� �����

#pragma once
#include "Player.h"

class AdvancedPlayer : public Player {
public:
    AdvancedPlayer(const std::string& name = "");
    void printInfo() const override; // ���������� ������ �������� ������
    void specialAbility() const override; // ���������� ����������� �������
    AdvancedPlayer& operator=(const Player& other); // ���������� ��������� ������������
};
