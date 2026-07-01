package com.example.schedule.controller;

import com.example.schedule.dto.CreateScheduleRequest;
import com.example.schedule.dto.ScheduleResponse;
import com.example.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ScheduleResponse create(@RequestBody CreateScheduleRequest request){
        return scheduleService.create(request);
    }
    @GetMapping
    public List<ScheduleResponse> findAll(){
        return scheduleService.findAll();
    }
    @GetMapping("/{id}")
    public ScheduleResponse findById(@PathVariable Long id){
        return scheduleService.findById(id);
    }
    @PutMapping("/{id}")
    public ScheduleResponse update(
            @PathVariable Long id,
            @RequestBody CreateScheduleRequest request
    ){
        return scheduleService.update(id, request);
    }
}
