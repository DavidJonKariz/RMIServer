package com.ics.rmiserver;

import com.ics.rmiserver.service.CabBookingService;
import com.ics.rmiserver.service.CabBookingServiceImpl;
import com.ics.rmiserver.service.HelloWorldRMI;
import com.ics.rmiserver.service.HelloWorldRMIimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config {
    @Bean
    RemoteExporter registerRMIExporter() {

        RmiServiceExporter exporter = new RmiServiceExporter();
//        exporter.setServiceName("helloworldrmi");
//        exporter.setServiceInterface(HelloWorldRMI.class);
//        exporter.setService(new HelloWorldRMIimpl());
        exporter.setServiceName("cabBooking");
        exporter.setServiceInterface(CabBookingService.class);
        exporter.setService(new CabBookingServiceImpl());

        return exporter;
    }
}
