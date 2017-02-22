package project.kage.example.spring.dbunit.common;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;

public class FieldNameConstants {
	private static HashMap<String, Meta> map = new HashMap<>();
	private static FieldNameConstants constant = new FieldNameConstants();

	public static final Meta 注文ID = new Meta("注文ID", Long.class, 10);
	public static final Meta 会社コード = new Meta("会社コード", String.class, 4);
	public static final Meta 顧客コード = new Meta("顧客コード", String.class, 10);
	public static final Meta 注文日 = new Meta("注文日", LocalDateTime.class, "YYYYMMDD");
	public static final Meta コメント = new Meta("コメント", String.class, 4000);
	public static final Meta 注文金額 = new Meta("注文金額", BigDecimal.class, 13, 4);

	// Singleton.
	private FieldNameConstants() {
	}

	private static FieldNameConstants getInstance() {
		return constant;
	}

	public static Meta getMeta(final String name) {
		if (map.size() == 0) {
			initializeMap();
		}

		return map.get(name);
	}

	private static void initializeMap() {

		Field[] fields = getInstance().getClass().getDeclaredFields();

		Arrays.asList(fields).forEach(field -> {
			if (!field.getType().equals(Meta.class)) {
				return;
			}
			try {
				Meta meta = (Meta) field.get(Meta.class);
				map.put(field.getName(), meta);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		});

	}
}
