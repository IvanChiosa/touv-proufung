package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarInspectionService {

    // 5. Lege dir eine Klasse "CarInspectionService" an.
    // Es sollte für jede kommende methode ein test geschrieben werden. Schreibe jeweils erst einen Test und dann die Funktionalität (wenn di dich damit wohlfühlst).


    // 6. Schreibe eine methode die als Parameter Car
    // entgegennimmt und eine boolean zurückgibt.
    // Diese Methode soll überprüfen od das Car4 reifen hat.
    public boolean checkIfCarHaveTires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    // 7. Schreibe eine Methode die als Parameter ein Car
    // entgegennimmt und eine boolean zurückgibt.
    // Diese methode soll überprüfen ob das car einen
    // seatBelt besitzt.
    public boolean checkIfCarHaveSeatBelt(Car car) {
        return car.isSeatBelt();
    }

    // 8. Schreiben eine Methode die als Parameter ein Car
    // entgegennimmt und eine Boolean zurückgibt.
    // Diese Methode soll überprüfen ob das Car einen
    // airbag besitzt.

    public boolean checkIfCarHaveAirbag(Car car) {
        return car.isAirbag();
    }

    // 9. Schreibe eine Methode die als Parameter ein Car
    // entgegennimmt und eine boolean zurückgibt.
    // Diese method soll überprüfen ob das car
    // entweder 3 oder 5 Türen besitzt.

    public boolean checkIfCarHaveDoors(Car car)  {
        int doors = car.getNumbersOfDoors();
        return doors == 3 || doors == 5;
    }


    // 10. Schreibe eine Methode checkCar
    // die alle andere Methoden
    // aufruft und nur true zurückgeben darf wenn alle
    // Checks positiv sind
    public boolean checkCar(Car car) {
        boolean tiresCheck = checkIfCarHaveTires(car);
        boolean seatBeltCheck = checkIfCarHaveSeatBelt(car);
        boolean airbagCheck = checkIfCarHaveAirbag(car);
        boolean doorsCheck = checkIfCarHaveDoors(car);

        return tiresCheck && seatBeltCheck && airbagCheck && doorsCheck;
    }




}
