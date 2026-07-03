package com.naadi.ojas.controller;

import com.naadi.ojas.dto.DemoBookingResponse;
import com.naadi.ojas.service.DemoBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/demo-bookings")
public class AdminDemoBookingController {

    private final DemoBookingService demoBookingService;

    public AdminDemoBookingController(DemoBookingService demoBookingService) {
        this.demoBookingService = demoBookingService;
    }

    @GetMapping
    public List<DemoBookingResponse> getAllBookings() {
        return demoBookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public DemoBookingResponse getBookingById(@PathVariable Long id) {
        return demoBookingService.getBookingById(id);
    }
}