package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of evaluationType
 */ 
public class EvaluationTypeDataTable extends SchemaDataTable {

	protected EvaluationTypeDataTable(final EvaluationTypeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public EvaluationTypeData getSchemaData(final int idx) {
		return(EvaluationTypeData) super.getSchemaData(idx);
	}
}
