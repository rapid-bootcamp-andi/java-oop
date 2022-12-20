package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal10 extends BasicLogic {
    public Logic1Soal10(int n){
        super(n);
    }
    public void isiArray(){
        int a = 0;
        for (int i = 0; i < this.n; i++) {
            if(i <= 1){
                this.array[0][i]= String.valueOf(i);
            }else {
                a = i * i * i;
                this.array[0][i]= String.valueOf(a);
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
