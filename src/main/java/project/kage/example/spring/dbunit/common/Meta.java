package project.kage.example.spring.dbunit.common;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Meta {

	public final String name;
	public final Class<?> clazz;
	public final int length;
	public final int precision;
	public final String format;

	public Meta(final String name, final Class<?> clazz, final int length, final int precision, final String format) {
		this.name = name;
		this.clazz = clazz;
		this.length = length;
		this.precision = precision;
		this.format = format;
	}

	public Meta(final String name, final Class<BigDecimal> clazz, final int length, final int precision) {
		this.name = name;
		this.clazz = clazz;
		this.length = length;
		this.precision = precision;
		this.format = null;
	}

	public Meta(final String name, final Class<?> clazz, final int length) {
		if (!clazz.equals(Long.class) && !clazz.equals(String.class)) {
			throw new IllegalArgumentException("The clazz requriring type is String or Long.");
		}

		this.name = name;
		this.clazz = clazz;
		this.length = length;
		this.precision = 0;
		this.format = null;
	}

	public Meta(final String name, final Class<LocalDateTime> clazz, final String format) {
		this.name = name;
		this.clazz = clazz;
		this.length = format.length();
		this.precision = 0;
		this.format = format;
	}

}
