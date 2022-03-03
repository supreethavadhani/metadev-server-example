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
import org.simplity.fm.test.gen.schema.EligibilityListData;
import org.simplity.fm.test.gen.schema.EligibilityListDataTable;
/** class for form eligibilityList  */
public class EligibilityListForm extends Form {
	protected static final String NAME = "eligibilityList";
	protected static final String SCHEMA = "eligibilityList";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public EligibilityListForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public EligibilityListFd newFormData() {
		return new EligibilityListFd(this, null, null, null);
	}

	@Override
	public EligibilityListFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (EligibilityListFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public EligibilityListFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (EligibilityListFd)super.parseKeys(json, ctx);
	}

	@Override
	public EligibilityListFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (EligibilityListFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public EligibilityListFdt newFormDataTable() {
		return new EligibilityListFdt(this, null, null, null);
	}

	@Override
	public EligibilityListFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new EligibilityListFd(this, (EligibilityListData) schemaData, values, data);
	}

	@Override
	public EligibilityListFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new EligibilityListFdt(this, (EligibilityListDataTable) table, values, linkedData);
	}
}
