package sonu.techie.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import sonu.techie.paymentservice.entity.Payment;
import sonu.techie.paymentservice.service.PaymentService;

import java.util.Random;


@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId){
        return service.findPaymentHistoryByOrderId(orderId);
    }
}
