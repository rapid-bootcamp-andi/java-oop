package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal7 extends BasicLogic {
    public Logic1Soal7(int n){
        super(n);
    }
    public void isiArray(){
        char a = 'A';
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

