package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of instituteConfiguration
 */ 
public class InstituteConfigurationDataTable extends SchemaDataTable {

	protected InstituteConfigurationDataTable(final InstituteConfigurationSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public InstituteConfigurationData getSchemaData(final int idx) {
		return(InstituteConfigurationData) super.getSchemaData(idx);
	}
}
