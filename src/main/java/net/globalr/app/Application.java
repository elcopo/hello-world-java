package net.globalr.app;

import net.globalr.app.codJoseG.menu;
import net.globalr.app.domain.Client;

public class Application {

    public static void main(String[] args) {
       /* Client client = new Client();
        client.setId("1");
        client.setName("Juan");
        client.setPhoneNumber("04127855563");

        Client client2 = Client.builder()
                .id("2")
                .name("Jose")
                .phoneNumber("04246665774")
                .build();
        System.out.println(String.format("Client 1: %s", client.getName()));
        System.out.println(String.format("Client 2: %s", client2.getName()));*/

        menu men = new menu();
        men.meto();
    }


}
