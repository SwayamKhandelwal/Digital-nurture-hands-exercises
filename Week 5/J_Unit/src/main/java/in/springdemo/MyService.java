package in.springdemo;

import in.springdemo.ExternalApi;

public class MyService {
    private final ExternalApi externalApi;


    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processUser(String userId) {

        externalApi.fetchDataById(userId);
    }
}