package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.CieMarksData;
import org.simplity.fm.test.gen.schema.CieMarksDataTable;
/** class for form cieMarks  */
public class CieMarksForm extends Form {
	protected static final String NAME = "cieMarks";
	protected static final String SCHEMA = "cieMarks";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public CieMarksForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public CieMarksFd newFormData() {
		return new CieMarksFd(this, null, null, null);
	}

	@Override
	public CieMarksFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (CieMarksFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public CieMarksFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (CieMarksFd)super.parseKeys(json, ctx);
	}

	@Override
	public CieMarksFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (CieMarksFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public CieMarksFdt newFormDataTable() {
		return new CieMarksFdt(this, null, null, null);
	}

	@Override
	public CieMarksFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new CieMarksFd(this, (CieMarksData) schemaData, values, data);
	}

	@Override
	public CieMarksFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new CieMarksFdt(this, (CieMarksDataTable) table, values, linkedData);
	}
}
