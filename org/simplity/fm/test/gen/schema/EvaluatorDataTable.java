package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of evaluator
 */ 
public class EvaluatorDataTable extends SchemaDataTable {

	protected EvaluatorDataTable(final EvaluatorSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public EvaluatorData getSchemaData(final int idx) {
		return(EvaluatorData) super.getSchemaData(idx);
	}
}
