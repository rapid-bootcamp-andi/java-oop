package Logic.logicinterface.logic2Impl;

import Logic.BasicLogic;
import Logic.logicinterface.LogicInterface;

public class Logic2Soal7Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic2Soal7Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                this.logic.array[i][j] = "0";
            }
        }

        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(j <= 1 || i <= 1 || i >= this.logic.n-2 || j >= this.logic.n-2) this.logic.array[i][j] = String.valueOf(1);
                else if(j >= i && j < this.logic.n - i) this.logic.array[i][j] = String.valueOf(Integer.parseInt(this.logic.array[i-1][this.logic.n/2]) + Integer.parseInt(this.logic.array[i-2][this.logic.n/2]));
                else if(j >= this.logic.n-i-1  && j <= i) this.logic.array[i][j] = String.valueOf(Integer.parseInt(this.logic.array[this.logic.n-i-2][this.logic.n/2]) + Integer.parseInt(this.logic.array[this.logic.n-i-3][this.logic.n/2]));
                else if(j <= this.logic.n/2) this.logic.array[i][j] = String.valueOf(Integer.parseInt(this.logic.array[i][j-1]) + Integer.parseInt(this.logic.array[i][j-2]));
                else if (j >= this.logic.n/2) this.logic.array[i][j] = String.valueOf(Integer.parseInt(this.logic.array[this.logic.n/2][this.logic.n-j-2]) + Integer.parseInt(this.logic.array[this.logic.n/2][this.logic.n-j-3]));
                else this.logic.array[i][j] = "0";
            }
        }

        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(Integer.parseInt(this.logic.array[i][j]) == 0) this.logic.array[i][j] = String.valueOf(Integer.parseInt(this.logic.array[this.logic.n/2][this.logic.n-j-2]) + Integer.parseInt(this.logic.array[this.logic.n/2][this.logic.n-j-3]));
                if((j <= i && j <= this.logic.n/2 && i <= this.logic.n/2 || j >= i && j >= this.logic.n/2 && i >= this.logic.n/2 || j <= i && i >= this.logic.n/2 && j >= this.logic.n-i-1 && j <= this.logic.n/2 || j >= i && i <= this.logic.n/2 && j <= this.logic.n-i-1 && j >= this.logic.n/2) == false)
                    this.logic.array[i][j] = " ";
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
