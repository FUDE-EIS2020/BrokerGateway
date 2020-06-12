/*package icyfrog.demo.routes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class DemoRouter {

    // TODO: how to transport param in GetMapping or PostMapping

    @Value("${remote: https://www.bilibili.com/}")
    private URI bilibili;

    @Value("${remote: http://localhost:8089/test/getAllProducts}")
    private URI getAllProduct;

    @GetMapping("/getAllProducts")
    public ResponseEntity<?> proxy1(ProxyExchange<Object> proxy) throws Exception {
        return proxy.uri(getAllProduct.toString()).get();
    }

    @GetMapping("/bilibili")
    public ResponseEntity<?> proxy2(ProxyExchange<Object> proxy) throws Exception {
        return proxy.uri(bilibili.toString()).get();
    }
}



 */