package co.arq.tiopipe.api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
//    private final MyUseCase useCase;


    @GetMapping(path = "/health")
    public String health() {
//      return useCase.doAction();
        return "Hello World...........";
    }
    
    @GetMapping(path = "/listPlatos")
    public String listaPlatos() {
//      return useCase.doAction();
        return "listPlatos";
    }
    
    @GetMapping(path = "/listIngredientes")
    public String listaIngredientes() {
//      return useCase.doAction();
        return "listIngredientes";
    }
    
    @GetMapping(path = "/ventasMes")
    public String ventasMes() {
//      return useCase.doAction();
        return "Hello World...........";
    }
    
    @GetMapping(path = "/consultaFactura")
    public String consultaFactura() {
//      return useCase.doAction();
        return "consultaFactura";
    }
    
}
