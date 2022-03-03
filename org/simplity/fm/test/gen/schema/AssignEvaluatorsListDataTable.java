package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignEvaluatorsList
 */ 
public class AssignEvaluatorsListDataTable extends SchemaDataTable {

	protected AssignEvaluatorsListDataTable(final AssignEvaluatorsListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignEvaluatorsListData getSchemaData(final int idx) {
		return(AssignEvaluatorsListData) super.getSchemaData(idx);
	}
}
