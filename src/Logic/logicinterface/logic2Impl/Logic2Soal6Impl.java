package Logic.logicinterface.logic2Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic2Soal6Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic2Soal6Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        for (int i = 0; i < this.logic.n; i++) {
            int angka = 1;
            int angka1 = 1;
            for (int j = 0; j < this.logic.n; j++) {
                if(i+j>=this.logic.n-1 && i-j<=0 ||
                        i-j>=0 && i+j<=this.logic.n-1
                ){
                    this.logic.array[j][i] = String.valueOf(angka);
                }
                int sum = angka + angka1;
                angka = angka1;
                angka1 = sum;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
