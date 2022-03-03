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
import org.simplity.fm.test.gen.schema.SelectableTestData;
import org.simplity.fm.test.gen.schema.SelectableTestDataTable;
/** class for form selectableTest  */
public class SelectableTestForm extends Form {
	protected static final String NAME = "selectableTest";
	protected static final String SCHEMA = "selectableTest";
	protected static final  boolean[] OPS = {false, false, false, false, true, true};
/** constructor */
public SelectableTestForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SelectableTestFd newFormData() {
		return new SelectableTestFd(this, null, null, null);
	}

	@Override
	public SelectableTestFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SelectableTestFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SelectableTestFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SelectableTestFd)super.parseKeys(json, ctx);
	}

	@Override
	public SelectableTestFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SelectableTestFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SelectableTestFdt newFormDataTable() {
		return new SelectableTestFdt(this, null, null, null);
	}

	@Override
	public SelectableTestFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SelectableTestFd(this, (SelectableTestData) schemaData, values, data);
	}

	@Override
	public SelectableTestFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SelectableTestFdt(this, (SelectableTestDataTable) table, values, linkedData);
	}
}
