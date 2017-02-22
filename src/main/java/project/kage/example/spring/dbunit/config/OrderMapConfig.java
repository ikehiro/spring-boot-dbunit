package project.kage.example.spring.dbunit.config;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author papa
 *
 */
@SuppressWarnings("unused")
public class OrderMapConfig {

	private Long 注文ID;
	private String 会社コード;
	private String 顧客コード;
	private LocalDateTime 注文日;
	private String コメント;
	private BigDecimal 注文金額;

}
