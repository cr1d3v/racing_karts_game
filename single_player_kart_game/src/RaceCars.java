import java.awt.*;
import java.util.Objects;
import javax.swing.*;

public class RaceCars {
    private final String carNum; // Car Var
    public ImageIcon[] raceCarImg; // made of 16 image rotation of a car

    // Assigning the declared var
    private int carSpeed; // car speed

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int newRecordedCarSpeed) {
        this.carSpeed = newRecordedCarSpeed;
    }

    private int carDirection; // car direction

    public int getCarDirection() {
        return carDirection;
    }

    public void setCarDirection(int newDirection) {
        this.carDirection = newDirection;
    }

    private int locationX; // X coordinates

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int UpdtLocationX) {
        this.locationX = UpdtLocationX;
    }

    private int locationY; // Y coordinates

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int UpdtLocationY) {
        this.locationY = UpdtLocationY;
    }

    // A method to fill the array with car img
    public ImageIcon[] AddRaceCarImg() {
        raceCarImg = new ImageIcon[16];
        for (int i = 0; i < raceCarImg.length; i++) {
            raceCarImg[i] = new ImageIcon(Objects.requireNonNull(getClass().getResource("raceCarImg\\" + this.carNum + "Car" + (i) + ".png")));
        }
        return raceCarImg;
    }

    // Method Called when creating a new Car
    public RaceCars(String loadC, int initialCarSpeed, int initialCarDirection, int initialLocationX, int initialLocationY) {
        this.carNum = loadC;
        this.carSpeed = initialCarSpeed;
        this.carDirection = initialCarDirection;
        this.locationX = initialLocationX;
        this.locationY = initialLocationY;
        this.raceCarImg = AddRaceCarImg();
    }

    // A method to position the car at current location
    public void resetCarP(Graphics g) {
        raceCarImg[this.carDirection].paintIcon(null, g, this.locationX, this.locationY);
    }

    // A move the car Method
    public void moveCar() {
        if (this.getCarDirection() == 0) {
            case0();
        }
        if (this.getCarDirection() == 1) {
            case1();
        }
        if (this.getCarDirection() == 2) {
            case2();
        }
        if (this.getCarDirection() == 3) {
            case3();
        }
        if (this.getCarDirection() == 4) {
            case4();
        }
        if (this.getCarDirection() == 5) {
            case5();
        }
        if (this.getCarDirection() == 6) {
            case6();
        }
        if (this.getCarDirection() == 7) {
            case7();
        }
        if (this.getCarDirection() == 8) {
            case8();
        }
        if (this.getCarDirection() == 9) {
            case9();
        }
        if (this.getCarDirection() == 10) {
            case10();
        }
        if (this.getCarDirection() == 11) {
            case11();
        }
        if (this.getCarDirection() == 12) {
            case12();
        }
        if (this.getCarDirection() == 13) {
            case13();
        }
        if (this.getCarDirection() == 14) {
            case14();
        }
        if (this.getCarDirection() == 15) {
            case15();
        }
    }

    // Method to assign the pre declared movement of the Car
    public void case0()
    {
        this.locationY = this.locationY - this.carSpeed;
        // this.locationX = this.locationX + this.carSpeed;
    }

    public void case1()
    {
        this.locationX = this.locationX + ((this.carSpeed / 10) * 2);
        this.locationY = this.locationY - ((this.carSpeed / 10) * 8);

    }

    public void case2()
    {
        this.locationX = this.locationX + (this.carSpeed / 2);
        this.locationY = this.locationY - (this.carSpeed / 2);
    }

    public void case3()
    {
        this.locationX = this.locationX + ((this.carSpeed / 10) * 8);
        this.locationY = this.locationY - ((this.carSpeed / 10) * 2);
    }

    public void case4()
    {
        this.locationX = this.locationX + this.carSpeed;
    }

    public void case5()
    {
        this.locationX = this.locationX + ((this.carSpeed / 10) * 8);
        this.locationY = this.locationY + ((this.carSpeed / 10) * 2);
    }

    public void case6()
    {
        this.locationX = this.locationX + (this.carSpeed / 2);
        this.locationY = this.locationY + (this.carSpeed / 2);
    }

    public void case7()
    {
        this.locationX = this.locationX + ((this.carSpeed / 10) * 2);
        this.locationY = this.locationY + ((this.carSpeed / 10) * 8);
    }

    public void case8()
    {
        // this.locationX = this.locationX + this.carSpeed;
        this.locationY = this.locationY + this.carSpeed;
    }

    public void case9()
    {
        this.locationX = this.locationX - ((this.carSpeed / 10) * 2);
        this.locationY = this.locationY + ((this.carSpeed / 10) * 8);
    }

    public void case10()
    {
        this.locationX = this.locationX - (this.carSpeed / 2);
        this.locationY = this.locationY + (this.carSpeed / 2);
    }

    public void case11()
    {
        this.locationX = this.locationX - ((this.carSpeed / 10) * 8);
        this.locationY = this.locationY + ((this.carSpeed / 10) * 2);
    }

    public void case12()
    {
        this.locationX = this.locationX - this.carSpeed;
    }

    public void case13()
    {
        this.locationX = this.locationX - ((this.carSpeed / 10) * 8);
        this.locationY = this.locationY - ((this.carSpeed / 10) * 2);
    }

    public void case14()
    {
        this.locationX = this.locationX - (this.carSpeed / 2);
        this.locationY = this.locationY - (this.carSpeed / 2);
    }

    public void case15()
    {
        this.locationX = this.locationX - ((this.carSpeed / 10) * 2);
        this.locationY = this.locationY - ((this.carSpeed / 10) * 8);
    }
}
