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
        carspecs.setBody("sport4");
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

        session.save(car);
        session.save(carspecs);
        session.save(car_creators);
        session.save(car_creators2);


        session.getTransaction().commit();
        System.out.println("Done");


    }
}