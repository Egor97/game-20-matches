package com.company;

class ControlGameService {
    private ConsoleSendMessage consoleSendMessage = new ConsoleSendMessage();
    private int value = 20;

    private int getSelectPlayer() {
        int playerValue = consoleSendMessage.getValuePlayer();

        if (playerValue < 1 || playerValue > 3) {
            consoleSendMessage.consoleMessageAboutIncorrectSelection();
            consoleSendMessage.consoleMessageAboutCountMatches(value);
            getSelectPlayer();
        } else {
            setValue(value - playerValue);
        }
        return playerValue;
    }

    int getResultOfGame() {
        ComputerLogic computerLogic = new ComputerLogic();

        while (value != 1) {
            consoleSendMessage.consoleMessageAboutCountMatches(value);

            int computerMatches = computerLogic.selectMatch(value);
            consoleSendMessage.consoleMessageAboutComputerSelectMatches(computerMatches);
            setValue(value - computerMatches);

            if (value == 1 ) {
                consoleSendMessage.consoleMessageAboutFinishGame();
                break;
            }

            consoleSendMessage.consoleMessageAboutCountMatches(value);

            getSelectPlayer();
        }

        return -1;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
