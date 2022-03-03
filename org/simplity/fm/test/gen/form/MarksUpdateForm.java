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
import org.simplity.fm.test.gen.schema.MarksUpdateData;
import org.simplity.fm.test.gen.schema.MarksUpdateDataTable;
/** class for form marksUpdate  */
public class MarksUpdateForm extends Form {
	protected static final String NAME = "marksUpdate";
	protected static final String SCHEMA = "marksUpdate";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
/** constructor */
public MarksUpdateForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public MarksUpdateFd newFormData() {
		return new MarksUpdateFd(this, null, null, null);
	}

	@Override
	public MarksUpdateFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MarksUpdateFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MarksUpdateFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MarksUpdateFd)super.parseKeys(json, ctx);
	}

	@Override
	public MarksUpdateFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MarksUpdateFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MarksUpdateFdt newFormDataTable() {
		return new MarksUpdateFdt(this, null, null, null);
	}

	@Override
	public MarksUpdateFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MarksUpdateFd(this, (MarksUpdateData) schemaData, values, data);
	}

	@Override
	public MarksUpdateFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MarksUpdateFdt(this, (MarksUpdateDataTable) table, values, linkedData);
	}
}
