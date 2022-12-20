package Logic.logicinterface.logic1Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic1Soal4Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal4Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        int a = 1;
        int b = 0;
        int c = 0;
        for (int i = 0; i < this.logic.n; i++) {
            if(i < 0){
                this.logic.array[0][i]= String.valueOf(a);
            }else{
                c = a + b;
                a = b;
                b = c;
                this.logic.array[0][i]= String.valueOf(c);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
