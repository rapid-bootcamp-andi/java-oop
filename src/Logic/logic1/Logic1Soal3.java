package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal3 extends BasicLogic {
    public Logic1Soal3(int n){
        super(n);
    }
    public void isiArray(){
        int a = 0;
        for (int i = 0; i < this.n; i++) {
            if (i<=0){
                this.array[0][i]= String.valueOf(a);
            }else {
                int b = i * 2;
                this.array[0][i]= String.valueOf(b);
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
