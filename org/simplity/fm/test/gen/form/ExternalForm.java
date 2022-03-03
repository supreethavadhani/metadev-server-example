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
import org.simplity.fm.test.gen.schema.ExternalData;
import org.simplity.fm.test.gen.schema.ExternalDataTable;
/** class for form external  */
public class ExternalForm extends Form {
	protected static final String NAME = "external";
	protected static final String SCHEMA = "external";
	protected static final  boolean[] OPS = {true, true, true, false, true, false};
/** constructor */
public ExternalForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ExternalFd newFormData() {
		return new ExternalFd(this, null, null, null);
	}

	@Override
	public ExternalFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ExternalFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ExternalFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ExternalFd)super.parseKeys(json, ctx);
	}

	@Override
	public ExternalFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ExternalFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ExternalFdt newFormDataTable() {
		return new ExternalFdt(this, null, null, null);
	}

	@Override
	public ExternalFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ExternalFd(this, (ExternalData) schemaData, values, data);
	}

	@Override
	public ExternalFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ExternalFdt(this, (ExternalDataTable) table, values, linkedData);
	}
}
