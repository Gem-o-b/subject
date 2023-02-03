package subject;

public class PublicTransportTest {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.takeCar(2);
        bus1.setOil(-50);
        bus1.setState();
        bus1.setOil(10);
        bus1.setState();
        bus1.takeCar(45);
        bus1.takeCar(5);
        bus1.setOil(-55);
        System.out.println();
        System.out.println();
        System.out.println();

        Texi texi1 = new Texi();
        Texi texi2 = new Texi();
        texi1.takeCar(2,"서울역",2);
        texi1.setOil(-80);
        texi1.byeCar();
        texi1.texiInfo();
        texi1.takeCar(5,"서울역",2);
        texi1.takeCar(3,"구로디지털단지역",12);
        texi1.byeCar();
        texi1.setOil(-20);

        texi1.texiInfo();



    }


}
