package Logic.logicinterface.logic1Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic1Soal3Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal3Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        int a = 0;
        for (int i = 0; i < this.logic.n; i++) {
            if (i<=0){
                this.logic.array[0][i]= String.valueOf(a);
            }else {
                int b = i * 2;
                this.logic.array[0][i]= String.valueOf(b);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
