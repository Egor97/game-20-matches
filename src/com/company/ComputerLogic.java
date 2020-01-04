package com.company;

class ComputerLogic {

    int selectMatch(int countMatchesLeft) {
        int count;

        switch (countMatchesLeft) {
            case (20):
            case (16):
            case (12):
            case (8):
            case (4):
                count = 3;
                break;
            case (15):
            case (11):
            case (7):
            case (3):
                count = 2;
                break;
            case (14):
            case (10):
            case (6):
            case (2):
                count = 1;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + countMatchesLeft);
        }

        return count;
    }
}
