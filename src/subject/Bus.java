package subject;

public class Bus extends PublicTransport{
    static int num=1000;
    int price=1000;



    public Bus() {

        this.carNumber = ++num;
        maxCustomer = 30;
        status = "drive";
        price = 1000;
        System.out.println(carNumber+" 버스 생성!");
    }

    @Override
    boolean drive() {
        status = "drive";
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
        if(oilStatus <=10){
            System.out.println("주유가 필요 합니다");
        }
        if(status.equals("drive")){
            status = "return";
            System.out.println("상태 : 차고지행");
        }else{
            status = "drive";
            System.out.println("상태 : 운행");
        }

    }

    @Override
    void takeCar(int customer) {
        if (nowCustomer+customer <maxCustomer){
            nowCustomer += customer;
            System.out.println("탑승 승객 수 : "+nowCustomer);
            System.out.println("잔여 승객 수 : "+(maxCustomer-nowCustomer));
            System.out.println("요금 확인 : "+price*nowCustomer);

        }else{
            System.out.println("최대 승객 수를 초과했습니다");
        }

    }

    @Override
    void takeCar(int customer, String destination, int destKm) {

    }

    public void changeSpeed(int speed){
        if(oilStatus<=10){
            System.out.println("주유량을 확인해주세요.");
            this.status = "return";
        }

        if(nowSpeed + speed < 0){
            System.out.println("속도가 0 이하로 될 수 없습니다");
        }else{
            nowSpeed += speed;
        }

    }

    @Override
    void setOil(int oilStatus) {
        this.oilStatus += oilStatus;
        System.out.println("주유량 : "+this.oilStatus);
        if(this.oilStatus<=10){
            status = "return";
            System.out.println("주유가 필요 합니다");
        }
    }


    @Override
    public String toString() {
        return "Bus{" +
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
