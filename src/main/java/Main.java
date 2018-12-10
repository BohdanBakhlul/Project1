import Entity.*;
import persistence.*;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Car car = new Car();

        car.setCreator("Mercedes");
        car.setModel("E63s");
        car.setCountry("Germany");



        Carspecs carspecs = new Carspecs();
        carspecs.setCar(car);
        carspecs.setBody("sedan");
        carspecs.setColor("white");
        carspecs.setEngine_size(6);

        Car_creators car_creators = new Car_creators();
        car_creators.setCar(car);
        car_creators.setName("Bogdan");
        car_creators.setSurname("Bakhlul");

        Car_creators car_creators2 = new Car_creators();
        car_creators2.setCar(car);
        car_creators2.setName("Denis");
        car_creators2.setSurname("Badev");

        Car_orders car_orders = new Car_orders();
        car_orders.setCar(car);
        car_orders.setCity("Poznan");
        car_orders.setAmount(10);
        car_orders.setComments("as soon as possible");

        Delivery delivery = new Delivery();
        delivery.setCar(car);
        delivery.setCar_orders(car_orders);
        delivery.setType("plane");

        session.save(car);
        session.save(carspecs);
        session.save(car_creators);
        session.save(car_creators2);
        session.save(car_orders);
        session.save(delivery);


        session.getTransaction().commit();
        System.out.println("Done");


    }
}