package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal9 extends BasicLogic {
    public Logic1Soal9(int n){
        super(n);
    }
    public void isiArray(){
        int a = 1;
        int b = 0;
        for (int i = 0; i < this.n; i++) {
            if(i == 0){
                this.array[0][i]= String.valueOf(a);
                a = a * 3;
            }else if (i == 2){
                this.array[0][i]= String.valueOf(a);

            }else {
                b = a * 3;
                this.array[0][i]= String.valueOf(b);
                a = b;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
