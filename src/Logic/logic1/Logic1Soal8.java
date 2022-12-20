package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal8 extends BasicLogic {
    public Logic1Soal8(int n){
        super(n);
    }
    public void isiArray(){
        char a = 'A';
        int b = 2;
        for (int i = 0; i < this.n; i++) {
            if(i % 2 == 0){
                this.array[0][i]= String.valueOf(a);
            }else {
                this.array[0][i]= String.valueOf(b);
                b+=2;
            }
            a++;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
