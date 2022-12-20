package Logic.logicinterface.logic1Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic1Soal5Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal5Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 0; i < this.logic.n; i++) {
            if(i < 3){
                this.logic.array[0][i]= String.valueOf(a);
            }else{
                d = a + b + c;
                a = b;
                b = c;
                c = d;
                this.logic.array[0][i]= String.valueOf(d);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
