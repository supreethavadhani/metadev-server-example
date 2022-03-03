package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of forgotPassword
 */ 
public class ForgotPasswordData extends SchemaData {

	protected ForgotPasswordData(final ForgotPasswordSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ForgotPasswordData newInstance(final Object[] arr) {
		return new ForgotPasswordData((ForgotPasswordSchema) this.schema, arr);
	}
}
