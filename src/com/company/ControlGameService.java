package com.company;

class ControlGameService {
    private ConsoleSendMessage consoleSendMessage = new ConsoleSendMessage();
    private int value = 20;

    private int getSelectPlayer() {
        int playerValue = consoleSendMessage.getValuePlayer();

        if (playerValue < 1 || playerValue > 3) {
            consoleSendMessage.incorrectSelection();
            consoleSendMessage.getCountMatches(getValue());
            getSelectPlayer();
        } else {
            setValue(value - playerValue);
        }
        return playerValue;
    }

    int getResultOfGame() {
        ComputerLogic computerLogic = new ComputerLogic();

        while (value != 1) {
            consoleSendMessage.getCountMatches(getValue());

            int computerMatches = computerLogic.selectMatch(getValue());
            consoleSendMessage.computerSelectMatches(computerMatches);
            setValue(value - computerMatches);

            if (value == 1 ) {
                consoleSendMessage.finishGame();
                break;
            }

            consoleSendMessage.getCountMatches(getValue());

            getSelectPlayer();
        }

        return -1;
    }

    private int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
