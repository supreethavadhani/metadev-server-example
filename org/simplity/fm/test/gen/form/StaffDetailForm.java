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
import org.simplity.fm.test.gen.schema.StaffDetailData;
import org.simplity.fm.test.gen.schema.StaffDetailDataTable;
/** class for form staffDetail  */
public class StaffDetailForm extends Form {
	protected static final String NAME = "staffDetail";
	protected static final String SCHEMA = "staffDetail";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public StaffDetailForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public StaffDetailFd newFormData() {
		return new StaffDetailFd(this, null, null, null);
	}

	@Override
	public StaffDetailFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (StaffDetailFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public StaffDetailFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (StaffDetailFd)super.parseKeys(json, ctx);
	}

	@Override
	public StaffDetailFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (StaffDetailFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public StaffDetailFdt newFormDataTable() {
		return new StaffDetailFdt(this, null, null, null);
	}

	@Override
	public StaffDetailFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new StaffDetailFd(this, (StaffDetailData) schemaData, values, data);
	}

	@Override
	public StaffDetailFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new StaffDetailFdt(this, (StaffDetailDataTable) table, values, linkedData);
	}
}
