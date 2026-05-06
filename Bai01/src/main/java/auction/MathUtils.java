package auction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Khởi tạo logger cho class này
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        // Sử dụng structured logging
        logger.info("Đang thực hiện phép cộng: {} + {}", a, b);
        return a + b;
    }
}