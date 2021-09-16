package sonu.techie.paymentservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import sonu.techie.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}
