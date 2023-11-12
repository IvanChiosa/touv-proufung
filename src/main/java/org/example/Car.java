package org.example;
import java.util.Objects;

public class Car {

    // 2. Lege dir eine neue Klasse mit dem Namen car und den Feldern.
    private int numberOfTires;
    private int numbersOfDoors;
    private boolean seatBelt;
    private boolean airbag;


    // 3. Lege dir die getter-, setter-, equals-, hashcode-, und die ToString- Methoden an.
    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    public void setNumbersOfDoors(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfTires == car.numberOfTires && numbersOfDoors == car.numbersOfDoors && seatBelt == car.seatBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTires, numbersOfDoors, seatBelt, airbag);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numbersOfDoors=" + numbersOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }

    // 4. Lege die einen default constructor und einen mit allen Feldern/Eigenschaften an.
    public Car(int numberOfTires, int numbersOfDoors, boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numbersOfDoors = numbersOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }


//    public Car(int numberOfTires) {
//       this.numberOfTires = numberOfTires;
//    }
//    public Car(boolean seatBelt) {
//        this.seatBelt = seatBelt;
//    }
    public Car(boolean airbag) {
        this.airbag = airbag;
    }

    public Car(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }
}
