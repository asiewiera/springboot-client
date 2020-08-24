package pl.bykowski.springbootclient;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VehicleClient {
    private RestTemplate restTemplate;

    @EventListener(ApplicationReadyEvent.class)
    public void reader(){
        getVehicle(1);
        getVehicle(2);
        getVehicle(3);
        System.out.println("Aktualizacja");
        putVehicle();
        getVehicle(1);
        getVehicle(2);
        getVehicle(3);
    }





    public void getVehicle(long id){

        ResponseEntity<Vehicle> vehicleResponseEntity = restTemplate.exchange("http://localhost:8889/api/cars/" + id,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Vehicle.class);
        System.out.println(vehicleResponseEntity.getBody());
    }


    public void putVehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Fiat");
        vehicle.setColor("red");
        vehicle.setModel("126p");
        vehicle.setId(2);

        HttpEntity<Vehicle> httpEntity = new HttpEntity<>(vehicle);


        //ResponseEntity<Vehicle> vehicleResponseEntity =
                restTemplate.exchange("http://localhost:8889/api/cars/2",
                HttpMethod.PUT,
                httpEntity,
                Void.class);
       // System.out.println(vehicleResponseEntity.getBody());
    }
}
