package Logic;

import Logic.logic1.Logic1Soal1;
import Logic.logicinterface.LogicInterface;
import Logic.logicinterface.logic1Impl.Logic1Soal1Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal2Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal3Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal4Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal5Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal6Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal7Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal8Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal9Impl;
import Logic.logicinterface.logic1Impl.Logic1Soal10Impl;

import Logic.logicinterface.logic2Impl.Logic2Soal1Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal2Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal3Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal4Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal5Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal6Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal7Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal8Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal9Impl;
import Logic.logicinterface.logic2Impl.Logic2Soal10Impl;

public class MainLogicInterface {
    public static void main(String[] args) {
        int input = 9;
        //logic 1
        System.out.print("Logic 1 Soal 1  : ");
        LogicInterface Logic1Soal1 = new Logic1Soal1Impl(new BasicLogic(input));
        Logic1Soal1.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 2  : ");
        LogicInterface Logic1Soal2 = new Logic1Soal2Impl(new BasicLogic(input));
        Logic1Soal2.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 3  : ");
        LogicInterface Logic1Soal3 = new Logic1Soal3Impl(new BasicLogic(input));
        Logic1Soal3.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 4  : ");
        LogicInterface Logic1Soal4 = new Logic1Soal4Impl(new BasicLogic(input));
        Logic1Soal4.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 5  : ");
        LogicInterface Logic1Soal5 = new Logic1Soal5Impl(new BasicLogic(input));
        Logic1Soal5.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 6  : ");
        LogicInterface Logic1Soal6 = new Logic1Soal6Impl(new BasicLogic(input));
        Logic1Soal6.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 7  : ");
        LogicInterface Logic1Soal7 = new Logic1Soal7Impl(new BasicLogic(input));
        Logic1Soal7.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 8  : ");
        LogicInterface Logic1Soal8 = new Logic1Soal8Impl(new BasicLogic(input));
        Logic1Soal8.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 9  : ");
        LogicInterface Logic1Soal9 = new Logic1Soal9Impl(new BasicLogic(input));
        Logic1Soal9.cetakArray();
        System.out.println("");
        System.out.print("Logic 1 Soal 10 : ");
        LogicInterface Logic1Soal10 = new Logic1Soal10Impl(new BasicLogic(input));
        Logic1Soal10.cetakArray();
        System.out.println("");

        System.out.println("");

        //logic 2
        System.out.println("Logic 2 Soal 1");
        LogicInterface Logic2Soal1 = new Logic2Soal1Impl(new BasicLogic(input));
        Logic2Soal1.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 2");
        LogicInterface Logic2Soal2 = new Logic2Soal2Impl(new BasicLogic(input));
        Logic2Soal2.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 3");
        LogicInterface Logic2Soal3 = new Logic2Soal3Impl(new BasicLogic(input));
        Logic2Soal3.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 4");
        LogicInterface Logic2Soal4 = new Logic2Soal4Impl(new BasicLogic(input));
        Logic2Soal4.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 5");
        LogicInterface Logic2Soal5 = new Logic2Soal5Impl(new BasicLogic(input));
        Logic2Soal5.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 6");
        LogicInterface Logic2Soal6 = new Logic2Soal6Impl(new BasicLogic(input));
        Logic2Soal6.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 7");
        LogicInterface Logic2Soal7 = new Logic2Soal7Impl(new BasicLogic(input));
        Logic2Soal7.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 8");
        LogicInterface Logic2Soal8 = new Logic2Soal8Impl(new BasicLogic(input));
        Logic2Soal8.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 9");
        LogicInterface Logic2Soal9 = new Logic2Soal9Impl(new BasicLogic(input));
        Logic2Soal9.cetakArray();
        System.out.println("");
        System.out.println("Logic 2 Soal 10");
        LogicInterface Logic2Soal10 = new Logic2Soal10Impl(new BasicLogic(input));
        Logic2Soal10.cetakArray();
        System.out.println("");
    }
}
