package Logic.logicinterface.logic2Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic2Soal2Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic2Soal2Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(j==0) this.logic.array[i][j]= String.valueOf(1);
                else if(i==0 && j>=1) this.logic.array[i][j]= String.valueOf(Integer.parseInt(this.logic.array[i][j-1])+2);
                else if(j == this.logic.n-1 || i == this.logic.n-1) this.logic.array[i][j] = this.logic.array[0][j];
                else this.logic.array[i][j] = " ";
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
