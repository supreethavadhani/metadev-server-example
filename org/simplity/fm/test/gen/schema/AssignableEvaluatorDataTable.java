package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignableEvaluator
 */ 
public class AssignableEvaluatorDataTable extends SchemaDataTable {

	protected AssignableEvaluatorDataTable(final AssignableEvaluatorSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignableEvaluatorData getSchemaData(final int idx) {
		return(AssignableEvaluatorData) super.getSchemaData(idx);
	}
}
