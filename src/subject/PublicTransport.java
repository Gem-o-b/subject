package subject;

public abstract class PublicTransport {

     int carNumber;
     int maxCustomer;
     int nowCustomer;
     int oilStatus=100;
     int nowSpeed=0;
     String status;

    abstract boolean drive();
    abstract void setSpeed(int speed);
    abstract void setState();
    abstract void takeCar(int customer);


    abstract void takeCar(int customer, String destination, int destKm);

    abstract void setOil(int oilStatus);







}
