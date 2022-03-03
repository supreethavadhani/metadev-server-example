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
import org.simplity.fm.test.gen.schema.ApprovalData;
import org.simplity.fm.test.gen.schema.ApprovalDataTable;
/** class for form approval  */
public class ApprovalForm extends Form {
	protected static final String NAME = "approval";
	protected static final String SCHEMA = "approval";
	protected static final  boolean[] OPS = {true, false, true, false, true, false};
/** constructor */
public ApprovalForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ApprovalFd newFormData() {
		return new ApprovalFd(this, null, null, null);
	}

	@Override
	public ApprovalFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ApprovalFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ApprovalFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ApprovalFd)super.parseKeys(json, ctx);
	}

	@Override
	public ApprovalFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ApprovalFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ApprovalFdt newFormDataTable() {
		return new ApprovalFdt(this, null, null, null);
	}

	@Override
	public ApprovalFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ApprovalFd(this, (ApprovalData) schemaData, values, data);
	}

	@Override
	public ApprovalFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ApprovalFdt(this, (ApprovalDataTable) table, values, linkedData);
	}
}
