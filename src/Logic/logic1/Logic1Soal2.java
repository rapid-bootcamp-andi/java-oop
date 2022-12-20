package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal2 extends BasicLogic {
    public Logic1Soal2(int n){
        super(n);
    }
    public void isiArray(){
        int a = 1;
        int b;
        for (int i = 0; i < this.n; i++) {
            if(i % 2 == 0){
                if(i == 0){
                    this.array[0][i]= String.valueOf(a);
                }else{
                    this.array[0][i]= String.valueOf(a);
                }
            }else{
                b = a *3;
                this.array[0][i]= String.valueOf(b);
                a = b - i;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
