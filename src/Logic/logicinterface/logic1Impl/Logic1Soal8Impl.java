package Logic.logicinterface.logic1Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic1Soal8Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal8Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        char a = 'A';
        int b = 2;
        for (int i = 0; i < this.logic.n; i++) {
            if(i % 2 == 0){
                this.logic.array[0][i]= String.valueOf(a);
            }else {
                this.logic.array[0][i]= String.valueOf(b);
                b+=2;
            }
            a++;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
