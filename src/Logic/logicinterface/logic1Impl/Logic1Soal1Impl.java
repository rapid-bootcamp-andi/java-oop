package Logic.logicinterface.logic1Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic1Soal1Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal1Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        int a = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(a);
            a++;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
