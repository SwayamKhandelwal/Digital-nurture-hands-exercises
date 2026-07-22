

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import in.springdemo.ExternalApi;
import in.springdemo.MyService;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteractionWithSpecificArgument() {

        ExternalApi mockApi = mock(ExternalApi.class);


        MyService service = new MyService(mockApi);


        service.processUser("user-123");


        verify(mockApi).fetchDataById("user-123");
    }
}