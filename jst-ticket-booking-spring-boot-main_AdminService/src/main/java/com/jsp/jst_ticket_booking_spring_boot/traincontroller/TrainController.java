package com.jsp.jst_ticket_booking_spring_boot.traincontroller;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.TrainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/train")
public class TrainController {

    private TrainService trainService;

    // Enable CORS for this specific method
    @CrossOrigin(origins = "http://localhost:5173")  // Frontend URL
    @PostMapping(value = "/saveTrain")
    public ResponseStructure<Train> saveTrainService(@RequestBody Train train) {
        return trainService.saveTrainService(train);
    }

    // Enable CORS for this specific method
    @CrossOrigin(origins = "http://localhost:5173")  // Frontend URL
    @GetMapping(value = "/searchTrainBySourceDestination/{source}/{destination}")
    public ResponseStructure<List<Train>> searchTrainBySourceAndDestinationController(@PathVariable String source, @PathVariable String destination) {
        return trainService.searchTrainBySourceAndDestinationService(source, destination);
    }

    // Enable CORS for this specific method
    @CrossOrigin(origins = "http://localhost:5173")  // Frontend URL
    @GetMapping(value = "/searchTrainByNumber/{trainNumber}")
    public ResponseStructure<Train> searchTrainByNumberController(@PathVariable long trainNumber){
        return trainService.searchTrainByNumberService(trainNumber);
    }
}
