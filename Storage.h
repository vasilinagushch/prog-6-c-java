// Storage.h шаблон класса

#pragma once
#include <vector>

template <typename T>
class Storage {
private:
    std::vector<T> items;

public:
    void addItem(const T& item) {
        items.push_back(item);
    }

    void printItems() const {
        for (const auto& item : items) {
            std::cout << item << std::endl;
        }
    }
};
