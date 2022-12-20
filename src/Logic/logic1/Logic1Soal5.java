package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal5 extends BasicLogic {
    public Logic1Soal5(int n){
        super(n);
    }
    public void isiArray(){
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 0; i < this.n; i++) {
            if(i < 3){
                this.array[0][i]= String.valueOf(a);
            }else{
                d = a + b + c;
                a = b;
                b = c;
                c = d;
                this.array[0][i]= String.valueOf(d);
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
