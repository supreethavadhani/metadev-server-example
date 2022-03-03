package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of staffRegistration
 */ 
public class StaffRegistrationData extends SchemaData {

	protected StaffRegistrationData(final StaffRegistrationSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StaffRegistrationData newInstance(final Object[] arr) {
		return new StaffRegistrationData((StaffRegistrationSchema) this.schema, arr);
	}
}
