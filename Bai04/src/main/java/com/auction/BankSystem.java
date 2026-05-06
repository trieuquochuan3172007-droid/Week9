package com.auction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankSystem {
    private static final Logger logger = LoggerFactory.getLogger(BankSystem.class);
    private double balance;

    public BankSystem(double initialBalance) {
        this.balance = initialBalance;
        // Sử dụng INFO cho các mốc quan trọng của hệ thống
        logger.info("Khởi tạo hệ thống ngân hàng với số dư ban đầu: {}", initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            // Parameterized logging tối ưu hiệu suất
            logger.info("Nạp tiền thành công. Số tiền: {}. Số dư mới: {}", amount, balance);
        } else {
            // Sử dụng ERROR khi có lỗi nghiệp vụ hoặc ngoại lệ
            logger.error("Phát hiện hành động nạp tiền không hợp lệ! Số tiền: {}", amount);
        }
    }
}