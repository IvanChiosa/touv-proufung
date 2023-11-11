package org.example;
public class Main {
    public static void main(String[] args) {

        // 1. Lege die ein neues java Github Projekt an


//        Car car1 = new Car(2);
//        Car car4 = new Car(2);
//        Car car5 = new Car(true);
//        System.out.println(car1);
//
//        CarInspectionService carInspectionService = new CarInspectionService();
//        boolean result = carInspectionService.checkIfCarHaveTires(car1);
//        System.out.println(result);
////        boolean result1 = carInspectionService.checkIfCarHaveSeatBelt(car5);
////        System.out.println(result1);
//
//        boolean result2 = carInspectionService.checkIfCarHaveDoors(car1);
//        if (result2) {
//            System.out.println("Das Auto hat entweder 3 oder 5 Türen");
//        } else {
//            System.out.println("Das auto hat nicht 3 oder 5 Türen");
//        }

        Car car = new Car(4, 1, true, true);

        CarInspectionService carInspectionService = new CarInspectionService();
        boolean isCarValid  = carInspectionService.checkCar(car);
        if(isCarValid) {
            System.out.println("Das Auto erfüllt alle Anforderungen.");
        } else {
            System.out.println("Das Auto erfüllt nicht alle Anforderungen.");
        }
      }

    }

