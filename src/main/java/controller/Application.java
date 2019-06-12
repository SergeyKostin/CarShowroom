package controller;

import model.Car;
import model.Client;
import model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private RequestRepository requestRepository;

    private List<Car> carList;

    private Set<String> modelList = new HashSet<String>();

    @Autowired
    Approve approve;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String getModel(Map<String, Object> map) {
        init();
        map.put("modelList", modelList);
        return "modelList";
    }

    @RequestMapping(value = "/getCount", method = RequestMethod.GET)
    public String getCarsByModel(Map<String, Object> map, @RequestParam("model") final String model) {
        List<Car> carList1 = this.carRepository.findByModel(model);
        map.put("carList", carList1);
        map.put("model", model);
        return "carList";
    }

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String getRequest(Map<String, Object> map, @RequestParam("model") String model, @RequestParam("goal") String goal) {
        map.put("goal", goal);
        map.put("model", model);
        return "request";
    }

    @RequestMapping(value = "/request", method = RequestMethod.POST)
    public String setRequest(Map<String, Object> map, @RequestParam("clientName") String clientName,
                             @RequestParam("clientSurname") String clientSurname,
                             @RequestParam("clientPatronymic") String clientPatronymic,
                             @RequestParam("email") String email,
                             @RequestParam("telephone") String telephone,
                             @RequestParam("goal") String goal,
                             @RequestParam("model") String model,
                             @RequestParam("dateTime") String dateTime) {
        Client client = new Client(clientName, clientPatronymic, clientSurname, email, telephone);
        Request request = new Request(client, goal, model, dateTime);
        this.clientRepository.save(client);
        approve.setApprove(requestRepository, request);
        init();
        map.put("modelList", modelList);
        return "modelList";
    }

    private void init() {
        this.carList = carRepository.findAll();
        for (Car car : carList) {
            this.modelList.add(car.getModel());
        }
        modelList = modelList.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public void run(String... strings) {
        carRepository.deleteAll();
        carRepository.save(CreateTestDateCars.getCarsListTest());
    }
}
