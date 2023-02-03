package subject;

import java.sql.SQLOutput;

public class Texi extends PublicTransport{

    static int num = 2000;
    int price =3000;
    int kmPrice = 1000;
    int totalMoney = 0;
    String destination = "";
    int baiscKm = 1;
    int destKm =0;


    public Texi() {
        this.carNumber = ++num;
        status = "일반";
        maxCustomer = 4;

        System.out.println(carNumber+" 택시 생성!");
    }

    @Override
    boolean drive() {
        if(oilStatus <=10){
            System.out.println("기름이 부족합니다");
            return false;
        }
        status = "운행중";
        return true;
    }

    @Override
    void setSpeed(int speed) {
        if(nowSpeed + speed < 0){
            System.out.println("0 이하의 속도가 될 수 없습니다");
        }else{
            nowSpeed += speed;
            System.out.println("속도가 설정 되었습니다 : "+nowSpeed);
        }

    }

    @Override
    void setState() {

    }

    @Override
    void takeCar(int customer) {

    }

    @Override
    void takeCar(int customer,String destination,int destKm) {
        if(customer > 4){
            System.out.println("최대 승객 수 초과");
        }else {
            if (drive()||status.equals("일반")) {
                this.nowCustomer = customer;
                this.destination = destination;
                this.destKm = destKm;
                this.status = "운행중";

                System.out.println("탑승 승객 수 = " + nowCustomer);
                System.out.println("잔여 승객 수 = " + (maxCustomer - nowCustomer));
                System.out.println("기본 요금 확인 = " + price);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지 까지 거리 = " + destKm);
                System.out.println("지불할 요금 = " + (price + (destKm - baiscKm) * 1000));
                System.out.println("상태 = " + status);
            } else {
                System.out.println("탑승 불가");
            }
        }



    }

    void byeCar(){
        totalMoney += price+(destKm-baiscKm)*1000;
        this.status = "일반";
        System.out.println("누적 요금 = "+ totalMoney);
    }

    @Override
    void setOil(int oilStatus) {
        this.oilStatus += oilStatus;
        System.out.println("주유량 = "+this.oilStatus);
        if(this.oilStatus<=10){
            status = "운행불가";
            System.out.println("주유가 필요 합니다");
        }
    }
    void texiInfo(){
        System.out.println("주유량 = "+oilStatus);
        System.out.println("상태 = "+status);
        System.out.println("누적요금 = "+totalMoney);

    }

    @Override
    public String toString() {
        return "Texi{" +
                "carNumber=" + carNumber +
                ", maxCustomer=" + maxCustomer +
                ", nowCustomer=" + nowCustomer +
                ", price=" + price +
                ", oilStatus=" + oilStatus +
                ", nowSpeed=" + nowSpeed +
                ", status='" + status + '\'' +
                '}';
    }
}
