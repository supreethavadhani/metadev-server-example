package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of terminalExam
 */ 
public class TerminalExamDataTable extends SchemaDataTable {

	protected TerminalExamDataTable(final TerminalExamSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public TerminalExamData getSchemaData(final int idx) {
		return(TerminalExamData) super.getSchemaData(idx);
	}
}
