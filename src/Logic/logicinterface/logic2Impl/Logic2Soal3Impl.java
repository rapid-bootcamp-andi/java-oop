package Logic.logicinterface.logic2Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic2Soal3Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic2Soal3Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        for (int i = 0; i < this.logic.n; i++) {
            int angka = 0;
            for (int j = 0; j < this.logic.n; j++) {
                if(j==0 || i==0  || i == this.logic.n-1 || j== this.logic.n-1 ||
                        i==j || i+j == this.logic.n-1){
                    this.logic.array[i][j] = String.valueOf(angka);
                }
                angka+=2;
            }
        }

    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
