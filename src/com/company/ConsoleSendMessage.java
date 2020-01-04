package com.company;

import java.util.Scanner;

import static java.lang.System.*;

class ConsoleSendMessage {
    void getCountMatches(int countMatchesLeft) {
        out.println("На столе осталось " + countMatchesLeft +  " спичек.");
    }

    void computerSelectMatches(int value) {
        out.println("- Количество выбранных компьютером спичек = " + value + ".");
    }

    int getValuePlayer() {
        Scanner scanner = new Scanner(System.in);
        out.print("- Ход игрока. Введите количество спичек: ");

        return scanner.nextInt();
    }

    void finishGame() {
        out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }

    void incorrectSelection() {
        out.println("Некооректное количество спичек!");
    }
}
