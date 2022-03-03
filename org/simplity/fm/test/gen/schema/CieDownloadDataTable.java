package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of cieDownload
 */ 
public class CieDownloadDataTable extends SchemaDataTable {

	protected CieDownloadDataTable(final CieDownloadSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CieDownloadData getSchemaData(final int idx) {
		return(CieDownloadData) super.getSchemaData(idx);
	}
}
