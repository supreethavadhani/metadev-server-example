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
import org.simplity.fm.test.gen.schema.InstituteData;
import org.simplity.fm.test.gen.schema.InstituteDataTable;
/** class for form institute  */
public class InstituteForm extends Form {
	protected static final String NAME = "institute";
	protected static final String SCHEMA = "institute";
	protected static final  boolean[] OPS = {true, true, true, true, true, true};
/** constructor */
public InstituteForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public InstituteFd newFormData() {
		return new InstituteFd(this, null, null, null);
	}

	@Override
	public InstituteFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (InstituteFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public InstituteFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (InstituteFd)super.parseKeys(json, ctx);
	}

	@Override
	public InstituteFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (InstituteFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public InstituteFdt newFormDataTable() {
		return new InstituteFdt(this, null, null, null);
	}

	@Override
	public InstituteFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new InstituteFd(this, (InstituteData) schemaData, values, data);
	}

	@Override
	public InstituteFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new InstituteFdt(this, (InstituteDataTable) table, values, linkedData);
	}
}
