package org.example.Config;

import org.example.beans.Battery;
import org.example.beans.Feature;
import org.example.beans.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
   public Feature featureId(){

        Feature feature = new Feature();
        feature.setRam("4 GB");
        feature.setSSD("500 GB");
        return feature;
    }
    @Bean
    public Feature featureId1(){           //this is copy of feature we only checkit for @Qualifier

        Feature feature = new Feature();
        feature.setRam("7 GB");
        feature.setSSD("250 GB");
        return feature;
    }

    @Bean
    public Battery batteryId(){

        Battery battery = new Battery();
        battery.setBattery_Brand("Lithium Ion");
        return battery;
    }

    @Bean
   public  Laptop laptopId() {

        Laptop obj = new Laptop();
        obj.setLaptop_Brand("HP-PAVALIOON");
        obj.setPrice(700000);
        //obj.setFeature(featureId()); // Manuall-DI
        obj.setBattery(batteryId().getBattery_Brand());
        return obj;
        }


    }



