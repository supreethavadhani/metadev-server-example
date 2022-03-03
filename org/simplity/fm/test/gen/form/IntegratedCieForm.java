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
import org.simplity.fm.test.gen.schema.IntegratedCieData;
import org.simplity.fm.test.gen.schema.IntegratedCieDataTable;
/** class for form integratedCie  */
public class IntegratedCieForm extends Form {
	protected static final String NAME = "integratedCie";
	protected static final String SCHEMA = "integratedCie";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public IntegratedCieForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public IntegratedCieFd newFormData() {
		return new IntegratedCieFd(this, null, null, null);
	}

	@Override
	public IntegratedCieFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (IntegratedCieFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public IntegratedCieFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (IntegratedCieFd)super.parseKeys(json, ctx);
	}

	@Override
	public IntegratedCieFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (IntegratedCieFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public IntegratedCieFdt newFormDataTable() {
		return new IntegratedCieFdt(this, null, null, null);
	}

	@Override
	public IntegratedCieFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new IntegratedCieFd(this, (IntegratedCieData) schemaData, values, data);
	}

	@Override
	public IntegratedCieFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new IntegratedCieFdt(this, (IntegratedCieDataTable) table, values, linkedData);
	}
}
