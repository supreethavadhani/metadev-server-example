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
import org.simplity.fm.test.gen.schema.OfferedSubjectListData;
import org.simplity.fm.test.gen.schema.OfferedSubjectListDataTable;
/** class for form offeredSubjectList  */
public class OfferedSubjectListForm extends Form {
	protected static final String NAME = "offeredSubjectList";
	protected static final String SCHEMA = "offeredSubjectList";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public OfferedSubjectListForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public OfferedSubjectListFd newFormData() {
		return new OfferedSubjectListFd(this, null, null, null);
	}

	@Override
	public OfferedSubjectListFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (OfferedSubjectListFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public OfferedSubjectListFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (OfferedSubjectListFd)super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSubjectListFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (OfferedSubjectListFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public OfferedSubjectListFdt newFormDataTable() {
		return new OfferedSubjectListFdt(this, null, null, null);
	}

	@Override
	public OfferedSubjectListFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new OfferedSubjectListFd(this, (OfferedSubjectListData) schemaData, values, data);
	}

	@Override
	public OfferedSubjectListFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new OfferedSubjectListFdt(this, (OfferedSubjectListDataTable) table, values, linkedData);
	}
}
