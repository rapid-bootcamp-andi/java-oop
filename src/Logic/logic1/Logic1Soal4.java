package Logic.logic1;

import Logic.BasicLogic;

public class Logic1Soal4 extends BasicLogic {
    public Logic1Soal4(int n){
        super(n);
    }
    public void isiArray(){
        int a = 1;
        int b = 0;
        int c = 0;
        for (int i = 0; i < this.n; i++) {
            if(i < 0){
                this.array[0][i]= String.valueOf(a);
            }else{
                c = a + b;
                a = b;
                b = c;
                this.array[0][i]= String.valueOf(c);
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
