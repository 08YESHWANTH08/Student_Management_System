package com.yeshwanth.sms.repository;

import com.yeshwanth.sms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
