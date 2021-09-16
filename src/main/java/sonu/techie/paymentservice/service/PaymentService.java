package sonu.techie.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sonu.techie.paymentservice.entity.Payment;
import sonu.techie.paymentservice.respository.PaymentRepository;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository  paymentRepository;

    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
    return paymentRepository.save(payment);
    }

    public String paymentProcessing(){
        return new Random().nextBoolean()?"success": "false";
    }

    public Payment findPaymentHistoryByOrderId(int orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
