import Entity.*;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.hibernate.Query;
import persistence.*;
import org.hibernate.Session;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        Session session = HibernateUtil.getSessionFactory().openSession(); //zapolniayem ebatb

//        session.beginTransaction(); //DEFAULT
//
//        Car car = new Car();
//        car.setCreator("Mercedes");
//        car.setModel("E63s");
//        car.setCountry("Germany");
//
//        Car car2 = new Car();
//        car2.setCreator("Ferrari");
//        car2.setModel("Berlinetta");
//        car2.setCountry("Italy");
//
//        Carspecs carspecs = new Carspecs();
//        carspecs.setCar(car);
//        carspecs.setBody("sedan");
//        carspecs.setColor("white");
//        carspecs.setEngine_size(6);
//
//        Carspecs carspecs2 = new Carspecs();
//        carspecs2.setCar(car2);
//        carspecs2.setBody("coupe");
//        carspecs2.setColor("red");
//        carspecs2.setEngine_size(4);
//
//        Car_creators car_creators = new Car_creators();
//        car_creators.setCar(car);
//        car_creators.setName("Bogdan");
//        car_creators.setSurname("Bakhlul");
//
//        Car_creators car_creators2 = new Car_creators();
//        car_creators2.setCar(car);
//        car_creators2.setName("Denis");
//        car_creators2.setSurname("Badev");
//
//        Car_creators car_creators3 = new Car_creators();
//        car_creators3.setCar(car2);
//        car_creators3.setName("Andrew");
//        car_creators3.setSurname("Smith");
//
//        Car_creators car_creators4 = new Car_creators();
//        car_creators4.setCar(car2);
//        car_creators4.setName("Denis");
//        car_creators4.setSurname("Dub");
//
//        Car_orders car_orders = new Car_orders();
//        car_orders.setCar(car);
//        car_orders.setCity("Poznan");
//        car_orders.setAmount(10);
//        car_orders.setComments("as soon as possible");
//
//        Car_orders car_orders2 = new Car_orders();
//        car_orders2.setCar(car2);
//        car_orders2.setCity("London");
//        car_orders2.setAmount(3);
//        car_orders2.setComments("until spring");
//
//        List<Car_orders> co = new ArrayList<Car_orders>(); hueta
//        co.add(car_orders);
//        co.add(car_orders2);
//
//        Delivery delivery = new Delivery();
//        delivery.setCar_orders(car_orders);
//        delivery.setType("plane");
//
//        Delivery delivery2 = new Delivery();
//        delivery2.setCar_orders(car_orders2);
//        delivery2.setType("ship");
//
//        session.save(car);
//        session.save(car2);
//        session.save(carspecs);
//        session.save(carspecs2);
//        session.save(car_creators);
//        session.save(car_creators2);
//        session.save(car_creators3);
//        session.save(car_creators4);
//        session.save(car_orders);
//        session.save(car_orders2);
//        session.save(delivery);
//        session.save(delivery2);
//
//
//        session.getTransaction().commit();
//        test2();
//        test3();
        test4();
//
// JSON TO JAVA
//       Carspecs carspecs = null;
//       ObjectMapper objectMapper = new ObjectMapper();
//
//        try
//        {
//            carspecs =  objectMapper.readValue(new File("target/carspecs.json"), Carspecs.class);
//        } catch (JsonGenerationException e)
//        {
//            e.printStackTrace();
//        } catch (JsonMappingException e)
//        {
//            e.printStackTrace();
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println(carspecs);
//        session.save(carspecs);
//        session.getTransaction().commit();

//        Car car = new Car();
//        car.setCreator("Mercedes");
//        car.setModel("E63s");
//        car.setCountry("Germany");
//
//        Carspecs carspecs = new Carspecs();
//        carspecs.setCar(car);
//        carspecs.setBody("sedan");
//        carspecs.setColor("white");
//        carspecs.setEngine_size(6);
//
//        Car_creators car_creators = new Car_creators();
//        car_creators.setCar(car);
//        car_creators.setName("Bogdan");
//        car_creators.setSurname("Bakhlul");
//
//        Car_creators car_creators2 = new Car_creators();
//        car_creators2.setCar(car);
//        car_creators2.setName("Bogdano");
//        car_creators2.setSurname("Bakhlulo");
//
//        List<Car_creators> cr = new ArrayList<Car_creators>();
//        cr.add(car_creators);
//        cr.add(car_creators2);
//
//
//        Car_orders car_orders = new Car_orders();
//        car_orders.setCar(car);
//        car_orders.setCity("Poznan");
//        car_orders.setAmount(10);
//        car_orders.setComments("as soon as possible");
// Query query = session.createQuery("SELECT k FROM Carspecs k");
// List<Carspecs> cars = query.list();
// System.out.println("a");
//        try                               //JAVA TO JSON
//        {
//            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/carspecs.json"), cs);
//        } catch (JsonGenerationException e)
//        {
//            e.printStackTrace();
//        } catch (JsonMappingException e)
//        {
//            e.printStackTrace();
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        try
//        {
//            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car_creators.json"), cr);
//        } catch (JsonGenerationException e)
//        {
//            e.printStackTrace();
//        } catch (JsonMappingException e)
//        {
//            e.printStackTrace();
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        try
//        {
//            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car_orders.json"), co);
//        } catch (JsonGenerationException e)
//        {
//            e.printStackTrace();
//        } catch (JsonMappingException e)
//        {
//            e.printStackTrace();
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }


    }
    public static void test2() { //datab to JSON

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT k FROM Car k");
        List<Car> crs = query.list();
        query = session.createQuery("SELECT k FROM Carspecs k");
        List<Carspecs> carsp = query.list();
        query = session.createQuery("SELECT k FROM Car_orders k");
        List<Car_orders> carord = query.list();
        query = session.createQuery("SELECT k FROM Car_creators k");
        List<Car_creators> carcreat = query.list();
        query = session.createQuery("SELECT k FROM Delivery k");
        List<Delivery> deliver = query.list();


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/carspecs.json"), carsp);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/delivery.json"), deliver);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car_creators.json"), carcreat);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car_orders.json"), carord);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car.json"), crs);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static void test3() {//datab to XML

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT k FROM Car k");
        List<Car> crs = query.list();
        query = session.createQuery("SELECT k FROM Carspecs k");
        List<Carspecs> carsp = query.list();
        query = session.createQuery("SELECT k FROM Car_orders k");
        List<Car_orders> carord = query.list();
        query = session.createQuery("SELECT k FROM Car_creators k");
        List<Car_creators> carcreat = query.list();
        query = session.createQuery("SELECT k FROM Delivery k");
        List<Delivery> deliver = query.list();


        ObjectMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/carspecs.xml"), carsp);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/delivery.xml"), deliver);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car_creators.xml"), carcreat);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car_orders.xml"), carord);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/car.xml"), crs);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void test4(){//json to datab
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Car> car = objectMapper.readValue(new File("target/car1.json"), new TypeReference<List<Car>>(){});
            List<Carspecs> carsp = objectMapper.readValue(new File("target/carspecs1.json"), new TypeReference<List<Carspecs>>(){});
//            List<Delivery> deliver = objectMapper.readValue(new File("target/delivery.json"), new TypeReference<List<Delivery>>(){});
//            List<Car_creators> carcreat = objectMapper.readValue(new File("target/car_creators.json"), new TypeReference<List<Car_creators>>(){});
//            List<Car_orders> carord = objectMapper.readValue(new File("target/car_orders.json"), new TypeReference<List<Car_orders>>(){});

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            for (Carspecs t: carsp) {
                session.save(t);
            }
            session.getTransaction().commit();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}