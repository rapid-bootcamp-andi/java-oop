package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal1 extends BasicLogic {
    public Logic1Soal1(int n){
        super(n);
    }
    public void isiArray(){
        int a = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(a);
            a++;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
